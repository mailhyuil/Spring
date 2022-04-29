package com.sb.app.controller;

import java.util.Arrays;

import com.sb.app.service.ServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		
		sV1.makeScore();
		sV1.getIntList();
		System.out.println(sV1.getIntList());
		System.out.println(Arrays.toString(sV1.getArrNum()));
		System.out.println(sV1.num);
	}
}
