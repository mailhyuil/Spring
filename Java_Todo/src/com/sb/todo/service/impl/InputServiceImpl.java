package com.sb.todo.service.impl;

import java.util.Scanner;

import com.sb.todo.service.InputService;

public class InputServiceImpl implements InputService {

	protected final Scanner scan;
	
	public InputServiceImpl() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer menu() {
		
		System.out.println("=".repeat(50));
		System.out.println("업무를 선택하세요");
		System.out.println("=".repeat(50));
		System.out.println("1. TODO 추가하기");
		System.out.println("2. TODO LIST 보기");
		System.out.println("3. KEY로 검색하기");
		System.out.println("4. 완료처리하기");
		System.out.println("5. 종료하기");
		System.out.println("=".repeat(50));
		System.out.print("선택 >> ");
		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.print("할일 >> ");
		String content = scan.nextLine();
		return content;
	}

	@Override
	public Integer selectTodo() {
		return null;
	}

}
