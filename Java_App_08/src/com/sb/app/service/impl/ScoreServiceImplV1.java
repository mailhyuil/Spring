package com.sb.app.service.impl;

import com.sb.app.model.ScoreVO;
import com.sb.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	ScoreVO sv;
	
	public ScoreServiceImplV1() {
	}
	
	public ScoreServiceImplV1(ScoreVO sv) {
		this.sv = sv;
	}
	
	public void setScoreVO(ScoreVO sv) {
		this.sv = sv;
	}
	
	@Override
	public void inputScore() {
		
	}

	@Override
	public void saveScore() {
		
	}

}
