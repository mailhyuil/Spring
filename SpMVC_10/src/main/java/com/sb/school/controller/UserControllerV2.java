package com.sb.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Qualifier;
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
@Controller
@RequestMapping(value = "/user")
public class UserControllerV2 {
	/*
	 * @Qualifier("userServiceV2")
	 * UserService 인터페이스를 상속받은 클래스가 2개 있다
	 * User...ImplV1 과 User...ImplV2 가 있는데
	 * 그중에서 @Service("userServiceV2")라고 명시된
	 * 클래스를 주입해달라
	 */
	private final UserService userService;

	public UserControllerV2(@Qualifier("userServiceV2")
								UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpSession session, Model model) {
		UserVO loginUser = userService.login(userVO);
		if(loginUser == null) {
			session.removeAttribute("USER");
		} else {
			session.setAttribute("USER", loginUser);
		}
		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		session.removeAttribute("USER");

		return "redirect:/";

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
