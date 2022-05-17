package com.sb.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sb.app.model.ScoreVO;
import com.sb.app.service.ScoreService;

public class ScoreServiceImplV1A implements ScoreService {
	protected final List<ScoreVO> scList;
	protected final Scanner scan;
	
	public ScoreServiceImplV1A() {
		scList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputScore() {
		while(true) {
			
		System.out.print("이름을 입력하세요 (QUIT=종료) > ");
		String name = scan.nextLine();
		if(name.equals("QUIT")) {
			break;
		}
		System.out.print("국어점수를 입력하세요 (QUIT=종료) > ");
		String kor = scan.nextLine();
		if(kor.equals("QUIT")) {
			break;
		}
		System.out.print("영어점수를 입력하세요 (QUIT=종료) > ");
		String eng = scan.nextLine();
		if(eng.equals("QUIT")) {
			break;
		}
		System.out.print("수학점수를 입력하세요 (QUIT=종료) > ");
		String math = scan.nextLine();
		if(math.equals("QUIT")) {
			break;
		}
		
		int iKor = Integer.parseInt(kor);
		int iEng = Integer.parseInt(eng);
		int iMath = Integer.parseInt(math);
		
		ScoreVO scVO = new ScoreVO();
		
		scVO.setStName(name);
		scVO.setIntKor(iKor);
		scVO.setIntEng(iEng);
		scVO.setIntMath(iMath);
		
		scList.add(scVO);
		}
		System.out.println("종료되었습니다.");
	}

	@Override
	public void saveScore() {
		
	}

}
