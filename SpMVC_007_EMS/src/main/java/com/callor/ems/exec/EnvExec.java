package com.callor.ems.exec;

import java.util.Map;

public class EnvExec {
<<<<<<< HEAD
	
	public static void main(String[] args) {
		
		Map<String, String> envList = System.getenv();
		String naverPass = envList.get("NAVER");
		System.out.println(naverPass);
		
	}

=======
	public static void main(String[] args) {
		
		Map<String, String> envList = System.getenv();
		
		String naverPass = envList.get("NAVER");
		
		System.out.println(naverPass);
		
	}
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
}
