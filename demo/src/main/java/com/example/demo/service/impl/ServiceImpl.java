package com.example.demo.service.impl;

import com.example.demo.service.Service;


public class ServiceImpl implements Service{
	public int kor;
	public int eng;
	public int math;
	private int sum;
	
	@Override
	public int sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}

	@Override
	public void print() {
		System.out.println(sum);
	}

	public int avg() {
		return sum/3;
	}

	
	
}
