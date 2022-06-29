package com.callor.memo.persistence;

import java.util.List;

import com.callor.memo.model.MemoVO;

public interface MemoDao extends GenericDao<MemoVO, Long> {
	public List<MemoVO> findByMemo(String memo);
	public List<MemoVO> findByAuthor(String author);
}
