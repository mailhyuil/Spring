package com.sb.school.service;

import com.sb.school.model.UserVO;
import com.sb.school.persistance.GenericDao;

public interface UserService extends GenericDao<UserVO, String>{
	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);
}
