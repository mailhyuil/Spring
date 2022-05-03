package com.sb.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sb.app.dbconfig.DBConnection;
import com.sb.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;

	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
		// TODO Auto-generated constructor stub
	}

	public List<StudentVO> selectAll() throws SQLException {
		String sql = "SELECT * FROM tbl_student";
		PreparedStatement pstmt = null;

		pstmt = dbConn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		List<StudentVO> stList = new ArrayList<>();

		while (rs.next()) {
			/*
			StudentVO stVO = new StudentVO(
			rs.getString("st_num"),
			rs.getString("st_name"),
			rs.getString("st_tel"),
			rs.getString("st_addr"),
			rs.getString("st_dept"),
			rs.getInt("st_grade")
			);
			*/
			
			/*
			StudentVO stVO = new StudentVO();
			stVO.setStNum(rs.getString("st_num"));
			stVO.setStName(rs.getString("st_name"));
			stVO.setStTel(rs.getString("st_tel"));
			stVO.setStAddr(rs.getString("st_addr"));
			stVO.setStDept(rs.getString("st_dept"));
			stVO.setStGrade(rs.getInt("st_grade"));
			*/

			
			StudentVO stVO = StudentVO.builder()
					.stNum(rs.getString("st_num"))
					.stName(rs.getString("st_name"))
					.stTel(rs.getString("st_tel"))
					.build();
		}

		return null;
	}

}
