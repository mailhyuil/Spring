package com.sb.app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ScoreVO {
	private int intKor;
	private int intMath;
	private int intEng;
}
