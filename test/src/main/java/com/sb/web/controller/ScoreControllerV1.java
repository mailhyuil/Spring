package com.sb.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.sb.web.domain.StudentVO;
import com.sb.web.service.ScoreService;
import com.sb.web.service.impl.ScoreServiceImplV1;
import com.sb.web.service.impl.StudentServiceImplV1;

public class ScoreControllerV1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String stFile = "student.txt";
		int stLength = 50;
		
		StudentServiceImplV1 stService1 = new StudentServiceImplV1(stFile, stLength);
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//ScoreService service = ctx.getBean(ScoreServiceImplV1.class);
		ScoreService service = new ScoreServiceImplV1();
		
		service.makeScore();
		service.printScore();
		int intSum = service.returnSum();
		float fAvg = service.returnAvg();
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/home.jsp");
		mv.addObject("intSum", intSum);
		mv.addObject("fAvg", fAvg);
		return mv;
	}	
}
