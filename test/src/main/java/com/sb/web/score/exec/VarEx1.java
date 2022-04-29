package com.sb.web.score.exec;

public class VarEx1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName(args[0]);
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
