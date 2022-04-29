package com.sb.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.service.ServiceV3;

public class ControllerV3 {
	
	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		ServiceV3 sV3 = new ServiceV3(scoreList);
		sV3.makeScore(10);
		
		System.out.println(scoreList);
	}
	
}
