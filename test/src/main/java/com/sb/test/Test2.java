package com.sb.test;

public class Test2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 13 + 2);
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			for (j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					break;
				}
			}
			if (j >= arr[i]) {
				count++;
				System.out.println(arr[i] + "는 소수입니다");
			}
		}
		System.out.println("소수의 개수: " + count);
	}
}
