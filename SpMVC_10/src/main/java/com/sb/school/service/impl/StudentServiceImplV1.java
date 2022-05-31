package com.sb.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.school.model.StudentVO;
import com.sb.school.persistance.StudentDao;
import com.sb.school.service.StudentService;


@Service
public class StudentServiceImplV1 implements StudentService {
	
	private final StudentDao stDao;
	
	public StudentServiceImplV1(StudentDao stDao) {
		this.stDao = stDao;
	}
	
/*//////////////////////////////////////////////////////////////////////*/
	
	@Override
	public List<StudentVO> selectAll(){
		List<StudentVO> stList = stDao.selectAll();
		return stList;
	}
	
	@Override
	public StudentVO findById(String id) {
		
		return stDao.findById(id);
	}

	@Override
	public int insert(StudentVO vo) {
		return 0;
	}

	@Override
	public int update(StudentVO vo) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}


}
