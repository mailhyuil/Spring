package com.sb.toby.impl;

import com.sb.toby.inter.SingBehavior;

// for strategy pattern
public class BeautifulSing implements SingBehavior{

	@Override
	public void sing() {
		System.out.println("아름답게 노래 부르는 중..");
	}

}
