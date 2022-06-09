package com.sb.school.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sb.school.model.UserVO;
import com.sb.school.persistance.UserDao;

@Service("userServiceV2")
public class UserServiceImplV2 extends UserServiceImplV1 {

	//V1 의 생성자 호출하기
	public UserServiceImplV2(UserDao userDao, PasswordEncoder pass) {
		super(userDao, pass);
	}
	
	@Override
	public UserVO login(UserVO userVO) {
	String username = userVO.getUsername();
	String password = userVO.getPassword();
	
	UserVO joinUserVO = userDao.findById(username);
	
	if(joinUserVO != null) {
		boolean bYes = pass.matches(password, joinUserVO.getPassword());
		// 비밀번호가 일치하지 않으면 null값을 리턴하고
		// 종료하기
		if(bYes == false) {
			return null;
		}
	}
	// 정상 로그인되면 joinUserVO에는 사용자 정보데이터가 담기고
	// 그렇지 않으면 null값이 담겨 있다.
	
	return joinUserVO;
	}
}
