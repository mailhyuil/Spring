package com.callor.ems.exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class MakeDBUser {
<<<<<<< HEAD
	
	public static void main(String[] args) {
		
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		
		// 암호화 도구
		StandardPBEStringEncryptor pbEnc = new StandardPBEStringEncryptor();
		
=======
	public static void main(String[] args) {
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		// 암호화 도구
		StandardPBEStringEncryptor pbEnc = new StandardPBEStringEncryptor();
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		// 환경변수
		Map<String, String> envList = System.getenv();
		
		String saltPass = envList.get("NAVER");
<<<<<<< HEAD
		System.out.println("salt Pass"  + saltPass);
		if(saltPass == null) {
			System.out.println("NAVER 환경변수를 설정해 주세요");
=======
		System.out.println(saltPass);
		if(saltPass == null) {
			System.out.println("NAVER 환경변수를 설정해주세요");
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
			return;
		}
		pbEnc.setAlgorithm("PBEWithMD5AndDES");
		pbEnc.setPassword(saltPass);
		
		String propsDir = "./src/main/webapp/WEB-INF/spring/props";
		
<<<<<<< HEAD
		Map<String, String[]> secFiles = new TreeMap<String, String[]>();
		secFiles.put("db.connection.properties",
				new String[] {"mysql.username","mysql.password"}
=======
		
		Map<String, String[]> secFiles = new TreeMap<>();
		
		secFiles.put("db.connection.properties", 
				new String[] {"mysql.username", "mysql.password"}
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
		);
		
		System.out.println(secFiles.get("db.connection.properties")[0]);
		System.out.println(secFiles.get("db.connection.properties")[1]);
		
		Set<String> files = secFiles.keySet();
		
<<<<<<< HEAD
		for(String file : files) {
			
			File propsFile = new File(propsDir, file);
			try {
				PrintWriter out = new PrintWriter(propsFile);
				System.out.println("=".repeat(100));
				
				System.out.println(file);
				String[] datas = secFiles.get(file);
				for(String data : datas) {
					System.out.printf("%s >> ",data );
					String value = scan.nextLine();
					out.printf("%s=ENC(%s)\n", data,pbEnc.encrypt(value));
				}
				out.flush();
				out.close();
				System.out.println("File Write OK!!!");
				
=======
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
				System.out.println("OK");
				System.out.println("-".repeat(100));
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
		}
	}

=======
			
		}
		
//		System.out.println("이거 한글은 안귀엽다. 영어만 귀엽다. cute!");
	}
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
}
