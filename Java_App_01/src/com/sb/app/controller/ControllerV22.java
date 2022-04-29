package com.sb.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.service.ServiceV2;

public class ControllerV22 {
	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		ServiceV2 sV2 = new ServiceV2(scoreList);

		sV2.getScore(10);
		scoreList = sV2.getScore(5);
		System.out.println(scoreList);
		System.out.println(sV2.getScore(1));
		System.out.println(scoreList);
		
		
	}
}
