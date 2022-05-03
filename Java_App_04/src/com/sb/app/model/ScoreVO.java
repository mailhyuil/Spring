package com.sb.app.model;

/*
 * private 변수 선언:VO 클래스의 추상화된 데이터를 저장할 변수들
 * private 변수에 접근하기 위하여 getter, setter method 선언
 * 저장된 데이터를 확인하기위하여 toString() method도 재 정의
 * 
 * spring project 에서는 기본생성자, 모든 필드를 포함한 임의 생성자를 만들지만,
 * Console Project에서는 생성자는 생략해도 된다.
 */

public class ScoreVO {
	private int intKor;
	private int intEng;
	private int intMath;

	private int intSum;
	private float fAvg;

	private int intRank;

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		intSum = intKor + intEng + intMath;
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		fAvg = (float) getIntSum() / 3;
		return fAvg;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}

	@Override
	public String toString() {
		String scStr = String.format("%5d\t", intKor);
		scStr += String.format("%5d\t", intEng);
		scStr += String.format("%5d\t", intMath);
		scStr += String.format("%5d\t", getIntSum());
		scStr += String.format("%5.2f\n", getfAvg());
		return scStr;
	}

}
