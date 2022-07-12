package com.callor.naver.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * *-context.xml 파일 대신에 Java class 를 사용하여 bean 설정하기
 */
public class BCryptPasswordEncoder2 extends BCryptPasswordEncoder{

	public BCryptPasswordEncoder2(int strength) {
		super(2);
	}
	
}
