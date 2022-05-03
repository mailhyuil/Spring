package com.sb.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.ScoreVO;
import com.sb.app.service.ScoreService;
import com.sb.app.utils.Line;

public class ScoreServiceImplV2 implements ScoreService {
	protected int stCount = 0;
	protected final List<ScoreVO> scList;
	
	protected int lineLength = 50;
	protected final String[] subs;
	
	public ScoreServiceImplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		subs = new String[]{ "학번", "국어", "영어", "수학", "총점", "평균" };
	}

	private int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	@Override
	public void makeScore() {
		for (int i = 0; i < stCount; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setIntRank(i + 1);
			scVO.setIntKor(getScore());
			scVO.setIntEng(getScore());
			scVO.setIntMath(getScore());
			scList.add(scVO);
		}
	}

	@Override
	public void printScore() {


		System.out.println(Line.dLine(lineLength));
		System.out.println("학생 성적 처리");
		System.out.println(Line.sLine(lineLength));
		for (String sub : subs) {
			System.out.println(sub + "\t");

		}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		for (ScoreVO scVO : scList) {
			System.out.println(scVO.getIntRank() + "\t");
			System.out.println(scVO.getIntKor() + "\t");
			System.out.println(scVO.getIntEng() + "\t");
			System.out.println(scVO.getIntMath() + "\t");
			System.out.println(scVO.getIntSum() + "\t");
			System.out.println(scVO.getfAvg() + "\n");
			korTotal += scVO.getIntKor();
			engTotal += scVO.getIntEng();
			mathTotal += scVO.getIntMath();
			sumTotal += scVO.getIntSum();

		}
		System.out.printf("%5d\t", korTotal);
	}
}
