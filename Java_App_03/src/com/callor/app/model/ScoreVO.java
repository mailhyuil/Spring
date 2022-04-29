package com.callor.app.model;

public class ScoreVO {
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = kor + eng + math;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = sum/3;
	}

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	
	public ScoreVO(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "ScoreVO [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
}
