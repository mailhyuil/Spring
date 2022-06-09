package com.sb.school.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sb.school.model.StudentVO;
import com.sb.school.model.UserVO;
import com.sb.school.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	private final StudentService stService;
	
	public StudentController(StudentService stService) {
		this.stService = stService;
	}
	
	@RequestMapping(value={"/",""}, method=RequestMethod.GET)
	public String list(HttpSession session) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if(userVO == null) {
			return "redirect:/user/login";
		} else {
			return "redirect:/";
		}
	}
	/*
	 * @ResponseBody 
	 * 컨트롤러 메서드에서 문자열을 리턴하면 문자열을 웹클라이언트에게 전송하는 역할
	 * pom.xml에 jackson-bind dependency를 추가하면
	 * List, 객체(VO) 등등의 데이터를 json타입으로 변환하여 전송
	 */
	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<StudentVO> getList(){
		List<StudentVO> stList = stService.selectAll();
		return stList;
	}
	
	@ResponseBody
	@RequestMapping(value="/{st_num}/getter", method=RequestMethod.GET)
	public StudentVO getStudent(@PathVariable("st_num") String st_num) {
		StudentVO student = stService.findById(st_num);
		
		return student;
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model) {
		List<StudentVO> stList = stService.selectAll();
		model.addAttribute("STLIST", stList);
		
		return null;
	}
}
