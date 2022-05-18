package com.sb.todo.controller;

import java.util.List;

import com.sb.todo.model.TodoVO;
import com.sb.todo.service.InputService;
import com.sb.todo.service.TodoService;
import com.sb.todo.service.impl.InputServiceImpl2;
import com.sb.todo.service.impl.TodoServiceImpl;

public class TodoControllerV12 {
	public static void main(String[] args) {
		TodoService toService = new TodoServiceImpl();
		InputService inService = new InputServiceImpl2();

		while (true) {
			Integer mainMenu = inService.menu();
			if (mainMenu == null) {
				System.out.println("업무선택을 다시 하세요");
				continue;
			}
			if (mainMenu == 1) {
				while (true) {
					String content = inService.inputContent();
					if (content.equals("QUIT")) {
						break;
					}
					toService.todoInsert(content);

				}
			} else if (mainMenu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				printTodo(todoList);
			} else if(mainMenu == 4) {
				List<TodoVO> todoList = toService.todoSelectAll();
				printTodo(todoList);
				System.out.println("-".repeat(50));
				while(true) {
					System.out.println("완료할 할일을 선택하세요");
					Integer num = inService.selectTodo();					
					if(num == null) {
						System.out.println("숫자로만 선택하세요");
						continue;
					}
					if(num == -1) return;
					toService.compTodo(num);
					break;
				}
				printTodo(todoList);
			}
		} // end while

	} //end main
	private static void printTodo(List<TodoVO> toVO) {
		System.out.println("-".repeat(50));
		System.out.print("No\t");
		System.out.print("시작일자\t");
		System.out.print("시작시간\t");
		System.out.print("할일\t");
		System.out.println("상태");
		System.out.println("-".repeat(50));
		int size = toVO.size();
		for(int i = 0; i < size; i++) {
			System.out.printf("%d\t", i+1);
			System.out.print(toVO.get(i).getSdate()+"\t");
			System.out.print(toVO.get(i).getStime()+"\t");
			System.out.print(toVO.get(i).getTContent()+"\t");
			
			String comp = toVO.get(i).getEdate() == null || toVO.get(i).getEdate().isEmpty() 
						? "진행중" 
						: "완료됨";
			System.out.println(comp);
		}
	}
}
