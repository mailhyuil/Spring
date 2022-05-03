package com.sb.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.ScoreVO;
import com.sb.app.service.ScoreService;
import com.sb.app.utils.Line;

public class ScoreServiceImplV1 implements ScoreService {

	private final List<ScoreVO> scList;

	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		int size = scList.size();
		for (int i = 0; i < 20; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			ScoreVO scVO = new ScoreVO();
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);

			scList.add(scVO);
		}
	}

	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;

		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));

		int[] intTotal = new int[4];
		int KOR = 0;
		int ENG = 1;
		int MATH = 2;
		int SUM = 3;

		for (int i = 0; i < size; i++) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%3d\t", scVO.getIntRank());
			System.out.printf("%3d\t", scVO.getIntKor());
			System.out.printf("%3d\t", scVO.getIntEng());
			System.out.printf("%3d\t", scVO.getIntMath());
			System.out.printf("%3d\t", scVO.getIntSum());
			System.out.printf("%5.2f\t", scVO.getfAvg());

			intTotal[KOR] += scVO.getIntKor();
			intTotal[ENG] += scVO.getIntEng();
			intTotal[MATH] += scVO.getIntMath();
			intTotal[SUM] += scVO.getIntSum();

		}
		System.out.println(Line.sLine(lineLength));
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%5.2f\n");
	}

}
