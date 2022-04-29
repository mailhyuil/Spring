package com.callor.app.exec;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 32, 543, 5, 3, 6, 5, 2, 534, 26, 1, 34, 23, 4, 56, 4, 743, 54 };
		selectionSort(arr);
	}

	public static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int min = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;	
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr) {
		
	}
}
