package com.sb.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.sb.app.model.ScoreVO;

public class ScoreServiceImplV4 extends ScoreServiceImplV3 {
	public ScoreServiceImplV4() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public void saveScore() {
		FileWriter fileWriter = null;
		PrintWriter print = null;

		try {
			fileWriter = new FileWriter(saveFileName);
			print = new PrintWriter(fileWriter);
			
			for (ScoreVO scVO : scList) {
				print.printf("%s:", scVO.getStName());
				print.printf("%d:", scVO.getIntKor());
				print.printf("%d:", scVO.getIntEng());
				print.printf("%d\n", scVO.getIntMath());
			}
			
			print.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
