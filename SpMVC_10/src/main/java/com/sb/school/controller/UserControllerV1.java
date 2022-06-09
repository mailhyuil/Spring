package com.sb.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sb.school.model.UserVO;
import com.sb.school.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @RequestMapping(value = "/user")
public class UserControllerV1 {

	private final UserService userService;

	public UserControllerV1(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpSession session, Model model) {
		log.debug(userVO.toString());

		//Server 와 View 사이에서 약속된 프로토콜을 사용하기 위하여
		//변수를 선언하고 
		
		String loginMessage = null;
		
		UserVO loginUserVO = userService.findById(userVO.getUsername());
		
		if (loginUserVO == null) {
			loginMessage = "USERNAME FAIL";
		} else if (!loginUserVO.getPassword().equals(userVO.getPassword())) {
			loginMessage = "PASSWORD FAIL";
		}
		
		userVO = userService.login(userVO);

		if (loginMessage == null) {
			session.setAttribute("USER", loginUserVO);
		} else {
			session.removeAttribute("USER");			
		}
		
		model.addAttribute("LOGIN_MESSAGE", loginMessage);
		
		return "user/login_ok";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		session.removeAttribute("USER");

		return "redirect:/user/login";

	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		return null;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO userVO) {
		log.debug(userVO.toString());
		userService.join(userVO);
		return "redirect:/user/login";
	}

	@ResponseBody
	@RequestMapping(value = "/idcheck/{username:.+}", method = RequestMethod.GET)
	public String idcheck(@PathVariable("username") String username) {

		UserVO userVO = userService.findById(username);

		/*
		 * if(userVO.getUsername().equalsIgnoreCase(username)) { return "fail"; } else {
		 * return "ok"; }
		 */

		if (userVO == null) {
			return "ok";
		} else {
			return "fail";
		}
	}
}
