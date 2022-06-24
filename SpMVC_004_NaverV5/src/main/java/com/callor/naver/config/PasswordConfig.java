package com.callor.naver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

<<<<<<< HEAD

/*
 * JAVA Configuration
 * *-context.xml 파일 대신에 java class를 사용하여 bean 설정하기
 */

=======
/*
 * *-context.xml 파일 대신에 Java class 를 사용하여 bean 설정하기
 */
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
@Configuration
public class PasswordConfig {
	
	@Bean
<<<<<<< HEAD
	public PasswordEncoder passwordEncoder() {
=======
	public PasswordEncoder paswordEncoder() {
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		PasswordEncoder encoder = new BCryptPasswordEncoder(4);
		return encoder;
	}
	
}
