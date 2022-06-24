package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.model.NewsVO;
import com.callor.naver.service.NewsService;

@Service("newsServiceV1")
<<<<<<< HEAD
public class NewsServiceImplV1 implements NewsService{

	@Override
	public List<NewsVO> findByTitle(String title) {
		// TODO Auto-generated method stub
=======
public class NewsServiceImplV1 implements NewsService {

	
	@Override
	public List<NewsVO> findByTitle(String title) {
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public List<NewsVO> selectAll() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public NewsVO findById(String id) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return null;
	}

	@Override
	public int insert(NewsVO vo) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return 0;
	}

	@Override
	public int update(NewsVO vo) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		return 0;
	}

	@Override
	public int delete(String id) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
	}

	
	
=======
		return 0;
	}


>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
}
