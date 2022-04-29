package com.sb.web.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.web.domain.StudentVO;
import com.sb.web.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {

	@Override
	public List<StudentVO> selectAll() {
		return null;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		return null;
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
