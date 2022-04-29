package com.sb.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		int count = 0;
		for (int num : nums) {
			count += prime(num);
		}
		System.out.println("소수의 개수 : " + count);
	}

	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
