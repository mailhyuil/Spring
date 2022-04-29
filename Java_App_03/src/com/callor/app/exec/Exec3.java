package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);

		int size = nums.size();

		for (int i = 0; i < size; i++) {
			if (nums.get(i) >= 55) {
				System.out.printf("%d번째 %d\n", i, nums.get(i));
			}
		}

		/*
		 * for(int num:nums) { count++; if(num >= 55) {
		 * System.out.printf("%d번째 %d\n",count,num); } }
		 */

	}
}
