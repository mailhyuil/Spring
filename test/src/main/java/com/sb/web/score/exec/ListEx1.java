package com.sb.web.score.exec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Float> list2 = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.pop();
		
		System.out.println();
		
		
		map.put(0, 1);
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		System.out.println(map);
		System.out.println(map.get(0));
		
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		list2.add(6f);
		list2.add(7f);
		list2.add(8f);
		list2.add(9f);
		list2.add(10f);
		
		int list1_size = list1.size();
		for (int i = 0; i < list1_size; i++) {
			System.out.println(list1.get(i));
		}
	}
}
