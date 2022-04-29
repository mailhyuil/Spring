package com.sb.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.app.domain.StudentVO;
import com.sb.app.service.StudentService;

@Controller
public class StudentController {
	
	/*
	 * Controller에서 Service Interface를 상속받은
	 * 클래스 중에 한가지를 사용하고자 한다.
	 * 전통적인 자바에서는 : 인터페이스 객체 = new 클래스생성자();
	 * 와 같이 사용한다.
	 * 
	 * Spring framework에서는 
	 * private final 인터페이스 객체와 같이 선언하고
	 * 생성자를 매개변수로 받아서 전달받아 
	 * 객체에 대입한다.
	 * 
	 * IoC컨테이너에 미리 생성되어 있는 객체(bean)가 사용된다.
	 */
	
	private final StudentService stService;
	
	public StudentController(StudentService stService) {
		this.stService = stService;
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String list(Model model) {
		
		List<StudentVO> stList = stService.selectAll();
		
		model.addAttribute("STUDENTS", stList);
		
		return "student/list_view";
	}
	
	@RequestMapping(value="/student/detail", method=RequestMethod.GET)
	public String detail(String stNum, Model model) {
		
		StudentVO stVO = stService.findById(stNum);
		model.addAttribute("STUDENT", stVO);
		
		return "student/detail";
	}
	
	@RequestMapping(value="/student/insert", method=RequestMethod.GET)
	public String insert() {
		return "student/insert";
	}
}
