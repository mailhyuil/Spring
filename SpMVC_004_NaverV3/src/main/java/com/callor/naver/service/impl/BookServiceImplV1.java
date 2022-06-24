package com.callor.naver.service.impl;

import java.util.List;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.persistence.BookDao;
import com.callor.naver.service.BookService;

import lombok.extern.slf4j.Slf4j;


/*
 * bookServiceV1
 * BookService interface를 상속받은 클래스가 다수 있을 때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의
 * 문제가 발생한다
 * 
 * 그럴때 @Service("")
 * 클래스 중에서 필요한 부분을 선택할 수 있도록 하기 위하여
 * 부착하는 것
 */
@Slf4j
@Service(QualifierConfig.SERVICE.BOOKS_V1)
public class BookServiceImplV1 implements BookService{
	
	@Autowired
	private final BookDao dao;
	
	
	public BookServiceImplV1(BookDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<BookVO> findByTitle(String title) {
		return null;
	}

	@Override
	public List<BookVO> findByAuthor(String author) {
		return null;
	}

	@Override
	public List<BookVO> findByPublisher(String publisher) {
		return null;
	}

	@Override
	public List<BookVO> findByPrice(int price) {
		return null;
	}

	@Override
	public List<BookVO> selectAll() {
		return dao.selectAll();
	}

	@Override
	public BookVO findById(String id) {
		BookVO bookVO = dao.findById(id);
		return bookVO;
	}

	@Override
	public int insert(BookVO vo) {
		dao.insert(vo);
		return 0;
	}


	public int update(BookVO vo) {
		dao.update(vo);
		return 0;
	}


	public int delete(String id) {
		dao.delete(id);
		return 0;
	}

}
