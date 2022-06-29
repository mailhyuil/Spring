package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.memo.model.MemoVO;
import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Service
public class MemoServiceImpl implements MemoService {

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
		return memoDao.update(vo);
	}

	@Override
	public int delete(Long id) {
		return memoDao.delete(id);
	}

	@Override
	public List<MemoVO> findByMemo(String memo) {
		return null;
	}

	@Override
	public List<MemoVO> findByAuthor(String author) {
		return null;
	}

}
