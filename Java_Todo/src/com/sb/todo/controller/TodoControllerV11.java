package com.sb.todo.controller;

import java.util.List;

import com.sb.todo.model.TodoVO;
import com.sb.todo.service.InputService;
import com.sb.todo.service.TodoService;
import com.sb.todo.service.impl.InputServiceImpl;
import com.sb.todo.service.impl.TodoServiceImpl;

public class TodoControllerV11 {
	public static void main(String[] args) {
		TodoService toService = new TodoServiceImpl();
		InputService inService = new InputServiceImpl();

		while (true) {
			Integer menu = inService.menu();
			if (menu == null) {
				System.out.println("업무번호를 잘 선택하세요.");
				continue;
			} else if (menu == 5) {
				break;
			} else if (menu == 1) {
				String content = inService.inputContent();
				toService.todoInsert(content);

			} else if (menu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				for (TodoVO vo : todoList) {
					System.out.println(vo.toString());
				}
			}
		}
		System.out.println("업무종료!");
	}
}
