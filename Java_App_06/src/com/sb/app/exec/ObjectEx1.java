package com.sb.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.ScoreVO;

public class ObjectEx1 {
	public static void main(String[] args) {
		ScoreVO scVO = new ScoreVO();
		scVO.setStNum(1);
		scVO.setIntKor(90);
		scVO.setIntEng(30);
		scVO.setIntEng(0);
		
		ScoreVO[] scVOs = new ScoreVO[5];
		scVOs[0] = new ScoreVO();
		scVOs[0].setStNum(100);
		scVOs[0].setIntKor(50);
		scVOs[0].setIntEng(60);
		scVOs[0].setIntMath(80);

		List<ScoreVO> list = new ArrayList<>();
		ScoreVO scVO1 = new ScoreVO();
		scVO1.setStNum(1);
		scVO1.setIntKor(90);
		scVO1.setIntEng(30);
		scVO1.setIntEng(0);
		
		scVO1 = new ScoreVO();
		scVO1.setStNum(1);
		scVO1.setIntKor(90);
		scVO1.setIntEng(30);
		scVO1.setIntEng(0);
	}
}
