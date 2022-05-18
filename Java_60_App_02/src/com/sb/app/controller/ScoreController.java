package com.sb.app.controller;

import com.sb.app.service.ScoreService;
import com.sb.app.service.impl.ScoreServiceImplV1;

public class ScoreController {
	public static void main(String[] args) {
		ScoreService service = new ScoreServiceImplV1();
		service.makeScore();
		service.printScore();
	}
}
