package com.sb.web.score.exec;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.sb.web.domain.StudentVO;

public class ArrayEx2 {
	public static void main(String[] args) {
		int length = 10;
		String[] stNums = new String[length];
		String[] stNames = new String[length];
		int[] intGrade = new int[length];
		
		StudentVO[] stList = new StudentVO[length];
		for (int i = 0; i < stList.length; i++) {
			stList[i] = new StudentVO();
		}		
		
		stList = new StudentVO[20];
		
	}
}
