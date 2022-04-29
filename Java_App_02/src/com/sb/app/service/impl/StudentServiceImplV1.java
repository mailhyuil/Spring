package com.sb.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sb.app.domain.StudentVO;
import com.sb.app.service.StudentService;
import com.sb.app.utils.IndexInfo;

public class StudentServiceImplV1 implements StudentService {
	
	private final List<StudentVO> stList;
	private final String stFileName;
	
	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}
	
	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		this.stList = stList;
		this.stFileName = stFileName;
	}
	
	@Override
	public void loadStudent() {
		// is 객체 선언
		InputStream is = null;
		
		try {
			// stFileName을 열어서 InputStream으로 변환
			is = new FileInputStream(this.stFileName);
			
		} catch (FileNotFoundException e) {
			System.out.println(stFileName + "파일을 찾을 수 없습니다.");
			return;
		}
		// file정보가 담긴 is 객체를 Scanner와 연결
		Scanner fileRead = new Scanner(is); //Scanner에 파일을 연결
		// Scanner를 통하여 file을 읽기
		while(fileRead.hasNext()) {
			String stLine = fileRead.nextLine();
			String[] stInfo = stLine.split(":");
			
			String stNum = stInfo[IndexInfo.ST.ST_NUM];
			String stName = stInfo[IndexInfo.ST.ST_NAME];
			String stDept = stInfo[IndexInfo.ST.ST_DEPT];
			String stGrade = stInfo[IndexInfo.ST.ST_GRADE];
			int intGrade = Integer.parseInt(stGrade);
			String stAddr = stInfo[IndexInfo.ST.ST_ADDR];
			String stTel = stInfo[IndexInfo.ST.ST_TEL];
			
			// VO 클래스의 필드생성자를 사용하여 값이 담긴 stVO 생성
			StudentVO stVO = new StudentVO(stNum, stName, intGrade, stDept, stAddr, stTel);
			
			stList.add(stVO);
			
		} //end while
		try {
			is.close(); //외부 자원이기 때문에 연결을 해제해줘야한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileRead.close(); //외부 자원이기 때문에 연결을 해제해줘야한다.
		
	}

	@Override
	public List<StudentVO> getStudents() {
		return this.stList;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		return null;
	}

}
