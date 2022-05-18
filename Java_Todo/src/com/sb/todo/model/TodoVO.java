package com.sb.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoVO {
	private String tContent;
	private String tKey;
	private String sdate;
	private String stime;

	private String edate;
	private String etime;

	private boolean bComp;

	@Override
	public String toString() {
		String result = String.format("%s", tKey);
		result += String.format("%s\t", sdate);
		result += String.format("%s\t", stime);
		result += String.format("%s\t", tContent);
		
		String compStr = edate == null || edate.isEmpty() ? "진행중" : "완료됨";
		
		result += String.format("%s\n", compStr);
		return result;
	}
}
