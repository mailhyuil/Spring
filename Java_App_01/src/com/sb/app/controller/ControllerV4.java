package com.sb.app.controller;

import java.util.Arrays;

import com.sb.app.service.ServiceV4;

public class ControllerV4 {
	public static void main(String[] args) {
		int[] scoreList = new int[10];

		ServiceV4 sV4 = new ServiceV4(scoreList);
		// 제어권이 서비스에서 컨트롤러로 바뀌다.
		
		sV4.makeScore();
		System.out.println(Arrays.toString(scoreList));
	}
}
