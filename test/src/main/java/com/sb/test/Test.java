package com.sb.test;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 13 + 2);
			System.out.println(arr[i]);
		}

		int count = 0;

		for (int ar : arr) {
			int index = 0;
			for (index = 2; index < ar; index++) {
				if (ar % index == 0) {
					break;
				}
			}
			if (index >= ar) {
				count++;
			}
		}
		System.out.println("소수의 개수" + count);
	}
}
