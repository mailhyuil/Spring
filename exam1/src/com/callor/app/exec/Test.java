package com.callor.app.exec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test {
	public static void main(String[] args) {
		String fileName = "src/com/callor/app/exec/data.txt";
		Reader fr = null;
		BufferedReader buffer = null;
		try {
			fr = new FileReader(fileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String line = buffer.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			buffer.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
