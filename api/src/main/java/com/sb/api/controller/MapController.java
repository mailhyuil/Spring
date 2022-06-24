package com.sb.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/map")
public class MapController {

	@RequestMapping(value={"/",""}, method=RequestMethod.GET)
	public String home() {
		return null;
	}
}
