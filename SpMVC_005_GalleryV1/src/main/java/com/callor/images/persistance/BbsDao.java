package com.callor.images.persistance;

import com.callor.images.model.BbsVO;

public interface BbsDao extends GenericDao<BbsVO, Long> {
	
	public void create_bbs_table();
	
}
