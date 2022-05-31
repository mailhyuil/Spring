package com.sb.school.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sb.school.model.UserVO;
import com.sb.school.persistance.UserDao;
import com.sb.school.service.UserService;
/*
 * UserServiceImplV1 클래스를 Component(bean)으로 등록
 */
@Service("userServiceV1")
public class UserServiceImplV1 implements UserService {
	// security-context.xml에 설정된 bean 불러오기
	protected final PasswordEncoder pass;
	protected final UserDao userDao;
	
	public UserServiceImplV1(UserDao userDao, PasswordEncoder pass) {
		this.pass = pass;
		this.userDao = userDao;
	}
	
/*
 * 1. login.form에서 username과 password 받기
 * 2. userVO에 담겨서 받게 된다
 * 3. userVO UserService.login에게 전달한다
 * 4. UserService.login() method 는 username과 password 검사
 * 5. 정상적인(username, password가 일치) 정보이면
 * 6. 나머지 user 정보를 userVO에 담아서 return
 * 7. 만약 정상적인 사용자가 아니면 null을 return
 * 8. Controller.login.POST method에는 HttpSession 클래스를 매개변수로 설정한다.
 * 9. 정상 사용자정보이면(userVO가 null이 아니면)
 * 10. setAttribute를 사용하여 사용자 정보를 변수에 setting 한다.
 * 11. 정상 사용자가 아니면 removeAttribute를 사용
 */
	@Override
	public UserVO login(UserVO userVO) {

		return null;
	}

	@Override
	public UserVO join(UserVO userVO) {
		// 회원가입한 user의 정보를 저장하기 전에
		// 비밀번호를 암호화
		String encPassword = pass.encode(userVO.getPassword());
		userVO.setPassword(encPassword);
		
		List<UserVO> userList = userDao.selectAll();

		if(userList == null || userList.size() < 1) {
			userVO.setRole("ADMIN");
		} else {
			userVO.setRole("USER");
		}
		userDao.insert(userVO);
		return null;
	}
	
/*//////////////////////////////////////////////////////////////////////*/
	
	@Override
	public List<UserVO> selectAll() {
		return null;
	}

	@Override
	public UserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public int insert(UserVO vo) {
		return 0;
	}

	@Override
	public int update(UserVO vo) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

}
