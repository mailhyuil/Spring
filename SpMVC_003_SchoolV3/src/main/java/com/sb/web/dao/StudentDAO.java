package com.sb.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sb.web.domain.StudentVO;
import com.sb.web.school.dbconfig.DBConnection;
import com.sb.web.school.dbconfig.DBContract;

/*
 * DAO 클래스
 * Data Access Object
 * DB와 연동하여 SQL을 보내고, 데이터를 수신하는 기능을 수행한다
 */

@Component
public class StudentDAO {
	private final Connection dbConn;
	
	public StudentDAO() {
		dbConn = DBConnection.getDBConnection();
	}
	
	public List<StudentVO> selectAll(){
		/*
		 * JDBC를 통하여 DBMS에게 Query를 보내고
		 * 데이터를 수신하는 객체
		 */
		PreparedStatement pstmt = null;
		String sql = DBContract.ST.SELECT;
		
		// sql문을 전달할 준비
		try {
			pstmt = dbConn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			List<StudentVO> stList = new ArrayList<>();
			
			// 가져올 데이터가 있는지 물어보고
			// 있으면 읽어올 수 있도록 준비
			while(rs.next()) {
				StudentVO stVO = new StudentVO();
				stVO.setStNum(rs.getString(DBContract.ST_COL.ST_NUM));
				stVO.setStName(rs.getString(DBContract.ST_COL.ST_NAME));
				stVO.setStDept(rs.getString(DBContract.ST_COL.ST_DEPT));
				stVO.setStrAddr(rs.getString(DBContract.ST_COL.ST_ADDR));
				stVO.setStTel(rs.getString(DBContract.ST_COL.ST_TEL));
				stVO.setIntGrade(rs.getInt(DBContract.ST_COL.ST_GRADE));	
				
				stList.add(stVO);
			}
			rs.close();
			pstmt.close();
			
			return stList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} // end selectAll
	
	public StudentVO findByNum(String stNum) {
		PreparedStatement pstmt = null;
		String sql = DBContract.ST.SELECT;
		sql += " WHERE st_Num=?";
		
		try {
			pstmt = dbConn.prepareStatement(sql);
			pstmt.setString(1, stNum);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			StudentVO stVO = new StudentVO();
			stVO.setStNum(rs.getString(DBContract.ST_COL.ST_NUM));
			stVO.setStName(rs.getString(DBContract.ST_COL.ST_NAME));
			stVO.setStDept(rs.getString(DBContract.ST_COL.ST_DEPT));
			stVO.setStrAddr(rs.getString(DBContract.ST_COL.ST_ADDR));
			stVO.setStTel(rs.getString(DBContract.ST_COL.ST_TEL));
			stVO.setIntGrade(rs.getInt(DBContract.ST_COL.ST_GRADE));
			
			rs.close();
			pstmt.close();
			
			return stVO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
