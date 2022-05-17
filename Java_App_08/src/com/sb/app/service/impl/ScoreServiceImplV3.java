package com.sb.app.service.impl;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sb.app.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {

	protected String saveFileName;

	public ScoreServiceImplV3() {
		super();
		saveFileName = "src/com/sb/app/controller/score.txt";
	}

	@Override
	public void saveScore() {
		// 파일에 데이터를 기록하는 객체
		FileOutputStream fileOut = null;
		BufferedOutputStream buffer = null;

		/*
		 * BufferedOutput을 사용하는 이유 실제 데이터를 파일에 기록하기 위해서는 FileOutputStream만 있어도 된다. 하지만,
		 * 파일에 기록하고 저장하는 일은 상당히 많은 시간을 소모합니다. 컴퓨터 메모리, cpu 입장에서는 파일을 기록하는 동안 아무것도 하지 못하고
		 * 기다려야 하는 상황이 발생한다 이대 중간에 BufferedOutput 파이브를 연결해 두고 애플리케이션에서는 BufferedOutput에게
		 * 데이터를 모두 보내고 다른일을 수행한다.
		 * 그러면 BufferedOutput 과 FileOut이 협력하여 데이터를 파일에 기록하는 일을 대신 수행해준다.
		 */

		try {
			fileOut = new FileOutputStream(saveFileName);
			buffer = new BufferedOutputStream(fileOut);

			for (ScoreVO scVO : scList) {
				String writer = "";
				writer += String.format("%s:", scVO.getStName());
				writer += String.format("%d:", scVO.getIntKor());
				writer += String.format("%d:", scVO.getIntEng());
				writer += String.format("%d\n", scVO.getIntMath());

				buffer.write(writer.getBytes());
				
			}
			buffer.flush();
			buffer.close();
			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
