package com.callor.images.persistance;

import java.util.List;

public interface GenericDao<VO, PK> {
<<<<<<< HEAD
=======
	
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
	public List<VO> selectAll();
	public VO findById(PK id);
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(PK id);
<<<<<<< HEAD
=======

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
