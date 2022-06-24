package com.callor.memo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.callor.memo.model.MemoVO;
import com.callor.memo.service.FileUpService;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SessionAttributes("memoVO")
@Controller
public class HomeController {
	@Autowired
	private MemoService memoService;
	@Autowired
	private FileUpService fileupService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
<<<<<<< HEAD
		List<MemoVO> list = memoService.selectAll();
		model.addAttribute("LIST", list);
=======
		List<MemoVO> memoVO = memoService.selectAll();
		model.addAttribute("memoVO", memoVO);
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		return "home";
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
<<<<<<< HEAD
	public String input(@ModelAttribute("memoVO") MemoVO memoVO) {
=======
	public String input() {
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		return null;
	}

	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String input(Model model, 
<<<<<<< HEAD
			MemoVO memoVO,
			@RequestParam("up_file") MultipartFile up_file,
			SessionStatus status) {
=======
			@ModelAttribute("memoVO") MemoVO memoVO,
			@RequestParam("up_file") MultipartFile up_file,
			SessionStatus status) {
		log.debug(up_file.toString());
		

>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD
		
		memoService.insert(memoVO);
		
		status.setComplete();
		
=======

		memoService.insert(memoVO);
		
		status.setComplete();
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		return "redirect:/";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(long id, Model model) {
		
		MemoVO vo = memoService.findById(id);
<<<<<<< HEAD
		
		model.addAttribute("VO", vo);
		
=======
		model.addAttribute("VO", vo);
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(long id, @ModelAttribute("memoVO") MemoVO memoVO, Model model) {
		memoVO = memoService.findById(id);
		model.addAttribute("memoVO", memoVO);
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
<<<<<<< HEAD
	public String update(long id, Model model, MemoVO memoVO, 
			@RequestParam("up_file") MultipartFile up_file,
			SessionStatus status) {
		
=======
	public String update(long id, Model model, 
			@ModelAttribute("memoVO") MemoVO memoVO, 
			@RequestParam("up_file") MultipartFile up_file,
			SessionStatus status) {
		log.debug(up_file.toString());
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD
		
=======


		memoVO.setM_date(dayFormat.format(date));
		memoVO.setM_time(timeFormat.format(date));
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		memoService.update(memoVO);
		
		status.setComplete();
		
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
<<<<<<< HEAD
	public String delete(long id) {
=======
	public String update(long id) {
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		memoService.delete(id);
		return "redirect:/";
	}
	
	@ModelAttribute("memoVO")
	private MemoVO memoVO() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
<<<<<<< HEAD
		return MemoVO.builder().m_date(dayFormat.format(date))
					.m_time(timeFormat.format(date))
					.build();
=======
//		memoVO.setM_date(dayFormat.format(date));
//		memoVO.setM_time(timeFormat.format(date));
		return MemoVO.builder().m_date(dayFormat.format(date))
					.m_time(timeFormat.format(date))
					.m_author("ddd").build();
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
	}
}
