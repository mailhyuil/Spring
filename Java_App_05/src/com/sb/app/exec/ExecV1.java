package com.sb.app.exec;

public class ExecV1 {

	public static void sort(int[] kor, int[] eng, int[] math) {
		int[] aKor = kor;
		int[] aEng = eng;
		int[] aMath = math;

		for (int i = 0; i < aKor.length; i++) {
			for (int j = i + 1; j < aKor.length; j++) {
				if (aKor[i] > aKor[j]) {
					int _temp = aKor[i];
					aKor[i] = aKor[j];
					aKor[j] = _temp;
				}
			}
		}
		
		for (int i = 0; i < aEng.length; i++) {
			for (int j = i + 1; j < aEng.length; j++) {
				if (aEng[i] > aEng[j]) {
					int _temp = aEng[i];
					aEng[i] = aEng[j];
					aEng[j] = _temp;
				}
			}
		}
		
		for (int i = 0; i < aMath.length; i++) {
			for (int j = i + 1; j < aMath.length; j++) {
				if (aMath[i] > aMath[j]) {
					int _temp = aMath[i];
					aMath[i] = aMath[j];
					aMath[j] = _temp;
				}
			}
		}
	}
}
