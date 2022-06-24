package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc

@Controller
@RequestMapping(value="/movies")
public class MoviesController {
<<<<<<< HEAD

	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public String list() {
		return "movies/list";
	}
=======
	
	@RequestMapping(value= {"/",""})
	public String home() {
		return "movies/list";
	}

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
