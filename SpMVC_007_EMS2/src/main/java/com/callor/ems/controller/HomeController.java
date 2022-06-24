package com.callor.ems.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.callor.ems.model.EmsVO;
import com.callor.ems.service.QualifyConfig;
import com.callor.ems.service.SendMailService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Value("#{naver['naver.username']}")
	private String naver_username;
	@Value("#{app['my.app']}")
	private String myApp;
	@Autowired
	private StandardPBEStringEncryptor pbEnc;
	@Autowired
	@Qualifier(QualifyConfig.SERVICE.MAIL_V1)
	private SendMailService xMail;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute("emsVO") EmsVO emsVO, Model model) {

		Pattern PATT_BLACKET = Pattern.compile("\\([^\\(\\)]+\\)");
		Matcher matcher = PATT_BLACKET.matcher(naver_username);
		
		if(matcher.find()) {
			int startIndex = matcher.start();
			int endIndex = matcher.end();
			String findText = naver_username.substring(startIndex + 1, endIndex - 1);
			String user = pbEnc.decrypt(findText);
			log.debug("NaverUser {}", user);
		}
		
		log.debug("Naver UserName {}", naver_username);
		log.debug("myApp {}", myApp);
		
		model.addAttribute("emsVO", emsVO);
		return "home";
	}
	/*
	 * @RequestParam()
	 * 1. client에서 보내는 변수와 실제 사용하는 변수의 이름이 다를경우
	 * 2. 매개변수가 숫자형일때 client에서 변수에 값을 담지 않고 요청을 하면
	 * 내부 오류가 발생한다. 이때, required를 false로 설정하고 defaultValue를
	 * 설정하면 오류를 일부 방지할 수 있다.
	 */
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String home(@Valid EmsVO emsVO, BindingResult result, @RequestParam("file") MultipartFile file) {
		
		if(result.hasErrors()) {
			return "home";
		}
		log.debug(emsVO.toString());
		xMail.sendMail(emsVO);
		return "redirect:/";
	}
	/*
	 * @Valid 와 BindingResult는 순서를 바꾸면 안된다
	 * 
	 * 보통 파일 업로드를 받을때는 파일 정보를 수신할 매개변수에
	 * @RequestParam()을 사용한다
	 * 
	 * 하지만 여러파일을 수신하는
	 * MultipartHttpServletRequest를 매개변수로 사용할때는 
	 * @RequestParam()을 사용할 수 없다
	 */
	@ResponseBody
	@RequestMapping(value="/num", method=RequestMethod.GET)
	public String nums(
			@Valid @RequestParam(name="num", required = false, defaultValue = "0")
			Integer numValue,
			BindingResult result
			) {
		
		int sum = numValue + 100;
		
		return "sum: " + sum;
	}
	
	/*
	 * @RequestMapping(value="/test", method=RequestMethod.GET) public String
	 * test(HttpServletResponse res) { if(true) { try {
	 * res.sendRedirect("/response_body"); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); return null; } } return null;
	 * }
	 */
	
	@ModelAttribute("emsVO")
	private EmsVO emsVO() {
		return new EmsVO();
	}
}
