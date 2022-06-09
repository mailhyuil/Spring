package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278

@Controller
@RequestMapping(value="/news")
public class NewsController {
<<<<<<< HEAD

	@RequestMapping(value={"/",""})
	public String home() {
		return "news/list";
	}
	
=======
	
	
	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public String list() {
		return "news/list";
	}
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
}
