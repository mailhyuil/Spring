package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.UserVO;

public interface UserDao extends GenericDao<UserVO, String>{
	public List<UserVO> findByName(String name);
	public List<UserVO> findByNickName(String nickName);
	
	/*
	 * unique는 list로 뽑을 필요없다
	 */
	
	public UserVO findByEmail(String email);
	public void create_user_table();
	
}
