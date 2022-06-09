package com.callor.naver.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.NaverConfig;
import com.callor.naver.config.QualifierConfig;
<<<<<<< HEAD
=======
import com.callor.naver.model.BookVO;
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
import com.callor.naver.service.NaverService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
<<<<<<< HEAD
@Service(QualifierConfig.SERVICE.NAVER_V0)
public class NaverServiceImpl implements NaverService {

	protected String cat = "BOOK";
	
	/*
	 * cat 와 search 에 담긴 값을 전달받아서
	 * Naver 에 요청할 QueryString 을 생성하는 method
	 */
	public String queryString(String cat, String search) {

		this.cat = cat;
		
		// https://open..../book.json
		String queryString = NaverConfig.NAVER_BOOK_URL;
		if(cat.equals("NEWS")) {
			queryString = NaverConfig.NAVER_NEWS_URL;
		} else if(cat.equals("MOVIE")) {
			queryString = NaverConfig.NAVER_MOVIE_URL;
		}
		
		String encodeSearch = null;
		try {
			encodeSearch = URLEncoder.encode(search,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			log.debug("URL Encoding 오류발생");
			return null;
		}
		queryString += String.format("?query=%s", encodeSearch);
		log.debug("Query : " + queryString);
		
		queryString += String.format("&display=%d", 10);
		return queryString;
		
	} // queryString() end
	
	// queryString 전달받아 Naver 에 데이터를 요청하고
	// 응답받은 JSON String 을 return 하기
	public String getJsonString(String queryString) {
		
		// java.net.URL 을 import
		URL url = null;
		HttpURLConnection httpCon = null;
		
		// queryString(URL, 요청정보)를 사용하여
		// Network 통해서 보낼 데이터로 생성하기
		try {
			
=======
@Service(QualifierConfig.SERVICE.Naver_V0)
public class NaverServiceImpl implements NaverService{
	protected String cat = "BOOK";
	
	/*
	 * cat과 search에 담긴 값을 전달받아서
	 * Naver에 요청할 QueryString을 생성하는 매소드
	 */
	
	public String queryString(String cat, String search) {
		
		this.cat = cat;
		
		String queryString = NaverConfig.NAVER_BOOK_URL;
		
		if(cat.equals("NEWS")) {
				queryString = NaverConfig.NAVER_NEWS_URL;
		} else if(cat.equals("MOVIE")) {
			queryString = NaverConfig.NAVER_MOVIE_URL;
			
		}
		
		String encodeSearch = null;
		
		try {
			encodeSearch = URLEncoder.encode(search, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log.debug("URL Encoding 오류발생");
			queryString += String.format("&display=%s", 20);
			return queryString;
		}

		queryString += String.format("?query=%s", encodeSearch);
		log.debug("Query : " + queryString);
		
		return queryString;
	} //queryString() end
	
	
	
	
	public String getJsonString(String queryString) {
		
		URL url = null;
		
		HttpURLConnection httpCon = null;
		// queryString(URL, 요청정보)를 사용하여 
		// 네트워크를 통해서 보낼 데이터로 생성하기
		
		try {
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			url = new URL(queryString);
			httpCon = (HttpURLConnection) url.openConnection();
			
			// GET 방식으로 요청한다
			httpCon.setRequestMethod("GET");
			
<<<<<<< HEAD
			// httpCon.setRequestProperty(
			//		"X-Naver-Client-Id",
			//		NaverConfig.NAVER_CLIENT_ID);
			httpCon.setRequestProperty(
					NaverConfig.HEADER.ID, 
					NaverConfig.NAVER_CLIENT_ID);
			httpCon.setRequestProperty(
					NaverConfig.HEADER.SEC, 
					NaverConfig.NAVER_CLIENT_SEC);
			
			// Naver 에게 queryString 정보를 보내고
			// response 해줄 데이터가 있는지 먼저 확인한다
=======
			httpCon.setRequestProperty(NaverConfig.HEADER.ID,
					NaverConfig.NAVER_CLIENT_ID);
			httpCon.setRequestProperty(NaverConfig.HEADER.SEC,
					NaverConfig.NAVER_CLIENT_SEC);
			
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			int resCode = httpCon.getResponseCode();
			
			InputStreamReader is = null;
			BufferedReader buffer = null;
<<<<<<< HEAD

=======
			
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			// Naver 가 200코드를 보내면
			if(resCode == 200) {
				// 데이터를 받아올 통로를 연결하기
				is = new InputStreamReader(httpCon.getInputStream());
			} else {
				// 만약 200코드가 아니면
<<<<<<< HEAD
				// 오류메시지를 받을 통로를 연결하기
				is = new InputStreamReader(httpCon.getErrorStream());
			}
			buffer = new BufferedReader(is);
=======
				// 오류메세지를 받을 통로를 연결하기
				is = new InputStreamReader(httpCon.getErrorStream());
			}
			buffer = new BufferedReader(is);
			
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			String retString = "";
			while(true) {
				String line = buffer.readLine();
				if(line == null) break;
<<<<<<< HEAD
				retString += line;
			}
=======
				
				retString += line;
			}
			buffer.close();
			is.close();

>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			return retString;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			log.debug("Query String 문자열 오류");
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
<<<<<<< HEAD
			log.debug("네트워크 연결을 할수 없음");
=======
			log.debug("네트워크 연결을 할 수 없음");
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
			return null;
		}
		
	}

	@Override
	public List<Object> getNaver(String queryString) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return null;
	}
	
	
=======
		return null;
	}
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
}
