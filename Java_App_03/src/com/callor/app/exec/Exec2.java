package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {
	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);
		for(int num:nums) {
			if(num >= 55) {
				System.out.println(num);
			}
		}
	}
}
