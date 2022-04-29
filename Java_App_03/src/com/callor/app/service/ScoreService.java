package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

public class ScoreService {
	List<ScoreVO> list;
	
	public ScoreService() {
		list = new ArrayList<>();
	}
	
	public void makeScore(int length) {

		for (int i = 0; i < length; i++) {
			int kor = (int)(Math.random()*50 +50);
			int eng = (int)(Math.random()*50 +50);
			int math = (int)(Math.random()*50 +50);
			
			ScoreVO service= new ScoreVO();
			service.setKor(kor);
			service.setEng(eng);
			service.setMath(math);
			service.setSum();
			service.setAvg();

			list.add(service);
		}

	}
	
	public void scorePrint() {
		int size = list.size();
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int total = 0;
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		for (int i = 0; i < size; i++) {
			System.out.print((i+1)+"\t");
			System.out.print(list.get(i).getKor()+"\t");
			System.out.print(list.get(i).getEng()+"\t");
			System.out.print(list.get(i).getMath()+"\t");
			System.out.print(list.get(i).getSum()+"\t");
			System.out.printf("%.2f\n",list.get(i).getAvg());
			korSum += list.get(i).getKor();
			engSum += list.get(i).getEng();
			mathSum += list.get(i).getMath();
			total += list.get(i).getSum();
		}
		System.out.println(Line.dLine(50));
		System.out.printf("총점\t%d\t%d\t%d\t%d",korSum, engSum, mathSum, total);
	}
}
