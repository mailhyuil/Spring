package com.sb.web.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.sb.web.service.StudentService;

@RequestMapping("/student")
@Controller
public class StudentController {
	
	private final StudentService stService;
	
	/*
	 * D.I. 중 생성자 주입, 
	 */
	
	public StudentController(StudentService stService) {
		this.stService = stService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "/home";
	}
	
	@RequestMapping(value = "/list_view", method = RequestMethod.GET)
	public String list(Model model) {
		
		return null;
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {

		return null;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(Model model) {

		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update() {
		return null;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete() {
		return null;
	}
}
