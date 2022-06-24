package com.callor.naver.service.impl;

import java.util.List;

<<<<<<< HEAD
import javax.servlet.jsp.tagext.TryCatchFinally;

=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
<<<<<<< HEAD
import com.callor.naver.persistence.BookDao;
=======
import com.callor.naver.persistance.BookDao;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
import com.callor.naver.service.BookService;

import lombok.extern.slf4j.Slf4j;

<<<<<<< HEAD

/*
 * bookServiceV1
 * BookService interface를 상속받은 클래스가 다수 있을 때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의
 * 문제가 발생한다
 * 
 * 그럴때 @Service("")
=======
/*
 * bookServiceV1
 * BookService interface를 상속받은 클래스가 다수 있을때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의 
 * 문제가 발생한다
 * 
 * 그럴때 @Service Annotation 이름(식별자)을 부착하여 두고
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
 * 클래스 중에서 필요한 부분을 선택할 수 있도록 하기 위하여
 * 부착하는 것
 */
@Slf4j
@Service(QualifierConfig.SERVICE.BOOKS_V1)
public class BookServiceImplV1 implements BookService{
<<<<<<< HEAD
	
	@Autowired
	private final BookDao dao;
	
	
	public BookServiceImplV1(BookDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<BookVO> findByTitle(String title) {
=======

	/*
	 * GenericDao 를 상속받아 BookDao 를 만들고, 
	 * BookDao 를 상속받아 BookService 를 만들었다
	 * 이러한 다중상속관계에서
	 * BookDao 를 사용하여 서비스를 구현하려고 한다
	 * 
	 * 보통 Dao 를 설정할때 private final 로 선언하고
	 * 생성자에서 주입받아 사용했다
	 * 
	 * 그런데 다중상속관계에서
	 * 각각의 상속이 얽히면서 무한 반복 구조가 만들어질 수 있다
	 * 이때는 생성자 주입을 할수 없고,
	 * setter(@Autowired) 주입으로 사용해야 한다
	 */
	@Autowired
	private BookDao bookDao;

	/*
	 * Spring 에서 어떤 자동화된 코드를 실행하고 싶을때
	 * method 를 만들고 Method 에 @Autowired 를 설정해 두면
	 * 서비스가 처음 실행될때 method 를 자동으로 실행해 준다 
	 */
	@Autowired
	@Override
	public void create_book_table() {
		log.debug("CREATE TABLE");
		/*
		 * BookDao의 create_book_table() method 를 실행하라
		 * 만약 exception 이 발생하면 무시하라
		 */
		try {
			/*
			 * dao 에 create table  SQL 을 작성해 두고
			 * Service 클래스에 Autowired 된 method 를 선언하고
			 * 자동으로 실행되도록 한다
			 */
			bookDao.create_book_table();
			log.debug("BOOK TABLE 생성 OK!!!");
		} catch (Exception e) {
			// TODO: handle exception
			log.debug("BOOK TABLE 생성 못함~~~");
		}
	}
	
	
	@Override
	public List<BookVO> findByTitle(String title) {
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<BookVO> findByAuthor(String author) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<BookVO> findByPublisher(String publisher) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<BookVO> findByPrice(int price) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<BookVO> selectAll() {
<<<<<<< HEAD
		return dao.selectAll();
=======
		List<BookVO> books = bookDao.selectAll();
		return books;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
	}

	@Override
	public BookVO findById(String id) {
<<<<<<< HEAD
		BookVO bookVO = dao.findById(id);
		return bookVO;
=======
		// TODO Auto-generated method stub
		BookVO bookVO = bookDao.findById(id);
		return bookVO;
		
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
	}

	@Override
	public int insert(BookVO vo) {
<<<<<<< HEAD
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

=======
		/*
		 * MyBATIS 에서 DB에 INSERT 를 수행하고 나면
		 * INSERT 된 데이터의 행 개수를 return 한다
		 * 만약 return 된 값이 0 이라면 한개의 데이터도 INSERT 하지 못한 것이다
		 * 1 이상의 정수값이 return 되면 몇개의 데이터가 INSERT 되었는지
		 * 확인할 수 있다 
		 */
		int ret = bookDao.insert(vo);
		return ret;
	
	}

	@Override
	public int update(BookVO vo) {
		// TODO Auto-generated method stub
		bookDao.update(vo);
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		bookDao.delete(id);
		return 0;
	}



>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
