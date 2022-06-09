package com.sb.app.controller;

import com.sb.app.service.impl.ScoreServiceImplV1A;

public class ScoreControllerV2 {
	public static void main(String[] args) {
		ScoreServiceImplV1A service = new ScoreServiceImplV1A();
		
		service.inputScore();
		
		
	}
}
