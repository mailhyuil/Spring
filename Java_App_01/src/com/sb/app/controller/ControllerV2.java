package com.sb.app.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.sb.app.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		/*
		 * ServiceV2에는 기본 생성자가 없기 때문에
		 * 기본 생성자를 호출하여 인스턴스를 생성할 수 없다
		 * 그 이유는 ServiceV2에는 내부에서 사용하는
		 * intList 를 초기화하는 코드가 없고
		 * ServiceV2를 호출하는 외부에서
		 * 초기화된 list 인수를 넣어서 초기화시킨다.
		 * 
		 * 만약 기본생성자를 호출하여 객체를 만들게 되면
		 * intList에서 NullpointerException이 발생할 것이다.
		 * 그러한 이유로 기본 생성자를 아예 호출하지 못하도록 만든다
		 * 기본 생성자에서 intList를 초기화 하는 코드를 추가할 수 있지만,
		 * ServiceV2 클래스의 생성자가 복잡해질 수 있다.
		 */
		
		List<Integer> scoreList = new ArrayList<>();
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new Stack<>();
		List<Integer> list3 = new LinkedList<>();
		List<Integer> list4 = new Vector<>();
		
		scoreList.add(1);
	}
}
