package com.sb.api.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sb.api.service.impl.AcademyServiceImpl;

import lombok.extern.slf4j.Slf4j;

/*
 * /api/src/main/webapp/WEB-INF/views
 * /api/src/main/java/com/sb/api/controller/MapController.java
 * /api/src/main/resources/log4j.xml
 */

@Slf4j
@Controller
public class HomeController {
	AcademyServiceImpl service = new AcademyServiceImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		File note = new File("C:/Users/sangb/Desktop/Spring/api/target/classes/hello.txt");
		// Resource
		// ResourceLoader
		try {
			Scanner scan =  new Scanner(System.in);
			if(!note.exists()) {
				note.createNewFile();				
			}
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(note));
			
			writer.write("heelow!!");
			
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			

		return "home";
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return null;
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(String test, @RequestBody String dataFromClient) {
		System.out.println(test);
		System.out.println(dataFromClient);
		return null;
	}

	@RequestMapping(value = "/httpClient", method = RequestMethod.GET)
	public void httpClient() {
		try {
			HttpClient client = HttpClientBuilder.create().build();// HttpClient 생성

			HttpGet getRequest = new HttpGet("https://yts.mx/api/v2/movie_details.json?movie_id=42563"); // GET 메소드 URL
																											// 생성

// 			getRequest.addHeader("x-api-key", RestTestCommon.API_KEY); // KEY 입력

			HttpResponse response = client.execute(getRequest); // Response 출력

			if (response.getStatusLine().getStatusCode() == 200) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				System.out.println("=".repeat(50));
				System.out.println(body);
				System.out.println("=".repeat(50));
			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	@RequestMapping(value = "/httpClient", method = RequestMethod.POST)
	public void httpClient(String requestURL, String jsonMessage) {
		try {
			HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성
			HttpPost postRequest = new HttpPost(requestURL); // POST 메소드 URL 새성
			postRequest.setHeader("Accept", "application/json");
			postRequest.setHeader("Connection", "keep-alive");
			postRequest.setHeader("Content-Type", "application/json");
//			postRequest.addHeader("x-api-key", RestTestCommon.API_KEY); // KEY 입력
// 			postRequest.addHeader("Authorization", token); // token 이용시
			postRequest.setEntity(new StringEntity(jsonMessage)); // json 메시지 입력
			HttpResponse response = client.execute(postRequest); // Response 출력
			if (response.getStatusLine().getStatusCode() == 200) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				System.out.println(body);
			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		String str = "asdfasdf010-0000-0000sdfdfsd";

		Pattern pattern = Pattern.compile("\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d");
		Matcher matcher = pattern.matcher(str);

		String matchedRegex = "";
		if (matcher.find()) {
			matchedRegex = matcher.group(0).trim();
		}
		System.out.println(matchedRegex);
	}
}
