package com.sb.app.controller;

import com.sb.app.service.ScoreService;
import com.sb.app.service.impl.ScoreServiceImplV4;

public class ScoreControllerV4 {
	
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV4();
		scService.inputScore();
		scService.saveScore();
	}

}
