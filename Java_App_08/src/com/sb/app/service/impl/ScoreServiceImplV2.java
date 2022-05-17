package com.sb.app.service.impl;

import com.sb.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1A {

	public ScoreServiceImplV2() {
		// 상속받은 ScoreServiceImplV1A 클래스의 기본 생성자 호출
		super();
	}

	@Override
	public void inputScore() {
		while (true) {
			System.out.print("학생이름 입력(QUIT:종료) >> ");
			String stName = scan.nextLine();

			if (stName.equals("QUIT")) {
				break;
			}

			String[] strSubject = { "국어", "영어", "수학" };
			Integer[] intScore = new Integer[3];
			int index = 0;
			for (index = 0; index < strSubject.length; index++) {

				intScore[index] = getScore(strSubject[index]);
				if (intScore[index] == null) {
					/*
					 * 만약 index 값이 0이라면 "국어점수" 입력화면이 나타난다
					 * 점수를 숫자로 입력하지 않고 Enter만 누르거나
					 * 다른 문자열이 섞인 경우라면
					 * "국어점수는 정수만 입력" 메세지를 보여주고 null을 리턴
					 */
					index--;
					continue;
				}
				if (intScore[index] < 0)
					// break for
					break;
			} // end for
			if(index < strSubject.length) 
				// break while
				break;
			ScoreVO scVO = ScoreVO.builder()
					.stName(stName)
					.intKor(intScore[0])
					.intEng(intScore[1])
					.intMath(intScore[2])
					.build();
			
			scList.add(scVO);
		} // end while
		
		for(ScoreVO scVO : scList) {
			System.out.println(scVO.toString());
		}
	}

	/*
	 * 정수 점수를 정확히 입력했으면 점수를 return하고 만약 exception이 발생하면 null return 종료(QUIT) 입력하면
	 * -1을 return
	 */

	private Integer getScore(String title) {
		System.out.printf("%s 점수입력(QUIT:종료) >> ", title);
		String score = scan.nextLine();

		if (score.equals("QUIT")) {
			return -1;
		}

		Integer intScore = 0;

		try {
			intScore = Integer.valueOf(score);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.printf("%s 점수는 정수만 가능\n", title);
			return null;
		}

		return intScore;
	}

}
