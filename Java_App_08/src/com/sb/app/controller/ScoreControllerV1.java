package com.sb.app.controller;

import com.sb.app.service.ScoreService;
import com.sb.app.service.impl.ScoreServiceImplV2;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		ScoreService service = new ScoreServiceImplV2();
		
		service.inputScore();
		
		
	}
}
