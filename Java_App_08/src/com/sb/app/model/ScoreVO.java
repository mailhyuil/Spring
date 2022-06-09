package com.sb.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ScoreVO {
	private String stName;
	
	private int intKor;
	private int intEng;
	private int intMath;
	
	public int getIntSum() {
		int sum = intKor + intEng + intMath;
		return sum;
	}
	
	public float getAvg() {
		float avg = (float)getIntSum()/3;
		return avg;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += String.format("%-10s\t", stName);
		result += String.format("%5d\t", intKor);
		result += String.format("%5d\t", intEng);
		result += String.format("%5d\t", intMath);
		
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\n", getAvg());
		return result;
	}
}
