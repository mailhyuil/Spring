package com.sb.web.score.exec;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] intNums = new int[10];

		/*
		 * for (int i = 0; i < intNums.length; i++) { intNums[i] = (int) (Math.random()
		 * * 100) + 1; System.out.printf("%d\t", intNums[i]); }
		 */
		

  for(int num : intNums) { num = (int) (Math.random() * 100) + 1;
  System.out.printf("%d\t", num); }

		
		System.out.println();
		System.out.println();
		
		for (int num : intNums) {
			System.out.printf("%d\t", num);
		}
	}
}
