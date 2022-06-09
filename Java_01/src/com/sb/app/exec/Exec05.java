package com.sb.app.exec;

import com.sb.app.model.BookVO;

public class Exec05 {
	public static void main(String[] args) {
		BookVO[] bookVO = new BookVO[10];
		for (int i = 0; i < bookVO.length; i++) {
			bookVO[i] = new BookVO();
		}

		int index = 2;
		bookVO[index].setTitle("자바의 정성");
		bookVO[index].setComp("도울출판사");
		System.out.println(bookVO[index].getTitle());
		System.out.println(bookVO[index].getComp());
	}
}
