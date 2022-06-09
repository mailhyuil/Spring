package com.sb.app.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec07 {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader buffer = null;
		try {
			reader = new FileReader("src/com/sb/app/exec/data.txt");
			buffer = new BufferedReader(reader);
			while (true) {
				String line = buffer.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			buffer.close();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
