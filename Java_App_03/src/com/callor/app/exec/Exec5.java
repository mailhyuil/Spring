package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec5 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100 + 1));
		}

		int size = nums.size();
		int num = 0;
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (nums.get(i) >= 55) {
				num = nums.get(i);
				index = i;
			}
		}
		System.out.printf("마지막 '55 이상의 수'는 %d번째 %d입니다.\n", index, num);

		int lastIndex = 0;
		for (int i = 0; i < size; i++) {
			int n = nums.get(i);
			if (n >= 55) {
				lastIndex = i;
			}
		}
		System.out.println(lastIndex);

		for (int i = size - 1; i > -1; i--) {
			if (nums.get(i) >= 55) {
				System.out.println(i);
				break;
			}
		}
	}

}
