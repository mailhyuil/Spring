package com.sb.toby.impl;

import com.sb.toby.inter.Bird;
import com.sb.toby.inter.FlyBehavior;
import com.sb.toby.inter.SingBehavior;

// template callback pattern
public class Duck implements Bird{

	@Override
	public void sing() {
		System.out.println("노래시작!");
		
		new SingBehavior() {
			@Override
			public void sing() {
				System.out.println("아름답게 노래부르는 중 ...");
			}
		}.sing();
		
		System.out.println("노래끝!");
		System.out.println();
	}

	@Override
	public void fly() {
		System.out.println("날 준비!");
		
		new FlyBehavior() {
			@Override
			public void fly() {
				System.out.println("못날아 ㅠㅠ");
			}
		}.fly();
		
		System.out.println("끝!");
		System.out.println();
	}

}
