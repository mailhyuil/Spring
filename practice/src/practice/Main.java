package practice;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {4,1,2,3,5,6,2,46,4,567};
		sort(arr, 0, arr.length-1);

	}

	public static void sort(int[] arr, int left, int right) {
		int mid;
		
		if(left < right) {
			int[] a = Arrays.copyOfRange(arr, left, right);
			System.out.println(Arrays.toString(a));
			mid = (left+right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
		}
	}
}
