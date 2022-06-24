package com.schoolverse.app.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.schoolverse.app.model.BasketVO;

public interface BasketDao extends GenericDao<BasketVO, String> {
<<<<<<< HEAD
	public String findByClassAndId(@Param("c_code") String c_code,@Param("u_id") String u_id);
=======
	public String findByClassAndId(@Param("c_code") long c_code,@Param("u_id") String u_id);
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
	public List<BasketVO> findByClass(String c_code);
	public List<String> selectAcademyByClassCode(String c_code);
	public List<String> findClassListById(String u_id);
	
	public int delete(@Param("c_code") String c_code,@Param("u_id") String u_id);
}
