package com.callor.images.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.images.config.QualifierConfig;
import com.callor.images.model.StartMenuDTO;
import com.callor.images.persistance.SelfitDao;
import com.callor.images.service.SelfitService;

@Service(QualifierConfig.SERVICE.SELFIT_V1)
public class SelfitServiceImplV1 implements SelfitService{

	private final SelfitDao selfitDao;
	
	public SelfitServiceImplV1(SelfitDao selfitDao) {
		this.selfitDao  = selfitDao;
	}
	
	@Override
	public void startPage(Model model) {
		List<StartMenuDTO> beginMenus = selfitDao.selectByScNum("01");
		List<StartMenuDTO> middleMenus = selfitDao.selectByScNum("02");
		List<StartMenuDTO> advMenus = selfitDao.selectByScNum("03");
		
		model.addAttribute("MENUMAPS", beginMenus);
		model.addAttribute("MENUMAPS", middleMenus);
		model.addAttribute("MENUMAPS", advMenus);
		}

	@Override
	public void getDaySetList(Model model, String sc_num) {
		List<StartMenuDTO> daySetList = selfitDao.selectDaySet(sc_num);
		
		model.addAttribute("DAYS", daySetList);
	}
	}
	

