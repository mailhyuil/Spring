package com.sb.web.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.web.domain.StudentVO;
import com.sb.web.school.service.StudentService;

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
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("ST_LIST", stService.selectAll());
		return null;
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {

		return null;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String stNum, Model model) {
		StudentVO stVO = stService.findByStNum(stNum);
		model.addAttribute("ST",stVO);
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
