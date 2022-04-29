package com.sb.web.domain;

public class StudentVO {
	private String stNum; // 학번
	private String stName; // 이름
	private int intGrade; // 학년
	private String stTel; // 전화번호
	private String strAddr; // 주소
	private String stDept; // 학과

	public StudentVO() {
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String stNum, String stName, int intGrade, String stTel, String strAddr, String stDept) {
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stTel = stTel;
		this.strAddr = strAddr;
		this.stDept = stDept;
	}

	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stTel=" + stTel
				+ ", strAddr=" + strAddr + ", stDept=" + stDept + "]";
	}

}
