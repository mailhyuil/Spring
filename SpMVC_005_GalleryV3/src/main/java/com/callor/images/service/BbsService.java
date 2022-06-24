package com.callor.images.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.images.model.BBsVO;
import com.callor.images.persistance.BbsDao;

public interface BbsService extends BbsDao{
	public void insertBbsAndFile(BBsVO bbsVO, MultipartFile file);
	public void insertBbsAndFiles(BBsVO bbsVO, MultipartHttpServletRequest file);
	
}
