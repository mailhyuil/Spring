package com.sb.app.exec;

public class Exec04 {
	public static void main(String[] args) {
		String str1 = "1";
		String str2 = "2";

		int comp = str1.compareTo(str2);
		System.out.println(comp);
		comp = str2.compareTo(str1);
		System.out.println(comp);
		comp = str2.compareTo(str2);
		System.out.println(comp);
		
		String[] strs = {"F", "A", "C", "B", "D"};
		
		for(String str : strs) {
			System.out.print(str + "\t");			
		}
		
		for (int i = 0; i < strs.length; i++) {
			for(int j = i + 1; j < strs.length; j ++) {
				if(strs[i].compareTo(strs[j]) > 0) {
					String _str = strs[i];
					strs[i] = strs[j];
					strs[j] = _str;
				}
			}
		}
		System.out.println();
		for(String str:strs) {
			System.out.println("%s\t");
		}
	}
}
