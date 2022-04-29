package com.sb.web.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.sb.web.domain.StudentVO;

public class ListEx2 {
	public static void main(String[] args) {
		
		List<StudentVO> stList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			StudentVO vo = new StudentVO();
			
			int intNum = (int)(Math.random() * 100) + 1;
			int intGrade = (intNum % 4) + 1;
			
			String strNum = String.format("%02d", i+1);
			String strGrade = intGrade + "";
			
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			System.out.println(vo.toString());
			
			stList.add(vo);	
		}		
	}
}
