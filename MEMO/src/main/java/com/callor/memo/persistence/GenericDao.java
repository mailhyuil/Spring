package com.callor.memo.persistence;

import java.util.List;

import com.callor.memo.model.MemoVO;

public interface GenericDao<VO, PK> {
	public List<VO> selectAll();
	public MemoVO findById(PK id);
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(PK id);
}
