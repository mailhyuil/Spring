package com.sb.app.controller;

import java.sql.SQLException;
import java.util.List;

import com.sb.app.model.StudentVO;
import com.sb.app.persistance.StudentDao;

public class StudentController {
	public static void main(String[] args) {
		StudentDao stDao = new StudentDao();
		try {
			List<StudentVO> stList = stDao.selectAll();
			for(StudentVO stVO : stList) {
				System.out.println(stVO.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
