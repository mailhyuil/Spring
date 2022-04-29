package com.sb.web.score.exec;

import com.sb.web.domain.StudentVO;
import com.sb.web.service.ScoreService;
import com.sb.web.service.impl.ScoreServiceImplV1;

public class VarEx3 {
	public static void main(String[] args) {
		int num1 = 100;
		float fNum1 = 100.3f;
		boolean bYes = true;
		
		Integer intNum2 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes2 = true;
		
		String str = "korea";
		
		StudentVO stVO = new StudentVO();
		
		StudentVO[] stList = new StudentVO[10];
		
		ScoreService scService = new ScoreServiceImplV1();
		
	}
}
