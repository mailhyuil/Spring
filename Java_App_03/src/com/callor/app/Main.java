package com.callor.app;

import com.callor.app.service.ScoreService;

public class Main {
	public static void main(String[] args) {
		ScoreService service = new ScoreService();
		
		service.makeScore(20);
		service.scorePrint();
	}
}
