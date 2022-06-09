package com.example.demo.controller;

import java.net.URI;
import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.MovieParent;
import com.example.demo.domain.MovieVO;
import com.example.demo.service.Service;
import com.example.demo.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces = "application/json")
	public String home(Model model) {
		URI uri = null;
		try {
			uri = new URI("https://open.neis.go.kr/hub/acaInsTiInfo?KEY=ebd806fdca3043fa9fcd0c65ee839914&TYPE=json&ATPT_OFCDC_SC_CODE=T10");
			
		} catch (Exception e) {
			log.debug("URL 예외가 발생");
		}
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<String>("parameter", headers);
		
		RestTemplate restTemplate  = new RestTemplate();

			ResponseEntity<String> respEntity =
					restTemplate.exchange(
							uri, 
							HttpMethod.GET,
							entity,
							String.class);
			System.out.println("=".repeat(100));
			log.debug("JSON", respEntity.getBody().toString());
			System.out.println("=".repeat(100));
			
			model.addAttribute("VO", respEntity.getBody());

		
		return "home";
	}
}
