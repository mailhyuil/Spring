package com.schoolverse.app.persistence;

import java.util.List;

import com.schoolverse.app.model.ClassVO;
import com.schoolverse.app.model.ScheduleVO;

public interface ClassDao extends GenericDao<ClassVO, String> {
<<<<<<< HEAD
	public List<ScheduleVO> findScheduleByClassCode(String c_code);
	public List<ClassVO> findByAcaCode(String aca_code);
=======
	public List<ScheduleVO> findScheduleByClassCode(long c_code);
	public List<ClassVO> findByAcaCode(long aca_code);
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
