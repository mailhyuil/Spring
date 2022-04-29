package com.sb.web.service;

import com.sb.web.domain.StudentVO;

/* StudentService가 할일
 * 1. student.txt 파일을 읽어서 학생데이터들 만들기
 * 2. 생선된 학생데이터들을 리턴해주기
 * 3. 학번을 인자로 받아서 해당 학생데이터를 리턴해주기 
 */
public interface StudentService {
	/*
	 * 추상 메서드 메서드의 접근제한자(public), 메서드의 이름, 인수(argument),return 타입 정의
	 */
	public void loadStudent();
	public StudentVO[] getStudents();
	// stNum 학번을 학생데이터들에서 찾아서(findByNum) 학생데이터를 리턴
	public StudentVO findByNum (String stNum);
}
