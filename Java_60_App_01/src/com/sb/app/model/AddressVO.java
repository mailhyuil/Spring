package com.sb.app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class AddressVO {
	
	private String name;
	private String tel;
	private String addr;
	private int age;
	private String hobby;
}
