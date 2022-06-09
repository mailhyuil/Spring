package com.sb.todo.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.sb.todo.model.TodoVO;

public class TodoServiceImpl2 extends TodoServiceImpl {
	
	public TodoServiceImpl2() throws IOException {
		super();
		loadTodoList();
	}

	private void loadTodoList() throws IOException {
		FileInputStream is = null;
		
		Scanner scan = null;
		
		try {
			is = new FileInputStream(saveFileName);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(saveFileName + "파일이 없습니다.");
			return;
		}
		
		scan = new Scanner(is);
		
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME = 4;
		int T_CONTENT = 5;
		
		while(scan.hasNext()) {
			
			String line = scan.nextLine();
			String[] todo = line.split(",");
			if(todo.length < T_CONTENT + 1) continue;
			
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			
			TodoVO tVO = TodoVO.builder()
					.tKey(todo[T_KEY])
					.sdate(todo[T_SDATE])
					.stime(todo[T_STIME])
					.edate(todo[T_EDATE])
					.etime(todo[T_ETIME])
					.tContent(todo[T_CONTENT])
					.build();
			
			todoList.add(tVO);
		}
		try {
			is.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void update(Integer num, String content) {
		int index = num -1;
		
		TodoVO tVO;
		try {
			tVO=todoList.get(index);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("선택한 항목이 리스트에 없습니다.");
			return;
		}
		tVO.setTContent(content);
		
		try {
			this.saveTodo(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
