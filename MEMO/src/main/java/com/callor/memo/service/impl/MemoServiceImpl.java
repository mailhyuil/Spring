package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.memo.model.MemoVO;
import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Service
public class MemoServiceImpl implements MemoService{
	
	@Autowired
	private MemoDao memoDao;
	
	@Override
	public List<MemoVO> selectAll() {
		return memoDao.selectAll();
	}

	@Override
	public MemoVO findById(Long id) {
		return memoDao.findById(id);
	}

	@Override
	public int insert(MemoVO vo) {
		return memoDao.insert(vo);
	}

	@Override
	public int update(MemoVO vo) {
		return 0;
	}

	@Override
	public int delete(Long id) {
		return 0;
	}

}
