package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc

@Controller
@RequestMapping(value="/news")
public class NewsController {
<<<<<<< HEAD
	
	
	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public String list() {
		return "news/list";
	}
=======

	@RequestMapping(value={"/",""})
	public String home() {
		return "news/list";
	}
	
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
