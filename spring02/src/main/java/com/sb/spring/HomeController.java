package com.sb.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home(String num1, String num2, Model model) {
		
			int intNum1 = Integer.parseInt(num1);
			int intNum2 = Integer.parseInt(num2);

			int intSum = intNum1 + intNum2;

			model.addAttribute("result", intSum);
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(String name, Model model) {
		try {
			model.addAttribute("result", name);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "hello";
	}
	
}
