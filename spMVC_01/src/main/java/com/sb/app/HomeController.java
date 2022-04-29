package com.sb.app;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

	model.addAttribute("my_name", "홍길동");
	String[] st = {"홍길동", "성춘향", "이몽룡"};
	model.addAttribute("ST", st);
		return "home";
	}
	
}
