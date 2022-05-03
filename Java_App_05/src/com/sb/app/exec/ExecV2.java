package com.sb.app.exec;

import com.sb.app.model.ServiceVO;

public class ExecV2 {
	public static void main(String[] args) {
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intSum = new int[5];
		
		for (int i = 0; i < intKor.length; i++) {
			int iKor = (int) (Math.random() * 100) + 1;
			int iEng = (int) (Math.random() * 100) + 1;
			int iMath = (int) (Math.random() * 100) + 1;

			int iSum = iKor + iEng + iMath;
			intKor[i] = iKor;
			intEng[i] = iEng;
			intMath[i] = iMath;

			intSum[i] = iSum;
			System.out.printf("%d	%d	%d	%d\n",intKor[i],intEng[i],intMath[i],intSum[i]);
		}
		
		ServiceVO service = new ServiceVO(intKor,intEng,intEng,intSum);
		
		for (int i = 0; i < intSum.length; i++) {
			for (int j = i + 1; j < intSum.length; j++) {
				if (intSum[i] > intSum[j]) {
					int _temp = intSum[i];
					intSum[i] = intSum[j];
					intSum[j] = _temp;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < intSum.length; i++) {
			System.out.printf("%d	%d	%d	%d\n",intKor[i],intEng[i],intMath[i],intSum[i]);
		}
		
	}

}
