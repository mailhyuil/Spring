package com.sb.toby.impl;

import com.sb.toby.inter.FlyBehavior;

//for strategy pattern
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("못날아 ㅠㅠㅠ");
	}

}
