package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.USER_V2)
public class UserServiceImplV2 extends UserServiceImplV1{
	
	@Autowired
	protected PasswordEncoder passwordEncoder;
	
	@Override
	public int join(UserVO userVO) {
		List<UserVO> users = userDao.selectAll();
		
		if(users == null || users.size()<1) {
			userVO.setRole("ADMIN");
		} else {
			userVO.setRole("GUEST");
		}
		
		UserVO email = userDao.findByEmail(userVO.getEmail());
		
		if(email != null) {
			return -1;
		}
		
		// password를 암호화 
		String planPassword = userVO.getPassword();
		String encPassword = passwordEncoder.encode(planPassword);
		
		// 암호화된 password를 다시 VO에 setting
		userVO.setPassword(encPassword);
		
		userDao.insert(userVO);
		return 0;
	}

	@Override
	public UserVO login(UserVO userVO) {
		UserVO loginUser = userDao.findById(userVO.getUsername());
		String encPassword = loginUser.getPassword();
		String planPassword = userVO.getPassword();
		
		if(passwordEncoder.matches(planPassword, encPassword)) {
			return loginUser;
		}
		return null;
	}
	
	

}
