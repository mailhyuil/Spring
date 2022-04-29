package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {
	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);

		int count = 0;
		int index = 0;
		int maxNum = 0;
		for (int num : nums) {
			if (num > maxNum) {
				maxNum = num;
				index = count;
			}
			count++;
		}
		System.out.printf("%d번째 %d\n", index, maxNum);
		int i = nums.indexOf(maxNum);
		System.out.println("가장 큰 수가 가장 처음 나타난 위치" + i);
	}

}
