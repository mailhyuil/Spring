package com.callor.ems.exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class MakeNaverUser {
	public static void main(String[] args) {
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		// 암호화 도구
		StandardPBEStringEncryptor pbEnc = new StandardPBEStringEncryptor();
		// 환경변수
		Map<String, String> envList = System.getenv();
		
		String saltPass = envList.get("NAVER");
		System.out.println(saltPass);
		if(saltPass == null) {
			System.out.println("NAVER 환경변수를 설정해주세요");
			return;
		}
		pbEnc.setAlgorithm("PBEWithMD5AndDES");
		pbEnc.setPassword(saltPass);
		
		String propsDir = "./src/main/webapp/WEB-INF/spring/props";
		
		
		Map<String, String[]> secFiles = new TreeMap<>();
		
		secFiles.put("naver.email.properties", 
				new String[] {"naver.username", "naver.password"}
		);
		
		Set<String> files = secFiles.keySet();
		
		for(String file:files) {
			File propsFile = new File(propsDir, file);
			
			try {
				PrintWriter out = new PrintWriter(propsFile);
				
				System.out.println(file);
				String[] datas = secFiles.get(file);
				System.out.println("-".repeat(100));
				
				for(String data:datas) {
					System.out.printf("%s >> ",data);
					String value = scan.nextLine();
					out.printf("%s=ENC(%s)\n", data, pbEnc.encrypt(value));
				}
				out.close();
				System.out.println("-".repeat(100));
				System.out.println("File Writer OK!!!");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
//		System.out.println("이거 한글은 안귀엽다. 영어만 귀엽다. cute!");
	}
}
