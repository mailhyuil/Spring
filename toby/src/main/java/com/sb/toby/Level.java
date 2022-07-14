package com.sb.toby;

public enum Level {
	BASIC(0, "basic"), SLIVER(1, "sliver"), GOLD(2, "gold");
	
	private final int value;
	private final String name;
	
	Level(int value, String name) { // 순서 중요
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
}
