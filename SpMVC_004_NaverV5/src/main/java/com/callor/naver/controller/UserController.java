package com.callor.naver.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.model.BuyBooksVO;
import com.callor.naver.model.UserVO;
import com.callor.naver.service.BookService;
import com.callor.naver.service.BuyBooksService;
import com.callor.naver.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	@Qualifier(QualifierConfig.SERVICE.USER_V2)
	private UserService userService;
	@Autowired
	private BookService bookService;
	@Autowired
	private BuyBooksService buyService;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("LAYOUT", "JOIN");
		return null;
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVO userVO, Model model) {
		log.debug("회원정보", userVO.toString());
		int result = userService.join(userVO);
		if(result == -1) {
			model.addAttribute("error", "DUPLICATED_EMAIL");
			return "redirect:/user/join";
		}
//		log.debug("book회원정보", bookVO.toString());
		return "redirect:/user/login";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model, String error) {
		System.out.println();
		System.out.println();
		System.out.println(error);
		System.out.println();
		System.out.println();
		model.addAttribute("error", error);
		model.addAttribute("LAYOUT", "LOGIN");
		return null;
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(UserVO userVO, Model model, HttpSession session) {
		UserVO loginUser = userService.findById(userVO.getUsername());
		
		if(loginUser == null) {
			model.addAttribute("error", "USERNAME_FAILED");
			return "redirect:/user/login";
		}
		loginUser = userService.login(userVO);
		if(loginUser == null) {
			model.addAttribute("error", "PASSWORD_FAILED");
			return "redirect:/user/login";
		}
		
		session.setAttribute("USER", loginUser);
		return "redirect:/";
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		return "redirect:/";
	}
	/*
	 * 매개변수로 설정한 httpSession
	 * controller의 각 method는 spring으로부터 httpsession 객체를
	 * 주입받을 수 있다.
	 * httpsession객체에는 client 와 server간에 상태를 유지하는 정보를 담을 수 있다.
	 * 여기에 담긴 데이터는 서버가 run하는 동안 일정 조건을 만족하는 동안
	 * session제거하지 않는 한 계속 메모리에 값이 남아있다.
	 * 큰 데이터를 httpsession에 담는것은 썩 좋지 않다.
	 * 최소한으로 status를 유지할 수 있는 데이터만 담는 것이 좋다.
	 * 필요가 없어지면 반드시 remove해주는 것이 좋다.
	 * 프로젝트에서 어떤 method에서든지 한번 담은 session정보는 전체 프로젝트의
	 * controller에서 값을 참조 할 수 있다.
	 * 
	 */
	
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String mypage(HttpSession session, Model model) {
		UserVO loginUser = (UserVO)session.getAttribute("USER");
		if(loginUser == null) {
			model.addAttribute("error", "LOGIN_NEEDED");
			return "redirect:/user/login";
		}
		// 로그인한 사용자의 도서 구입 리스트 가져오기
		List<BuyBooksVO> buyBooks = buyService.findByUserName(loginUser.getUsername());
		// 도서 구입리스트의 ISBN을 도서리스트에서 조회하여 가져오기
		for(BuyBooksVO buyVO : buyBooks) {
			String isbn = buyVO.getB_isbn();
			BookVO book = bookService.findById(isbn);
			buyVO.setBook(book);
		}
		
		model.addAttribute("BUY_BOOKS", buyBooks);
		model.addAttribute("LAYOUT", "MYPAGE");
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/idcheck/{username}", method=RequestMethod.GET)
	public String idcheck(@PathVariable("username") String username) {
		UserVO userVO = userService.findById(username);
		if(userVO == null) return "OK";
		return "FAIL";
	}

	@ResponseBody
	@RequestMapping(value="/emailcheck", method=RequestMethod.GET)
	public String emailcheck(String email) {
		UserVO userVO = userService.findByEmail(email);
		if(userVO == null) return "OK";
		return "FAIL";
	}
}
