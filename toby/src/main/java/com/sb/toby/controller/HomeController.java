package com.sb.toby.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.toby.factory.BirdFactory;
import com.sb.toby.inter.Bird;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	public static void main(String[] args) {
		Bird duck = BirdFactory.createBird("duck");
		duck.sing();
		duck.fly();
	}
	
}
