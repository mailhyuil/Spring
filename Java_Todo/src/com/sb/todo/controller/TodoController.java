package com.sb.todo.controller;

import java.util.List;

import com.sb.todo.model.TodoVO;
import com.sb.todo.service.TodoService;
import com.sb.todo.service.impl.TodoServiceImpl;

public class TodoController {
	public static void main(String[] args) {
		TodoService tService = new TodoServiceImpl();
		tService.todoInsert("오늘은 행복한 화요일");
		List<TodoVO> todoList = tService.todoSelectAll();
		
		for(TodoVO tVO : todoList) {
			System.out.println(tVO.toString());
		}
	}
}
