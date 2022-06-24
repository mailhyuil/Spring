package com.schoolverse.app.persistence;

import com.schoolverse.app.model.AcademyVO;

public interface AcademyDao extends GenericDao<AcademyVO, String> {
	public AcademyVO findByName(String aca_name);
}
