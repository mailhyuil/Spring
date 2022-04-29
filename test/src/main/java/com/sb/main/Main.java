package com.sb.main;

import com.sb.web.domain.StudentVO;
import com.sb.web.service.ScoreService;
import com.sb.web.service.StudentService;
import com.sb.web.service.impl.ScoreServiceImplV1;
import com.sb.web.service.impl.StudentServiceImplV1;

public class Main {

	public static void main(String[] args) {
		String stFile = "src/main/java/com/sb/web/data/students.txt";
		int stLength = 50;
		
		StudentService stService = new StudentServiceImplV1(stFile, stLength);
		stService.loadStudent();
		
		StudentVO[] stList = stService.getStudents();
		StudentVO stNo1 = stService.findByNum("0001");
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//ScoreService service = ctx.getBean(ScoreServiceImplV1.class);
		
		ScoreService service = new ScoreServiceImplV1();
		
		service.makeScore();
		service.printScore();
		int intSum = service.returnSum();
		float fAvg = service.returnAvg();
	}

}
