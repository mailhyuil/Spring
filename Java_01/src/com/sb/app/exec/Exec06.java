package com.sb.app.exec;

public class Exec06 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 91) + 10;
		}

		for (int i = 0; i < nums.length; i++) {
			int index = 0;
			for (index = 2; index < (nums[i] - 1); index++) {
				if (nums[i] % index == 0) {
					break;
				} 
			}
			if(nums[i] % index == 0) {
				System.out.println(nums[i] + "는 소수가 아닙니다.");
			} else {
				System.out.println(nums[i] + "는 소수입니다.");
			}
		}
	}
}
