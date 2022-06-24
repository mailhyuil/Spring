package com.callor.naver.controller;

<<<<<<< HEAD
import java.util.Locale;

=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.naver.service.exec.NaverBookServiceEx;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
<<<<<<< HEAD
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String home(String title, Model model) {
		log.debug("도서명 : " + title);
		NaverBookServiceEx naverService = new NaverBookServiceEx();
=======

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String home(String title, Model model) {
		log.debug("도서명 : " + title);
		
		NaverBookServiceEx naverService = new NaverBookServiceEx();
		
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		String queryString = naverService.queryString("BOOK", title);
		String resString = naverService.getJsonString(queryString);
		return resString;
	}
<<<<<<< HEAD
	
	/*
	 * 프로젝트의 요청에 대하여 소수의 Controller 를  만들고
	 * 처리를 할수 있다
	 * 하지만, 프로젝트 규모가 커지면 코드 관리가 어려워지고
	 * 결국에는 프로젝트를 Refactoring 해야하는 상황에 직면하게 된다
	 */
	@RequestMapping(value="/book/list")
	public String bookList() {
		return "books/list";
	}
	
	
	
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
}
