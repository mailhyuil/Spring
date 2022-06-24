package com.schoolverse.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.schoolverse.app.service.AcademyService;
import com.schoolverse.app.service.BasketService;
import com.schoolverse.app.service.ClassService;


@Controller
public class RegisterController {
	@Autowired
	private AcademyService acaService;
	@Autowired
	private ClassService classService;
	
	@RequestMapping(value = "/user/register", method = RequestMethod.GET)
	public String register(Model model) {
		
		return null;
	}
}
