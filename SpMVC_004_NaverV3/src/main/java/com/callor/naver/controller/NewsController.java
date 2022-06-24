package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/news")
public class NewsController {
	
	
	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public String list() {
		return "news/list";
	}
}
