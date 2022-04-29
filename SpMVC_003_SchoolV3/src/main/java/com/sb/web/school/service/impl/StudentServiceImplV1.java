package com.sb.web.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.web.dao.StudentDAO;
import com.sb.web.domain.StudentVO;
import com.sb.web.school.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {

	private final StudentDAO stDao;
	
	public StudentServiceImplV1(StudentDAO stDao) {
		this.stDao = stDao;
	}
	
	@Override
	public List<StudentVO> selectAll() {
		return stDao.selectAll();
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		return stDao.findByNum(stNum);
	}

	@Override
	public Integer insert(StudentVO stVO) {
		return null;
	}

	@Override
	public Integer update(StudentVO stVO) {
		return null;
	}

	@Override
	public Integer delete(String stNum) {
		return null;
	}

	@Override
	public List<StudentVO> findByStTel(String stTel) {
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		return null;
	}

	@Override
	public List<StudentVO> findByStAddr(String stAddr) {
		return null;
	}

}
