package com.callor.naver.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.callor.naver.config.NaverConfig;
import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.NaverChannel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.Naver_V2)
public class NaverServiceImplV2 extends NaverServiceImpl {

	@Override
	public String queryString(String cat, String search) {
		
		this.cat = cat;
		
		String queryString = NaverConfig.NAVER_BOOK_XML_URL;		
		String encodeSearch = null;
		
		try {
			encodeSearch = URLEncoder.encode(search, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log.debug("URL Encoding 오류발생");
			return null;
		}
		
		queryString += String.format("?query=%s", encodeSearch);
		log.debug("Query : " + queryString);
		
		return queryString;
	}
	
	@Override
	public List<Object> getNaver(String queryString) {

		URI restURI = null;
		try {
			restURI = new URI(queryString);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			log.debug("URI 문법오류");
			return null;
		}

		// HTTP 프로토콜에 보안 정보를 세팅하여
		// NAVER로 전송할 준비
		HttpHeaders headers = new HttpHeaders();

		headers.set(NaverConfig.HEADER.ID, NaverConfig.NAVER_CLIENT_ID);
		headers.set(NaverConfig.HEADER.SEC, NaverConfig.NAVER_CLIENT_SEC);
		// XML 데이터 타입으로 받겠다
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML)); // json데이터 안깨지게
		// headers에 추가된 정보를 entity type의 객체로 변환하기
		HttpEntity<String> entity = new HttpEntity<String>("parameter", headers);
		RestTemplate restTemp = new RestTemplate();

		ResponseEntity<String> resData = null;
		
		resData = restTemp.exchange(restURI, 
				HttpMethod.GET, 
				entity, 
				String.class);
		
		System.out.println("=".repeat(100));
		System.out.println(resData.getBody());
		System.out.println("=".repeat(100));

		String xmlString = resData.getBody();
		
		ObjectMapper xmlMapper = new XmlMapper();
		
		try {
			NaverChannel naverChannel = xmlMapper.readValue(xmlString, 
					NaverChannel.class);
			log.debug(naverChannel.channel.item.toString());
			return naverChannel.channel.item;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;

	}

}
