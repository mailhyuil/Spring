package com.sb.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.ScoreVO;
import com.sb.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	private final List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void makeScore() {
		for (int i = 0; i < 10; i++) {
			ScoreVO vo = ScoreVO.builder()
					.intKor((int) (Math.random() * 51) + 50)
					.intEng((int) (Math.random() * 51) + 50)
					.intMath((int) (Math.random() * 51) + 50)
					.build();
			scoreList.add(vo);
		}
	}

	@Override
	public void printScore() {
		for (ScoreVO vo : scoreList) {
			System.out.println(vo.toString());
		}
	}

	@Override
	public void sumScore() {
	}

	@Override
	public void avgScore() {
	}

}
