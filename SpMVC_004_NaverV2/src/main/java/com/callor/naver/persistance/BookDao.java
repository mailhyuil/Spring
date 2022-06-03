package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.BookVO;

public interface BookDao extends GenericDao<BookVO, String> {
	
	public List<BookVO> findByTitle(String title);
	public List<BookVO> findByAuthor(String author);
	public List<BookVO> findByPublisher(String publisher);
	
	public List<BookVO> findByPrice(int price);
}
