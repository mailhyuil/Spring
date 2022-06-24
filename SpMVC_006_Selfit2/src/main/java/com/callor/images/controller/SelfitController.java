package com.callor.images.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.images.service.SelfitService;

@Controller
@RequestMapping(value="/workout")
public class SelfitController {
	private final SelfitService selfitService;
	public SelfitController(SelfitService selfitSerivce) {
		this.selfitService = selfitSerivce;
	}
	@RequestMapping(value="/dayset/{sc_num}", method=RequestMethod.GET)
	public String daySet(@PathVariable("sc_num") String sc_num, Model model) {
		selfitService.getDaySetList(model, sc_num);
		return "workout/dayset";
	}
}
