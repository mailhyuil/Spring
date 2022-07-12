package com.sb.toby;

import java.util.Iterator;

public class Something implements Iterator<Integer>{
	private int[] arr;
	private int SIZE = 12;
	private int position = 0;
	
	public Something() {
		arr = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			arr[i] = i;
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		if(position < arr.length) {
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		int a = arr[position];
		position = position + 1;
		return a;
	}



	
	
}
