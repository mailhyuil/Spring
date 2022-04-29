package com.sb.app.service;

import com.sb.app.domain.StudentVO;

public interface StudentService {
	public int insert(StudentVO studentVO);
	public StudentVO[] selectAll();
	public StudentVO findById(String stNum);
}
