package com.sb.app.controller;

import com.sb.app.service.ScoreService;
import com.sb.app.service.impl.ScoreServiceImplV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		
		scService.makeScore();
		scService.printScore();
		
	}
}
