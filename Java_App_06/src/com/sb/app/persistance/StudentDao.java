package com.sb.app.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sb.app.dbconfig.DBConnection;
import com.sb.app.dbconfig.DBContract;
import com.sb.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
		
	}
	
	/*
	 * Exception 처리하는 두가지 방법
	 * 1. Exception이 발생할 만한 코드를 try-catch로 묶어주는 방법
	 * 2. Exception을 나를 호출한 곳으로 던지기
	 * 
	 * Service에서 다음과 같이 selectAll() 을 호출할 것이다.
	 * List<StudentVO> stList = dao.selectAll();
	 * dao.selectAll()에서 exception이 발생하면
	 * dao.selectAll() 에서 예외를 직접처리하지 않고
	 * Service로 예외를 던지기
	 */
	public List<StudentVO> selectAll() throws SQLException{
		PreparedStatement pstmt = null;
		String sql = DBContract.ST_SELECT;
		pstmt = dbConn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		return getResult(rs);
	}
	
	private List<StudentVO> getResult(ResultSet rs) throws SQLException {
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rs.next()) {
			StudentVO stVO = StudentVO.builder()
					.stNum(rs.getString(DBContract.ST_COL.ST_NUM))
					.stName(rs.getString(DBContract.ST_COL.ST_NAME))
					.stDept(rs.getString(DBContract.ST_COL.ST_DEPT))
					.stTel(rs.getString(DBContract.ST_COL.ST_TEL))
					.stAddr(rs.getString(DBContract.ST_COL.ST_ADDR))
					.stGrade(rs.getInt(DBContract.ST_COL.ST_GRADE))
					.build();
			stList.add(stVO);
		}
		
		return stList;
	}
}
