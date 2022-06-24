package com.sb.api.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.api.model.AcademyVO;
import com.sb.api.model.AcademyParent;
import com.sb.api.model.AcademyVO;
import com.sb.api.service.AcademyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AcademyServiceImpl implements AcademyService {

	public Object URLCallScanner() {
		URL url = null;
		HttpURLConnection httpCon = null;
		Scanner scanner = null;
		try {
<<<<<<< HEAD
			url = new URL(
=======
			url = new URL( 
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
					"https://open.neis.go.kr/hub/acaInsTiInfo?KEY=ebd806fdca3043fa9fcd0c65ee839914&Type=json&pIndex=1&pSize=100&ATPT_OFCDC_SC_CODE=T10");
			httpCon = (HttpURLConnection) url.openConnection();

			httpCon.setRequestMethod("GET");
			scanner = new Scanner(httpCon.getInputStream());

			String retString = "";

			while (scanner.hasNextLine()) {
				retString += scanner.nextLine();
			}

			ObjectMapper mapper = new ObjectMapper();

			try {
				AcademyParent vo = mapper.readValue(retString, AcademyParent.class);
				AcademyVO mvo = mapper.readValue(mapper.writeValueAsString(vo.getAcaInsTiInfo()[1]), AcademyVO.class);

				return mvo.getRow()[0];
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String URLCallBuffer() {
		URL url = null;
		HttpURLConnection httpCon = null;
		try {
<<<<<<< HEAD

=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
			url = new URL("https://yts.mx/api/v2/list_movies.json?minimum_rating=8&sort_by=year/");
			httpCon = (HttpURLConnection) url.openConnection();

			httpCon.setRequestMethod("GET");

			int resCode = httpCon.getResponseCode();

			InputStreamReader is = null;
			BufferedReader buffer = null;

			// Naver 가 200코드를 보내면
			if (resCode == 200) {
				// 데이터를 받아올 통로를 연결하기
				is = new InputStreamReader(httpCon.getInputStream());
			} else {
				// 만약 200코드가 아니면
				// 오류메시지를 받을 통로를 연결하기
				is = new InputStreamReader(httpCon.getErrorStream());
			}
			buffer = new BufferedReader(is);
			String retString = "";
			while (true) {
				String line = buffer.readLine();
				if (line == null)
					break;
				retString += line;
			}
			return retString;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Object restTemplate() {
		URI uri = null;
		try {
<<<<<<< HEAD
//https://open.neis.go.kr/hub/acaInsTiInfo?KEY=ebd806fdca3043fa9fcd0c65ee839914&Type=json&pIndex=1&pSize=100&ATPT_OFCDC_SC_CODE=T10
=======
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
			uri = new URI(
					"https://open.neis.go.kr/hub/acaInsTiInfo?KEY=ebd806fdca3043fa9fcd0c65ee839914&Type=json&pIndex=1&pSize=100&ATPT_OFCDC_SC_CODE=T10");
		} catch (Exception e) {
			// TODO: handle exception
		}

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>("parameter", headers);

		RestTemplate restTemplate = new RestTemplate();

<<<<<<< HEAD
		ResponseEntity<String> respEntity = restTemplate.exchange(
				uri, 
				HttpMethod.GET, 
				null,
				String.class);
=======
		ResponseEntity<String> respEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				});
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc

		System.out.println("=".repeat(100));
		System.out.println(respEntity.getBody());
		System.out.println("=".repeat(100));

		return respEntity.getBody();

	}

}
