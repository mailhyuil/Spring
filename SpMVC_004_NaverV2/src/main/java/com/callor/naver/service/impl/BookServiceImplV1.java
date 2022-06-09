package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
<<<<<<< HEAD
import com.callor.naver.service.BookService;

/*
 * bookServiceV1
 * BookService interface를 상속받은 클래스가 다수 있을때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의 
 * 문제가 발생한다
 * 
 * 그럴때 @Service Annotation 이름(식별자)을 부착하여 두고
=======
import com.callor.naver.persistance.BookDao;
import com.callor.naver.service.BookService;


/*
 * bookServiceV1
 * BookService interface를 상속받은 클래스가 다수 있을 때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의
 * 문제가 발생한다
 * 
 * 그럴때 @Service("")
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
 * 클래스 중에서 필요한 부분을 선택할 수 있도록 하기 위하여
 * 부착하는 것
 */
@Service(QualifierConfig.SERVICE.BOOKS_V1)
public class BookServiceImplV1 implements BookService{
<<<<<<< HEAD

	@Override
	public List<BookVO> findByTitle(String title) {
		// TODO Auto-generated method stub
=======
	private final BookDao dao;
	
	public BookServiceImplV1(BookDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<BookVO> findByTitle(String title) {
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public List<BookVO> findByAuthor(String author) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public List<BookVO> findByPublisher(String publisher) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public List<BookVO> findByPrice(int price) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public List<BookVO> selectAll() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return null;
=======
		return dao.selectAll();
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
	}

	@Override
	public BookVO findById(String id) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public int insert(BookVO vo) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
=======
		dao.insert(vo);
		return 0;
	}


	public int update(BookVO vo) {
		return 0;
	}


	public int delete(String id) {
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return 0;
	}

}
