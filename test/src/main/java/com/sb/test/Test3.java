package com.sb.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Integer num = Integer.valueOf((int) (Math.random() * 100));
			nums.add(num);
		}
		int count = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			int num = nums.get(i);
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				count++;
			}

		}
		System.out.println("소수의 개수 : " + count);
	}
}
