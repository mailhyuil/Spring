package com.sb.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {
	// 클래스타입변수에는 final을 사용해주는게 좋다.
	private final List<Integer> intList;
	public final int num;
	private final int[] arrNum;

	public ServiceV1() {
		// final로 선언하면 생성자에서 한번 선언 가능
		// intList는 final로 선언되어 있기 때문에
		// 다시 초기화 할 수 없다.
		// 
		intList = new ArrayList<>();
		num = 0;
		arrNum = new int[10];
	}

	public void makeScore() {
		for (int i = 0; i < 10; i++) {
			arrNum[i] = i;
			Integer rnd = (int) (Math.random() * 100 + 1);
			intList.add(rnd);

		}
	}

	public int[] getArrNum() {
		return arrNum;
	}

	public List<Integer> getIntList() {
		return intList;
	}

}
