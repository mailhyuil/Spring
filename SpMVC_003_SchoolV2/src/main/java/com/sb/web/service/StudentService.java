package com.sb.web.service;

import java.util.List;

import com.sb.web.domain.StudentVO;

public interface StudentService {
	public List<StudentVO> selectAll();
	public StudentVO findByStNum(String stNum);
	public Integer insert(StudentVO stVO);
	public Integer update(StudentVO stVO);
	public Integer delete(String stNum);
	
	public List<StudentVO> findByStTel(String stTel);
	public List<StudentVO> findByStName(String stName);
	public List<StudentVO> findByStAddr(String stAddr);
}
