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
import org.springframework.web.multipart.MultipartFile;

import com.callor.memo.model.MemoVO;
import com.callor.memo.service.FileUpService;
import com.callor.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@Autowired
	private MemoService memoService;
	@Autowired
	private FileUpService fileupService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<MemoVO> memoVO = memoService.selectAll();
		model.addAttribute("memoVO", memoVO);
		return "home";
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input() {
		return null;
	}

	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String input(Model model, @ModelAttribute("memoVO") MemoVO memoVO,@RequestParam("up_file") MultipartFile up_file) {
		log.debug(up_file.toString());
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		memoVO.setM_date(dayFormat.format(date));
		memoVO.setM_time(timeFormat.format(date));
		memoService.insert(memoVO);
		return "redirect:/";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(long id, Model model) {
		
		MemoVO vo = memoService.findById(id);
		model.addAttribute("VO", vo);
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(long id, Model model) {
		MemoVO vo = memoService.findById(id);

		model.addAttribute("VO", vo);
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(long id, Model model, @ModelAttribute MemoVO memoVO,@RequestParam("up_file") MultipartFile up_file) {
		log.debug(up_file.toString());
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		try {
			String fileName = fileupService.fileUp(up_file);
			memoVO.setM_image(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		memoVO.setM_date(dayFormat.format(date));
		memoVO.setM_time(timeFormat.format(date));
		memoService.update(memoVO);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String update(long id) {
		memoService.delete(id);
		return "redirect:/";
	}
	
	@ModelAttribute("memoVO")
	private MemoVO memoVO() {
		return new MemoVO();
	}
}
