package com.sb.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.app.domain.StudentVO;
import com.sb.app.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {
	// 웹앱에서는 Service 클래스 필드영역에 변수를 선언하지 않는다.
	
	// TODO 학생데이터를 추가하기
	@Override
	public int insert(StudentVO studentVO) {
		
		return 0;
	}
	
	
	// TODO 학생데이터 아이디로 조회하기
	@Override
	public StudentVO findById(String stNum) {
		
		return null;
	}

	@Override
	public List<StudentVO> selectAll() {
		List<StudentVO> stList = new ArrayList<>();
		
		StudentVO stVO = new StudentVO();
		stVO.setStNum("00001");
		stVO.setStName("홍길동");
		stVO.setStDept("컴공과");
		stVO.setStGrade(3);
		stVO.setStAddr("서울특별시");
		stList.add(stVO);
		
		/*
		 * VO데이터를 사용하여 새로운 학생정보를 리스트에 추가하기 위해서는
		 * 반드시 VO를 다시 생성해주어야 한다.
		 */
		stVO = new StudentVO(); //stVO 다시 생성
		stVO.setStNum("00002");
		stVO.setStName("이몽룡");
		stVO.setStDept("전자과");
		stVO.setStGrade(2);
		stVO.setStAddr("광주광역시");
		stList.add(stVO);		
	
		stVO = new StudentVO(); //stVO 다시 생성
		stVO.setStNum("00003");
		stVO.setStName("성춘향");
		stVO.setStDept("법학과");
		stVO.setStGrade(1);
		stVO.setStAddr("부산광역시");
		stList.add(stVO);		

		stVO = new StudentVO(); //stVO 다시 생성
		stVO.setStNum("00004");
		stVO.setStName("임꺽정");
		stVO.setStDept("체육과");
		stVO.setStGrade(4);
		stVO.setStAddr("전주시");
		stList.add(stVO);	
		
		stVO = new StudentVO(); //stVO 다시 생성
		stVO.setStNum("00005");
		stVO.setStName("장보고");
		stVO.setStDept("해양생물학과");
		stVO.setStGrade(1);
		stVO.setStAddr("완도군");
		stList.add(stVO);
		
		return stList;
	}

}
