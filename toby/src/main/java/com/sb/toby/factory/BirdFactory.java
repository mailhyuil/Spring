package com.sb.toby.factory;

import com.sb.toby.impl.Duck;
import com.sb.toby.inter.Bird;

public class BirdFactory {
	public static Bird createBird(String type) {
		if(type == "duck") {
			return new Duck();
		}
		return null;
	}
}
