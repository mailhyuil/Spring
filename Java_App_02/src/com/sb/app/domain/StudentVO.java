package com.sb.app.domain;

public class StudentVO {
	private String stNum;
	private String stName;
	private int intGrade;
	private String stDept;
	private String stAddr;
	private String stTel;
	
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param intGrade
	 * @param stDept
	 * @param stAddr
	 * @param stTel
	 */
	public StudentVO(String stNum, String stName, int intGrade, String stDept, String stAddr, String stTel) {
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.stTel = stTel;
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
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	
	//VO객체에 데이터를 저장한 후
	//저장된 데이터가 잘 담겼는지 확인하는 용도
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", stTel=" + stTel + "]";
	}
	
	
}
