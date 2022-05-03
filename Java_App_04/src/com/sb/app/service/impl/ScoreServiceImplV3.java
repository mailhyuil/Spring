package com.sb.app.service.impl;

import com.sb.app.model.ScoreVO;
import com.sb.app.utils.Line;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {
	
	
	
	public ScoreServiceImplV3() {
		/*
		 * super() method
		 * 상속받은(V2) 클래스의 기본생성자를 호출하여
		 * protected로 선언된 변수들을 초기화
		 */
		super();
	}
	
	@Override
	public void printScore() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적 일람표");
		System.out.println(Line.sLine(lineLength));
		for(String sub :subs) {
			System.out.print(sub+"\t");
		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		
		for(ScoreVO scVO : scList) {
			System.out.println(scVO.toString());
		}
	}
}
