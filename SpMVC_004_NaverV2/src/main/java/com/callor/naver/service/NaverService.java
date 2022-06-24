package com.callor.naver.service;

import java.util.List;

<<<<<<< HEAD
public interface NaverService {

=======
import com.callor.naver.model.BookVO;

public interface NaverService {
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
	public String queryString(String cat, String search);
	public List<Object> getNaver(String queryString);
	
}
