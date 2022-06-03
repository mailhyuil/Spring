package com.callor.naver.service.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.callor.naver.config.NaverConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaverBookServiceEx {
	
	/*
	 * cat과 search에 담긴 값을 전달받아서
	 * Naver에 요청할 QueryString을 생성하는 매소드
	 */
	public String queryString(String cat, String search) {
		String queryString = NaverConfig.NAVER_BOOK_URL;
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
			url = new URL(queryString);
			httpCon = (HttpURLConnection) url.openConnection();
			
			// GET 방식으로 요청한다
			httpCon.setRequestMethod("GET");
			
			httpCon.setRequestProperty(NaverConfig.HEADER.ID,
					NaverConfig.NAVER_CLIENT_ID);
			httpCon.setRequestProperty(NaverConfig.HEADER.SEC,
					NaverConfig.NAVER_CLIENT_SEC);
			
			int resCode = httpCon.getResponseCode();
			
			InputStreamReader is = null;
			BufferedReader buffer = null;
			
			// Naver 가 200코드를 보내면
			if(resCode == 200) {
				// 데이터를 받아올 통로를 연결하기
				is = new InputStreamReader(httpCon.getInputStream());
			} else {
				// 만약 200코드가 아니면
				// 오류메세지를 받을 통로를 연결하기
				is = new InputStreamReader(httpCon.getErrorStream());
			}
			buffer = new BufferedReader(is);
			
			String retString = "";
			while(true) {
				String line = buffer.readLine();
				if(line == null) break;
				
				retString += line;
			}
			buffer.close();
			is.close();

			return retString;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			log.debug("Query String 문자열 오류");
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.debug("네트워크 연결을 할 수 없음");
			return null;
		}
		
	}
}
