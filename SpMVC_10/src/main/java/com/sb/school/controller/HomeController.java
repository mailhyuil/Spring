package com.sb.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
/*
 * 만약 사용자의 로그인이 필요한 요청의 경우
 * 요청받은 method에 httpSession 객체를 매개변수로 설정하고
 * 코드 시작부분에서 httpSession의 getAttribute("변수명")을
 * 사용하여 로그인된 정보를 추출한다
 * 만약 추출한 정보가 null이면 로그인 페이지로 점프하고
 * null 아니면 요청에 대한 응답을 실행한다
 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		log.debug("반갑습니다 여기는 home입니다!");
		return "home";
	}
	
}
