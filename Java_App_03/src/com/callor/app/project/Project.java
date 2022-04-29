package com.callor.app.project;

public class Project {
	public static void main(String[] args) {
		int stNum = (int) ((Math.random() * 25) + 25);

		if (stNum % 6 > 0) {
			System.out.println("주문할 피자는 " + ((stNum / 6) + 1) + "판입니다.");
		} else {
			System.out.println("주문할 피자는 " + (stNum / 6) + "판입니다.");
		}

		System.out.println(stNum / 6);
		System.out.println(stNum % 6);
		
//		for (int i = stNum - 1; i > -1; i--) {
//			if ((6 * i) > stNum) {
//				temp = i;
//			}
//		}
	}
}
