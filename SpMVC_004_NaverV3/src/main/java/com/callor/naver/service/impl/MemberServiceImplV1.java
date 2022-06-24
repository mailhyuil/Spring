package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.MemberVO;
import com.callor.naver.service.MemberService;
<<<<<<< HEAD
=======

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
@Service(QualifierConfig.SERVICE.MEMBER_V1)
public class MemberServiceImplV1 implements MemberService{

	@Override
	public List<MemberVO> findByName(String name) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<MemberVO> findByTel(String tel) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
<<<<<<< HEAD
	public MemberVO findByEmail(String email) {
=======
	public MemberVO fineByEmail(String email) {
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public MemberVO findByEmailAndTel(String email, String tel) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<MemberVO> selectAll() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public MemberVO findById(String id) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public int insert(MemberVO vo) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return 0;
	}

	@Override
	public int delete(String id) {
<<<<<<< HEAD
		return 0;
	}
	
=======
		// TODO Auto-generated method stub
		return 0;
	}

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
