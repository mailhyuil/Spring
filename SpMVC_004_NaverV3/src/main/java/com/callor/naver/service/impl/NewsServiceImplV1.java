package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.model.NewsVO;
import com.callor.naver.service.NewsService;

@Service("newsServiceV1")
<<<<<<< HEAD
public class NewsServiceImplV1 implements NewsService {

	
	@Override
	public List<NewsVO> findByTitle(String title) {
=======
public class NewsServiceImplV1 implements NewsService{

	@Override
	public List<NewsVO> findByTitle(String title) {
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public List<NewsVO> selectAll() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public NewsVO findById(String id) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return null;
	}

	@Override
	public int insert(NewsVO vo) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return 0;
	}

	@Override
	public int update(NewsVO vo) {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		return 0;
	}

	@Override
	public int delete(String id) {
<<<<<<< HEAD
		return 0;
	}


=======
		// TODO Auto-generated method stub
		return 0;
	}

	
	
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
