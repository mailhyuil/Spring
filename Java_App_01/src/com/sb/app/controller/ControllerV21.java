package com.sb.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.service.ServiceV2;

public class ControllerV21 {
	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		scoreList = sV2.getScore(10);
		
		System.out.println(scoreList);
		
		
	}
}
