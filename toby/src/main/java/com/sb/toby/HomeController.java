package com.sb.toby;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}

	public static void main(String[] args) {
		Something some1 = new Something();

		while (some1.hasNext()) {
			System.out.println(some1.next());
		}
	}
}
