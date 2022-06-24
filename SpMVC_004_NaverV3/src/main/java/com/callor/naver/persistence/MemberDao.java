package com.callor.naver.persistence;

import java.util.List;

import com.callor.naver.model.MemberVO;

public interface MemberDao extends GenericDao<MemberVO, String>{
	public List<MemberVO> findByName(String name);
	public List<MemberVO> findByTel(String tel);
	/*
	 * List가 아닌 VO를 return type으로 갖는 findByEmail method 구현
	 * 이 method가 잘 작동이 되기 위해서는
	 * Entity 설계를 할때 email 칼럼은 반드시 unique 설정이 되어 있어야 한다
	 * 좀더 정확한 설정을 위하여 not null 설정도 같이 하는 것이 좋다
	 * 
	 */
	public MemberVO findByEmail(String email);
	/*
	 * 회원의 id찾기 기능을 위하여 
	 * 전화번호와 email을 사용하여 username을 조회할 수 있는 메서드
	 * 
	 * Entity 설게를 할때
	 * UNIQUE(email, tel) 형식으로 제약조건을 설정할 필요가 있다.
	 * email + tel 형식의 값이 절대 중복되지 않아야 한다.
	 * 
	 */
	public MemberVO findByEmailAndTel(String email, String tel);
}
