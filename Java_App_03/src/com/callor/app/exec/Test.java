package com.callor.app.exec;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 32, 5434, 5, 3, 6, 5, 2, 534, 26, 1, 34, 23, 4, 56, 4, 743, 54 };
		sort(arr);
	}

	public static void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
