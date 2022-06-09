package com.sb.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.BookVO;

public class Exec03 {
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			BookVO bookVO = new BookVO();
			bookVO.setTitle("Do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
		}
	}
}
