package com.schoolverse.app.persistence;

<<<<<<< HEAD
import com.schoolverse.app.model.AcademyVO;

public interface AcademyDao extends GenericDao<AcademyVO, String> {
	public AcademyVO findByName(String aca_name);
=======
import java.util.List;

import com.schoolverse.app.model.AcademyVO;

public interface AcademyDao extends GenericDao<AcademyVO, String> {
	public List<AcademyVO> findByAcaRegion(String aca_region);
	public List<AcademyVO> findByAcaSubject(String aca_subject);
	public List<AcademyVO> findByAcaAge(String aca_age);
	public AcademyVO findByAcaCode(long aca_code);
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
