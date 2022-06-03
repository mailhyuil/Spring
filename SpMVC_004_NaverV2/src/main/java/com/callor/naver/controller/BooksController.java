package com.callor.naver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/books")
public class BooksController {
	
	private final BookService bookService;
	
	public BooksController(@Qualifier(QualifierConfig.SERVICE.BOOKS_V1) BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@RequestMapping(value={"","/"}, method=RequestMethod.GET)
	public String home(Model model) {
		List<BookVO> bookList = bookService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println(bookList);
		System.out.println("=".repeat(100));
		model.addAttribute("BOOKS", bookList);
		return "/books/book_list";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert() {
		return "books/book_insert";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(BookVO bookVO) {
		bookService.insert(bookVO);
		return "books/book_insert";
	}
}
