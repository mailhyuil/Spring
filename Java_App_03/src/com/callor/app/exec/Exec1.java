package com.callor.app.exec;

public class Exec1 {
	public static void main(String[] args) {
		int[] nums = GetValue.getArray(100);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 55) {
				System.out.println(nums[i]);
			}
		}
	}
}
