package com.sb.web.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.sb.web.domain.StudentVO;
import com.sb.web.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	// 학생데이터들을 저장할 배열변수
	private StudentVO[] stArr;
	// 학생데이터가 저장된 text file 이름
	private String stFile;

	private StudentServiceImplV1() {

	}

	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stArr = new StudentVO[length];
		for (int i = 0; i < this.stArr.length; i++) {
			this.stArr[i] = new StudentVO();
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public void loadStudent() {

		InputStream is = null;
		try {
			is = new FileInputStream(this.stFile); //Open and Read Metadata
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(stFile + "파일을 찾을 수 없습니다.");
			return;
		}
		
		
		Scanner scan = new Scanner(is);
		
		/*
		while (true) {
			boolean bYes = scan.hasNext();
			if (bYes == false) {
				break;
			}
			String stLine = scan.nextLine();
			System.out.println(stLine);
		}*/
		
		int index = 0;
		while(scan.hasNext()) {
			String stLine = scan.nextLine();
			//System.out.println(stLine);
			String[] stInfos = stLine.split(":");
			
			System.out.println("학번 : " + stInfos[0]);
			System.out.println("이름 : " + stInfos[1]);
			System.out.println("학년 : " + stInfos[2]);
			System.out.println("반 : " + stInfos[3]);
			System.out.println("학과 : " + stInfos[4]);
			System.out.println("주소 : " + stInfos[5]);
			System.out.println();
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[3]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);
			
			stArr[index++] = stVO;
		} // end while 
		this.printStudents();
	} // end loadStudent
	
	private void printStudents() {
		/*
		 * for (int i = 0; i < stArr.length; i++) {
		 * System.out.println(stArr[i].toString()); }
		 */
		
		for(StudentVO vo : stArr) {
			System.out.println(vo.toString());
		}
	}
	
	/*
	 * public Object getArr() { InputStream is = null; try { is = new
	 * FileInputStream(this.stFile); } catch (FileNotFoundException e) {
	 * e.printStackTrace(); System.out.println(stFile + "파일을 찾을 수 없습니다."); return
	 * null; }
	 * 
	 * Scanner scan = new Scanner(is); String[] arr = new String[50];
	 * 
	 * int i = 0; while (scan.hasNext()) { String stLine = scan.nextLine(); arr[i] =
	 * stLine; i++; } return arr; }
	 */
	
///////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public StudentVO[] getStudents() {

		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {

		return null;
	}

}
