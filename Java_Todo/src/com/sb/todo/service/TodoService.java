package com.sb.todo.service;

import java.io.IOException;
import java.util.List;

import com.sb.todo.model.TodoVO;

public interface TodoService {
	public void todoInsert(String content);
	
	public List<TodoVO> todoSelectAll();
	
	public void findByKey(String key);
	// todo 내용 변경하기
	//public void update(TodoVO tVO);
	// 할일이 완료했을때 사용할 메소드
	
	/**
	 * 2022-05-13 설계변경
	 * update method를 변경하기
	 * TodoList의 item index와 content를 매개변수로 받아
	 * TodoList의 항목중 index번째의 content를 변경할 수 있도록
	 * method를 변경함
	 */
	public void update(Integer num, String content);
	
	public void compTodo(Integer num);
	// TodoList 내용을 파일에 저장하기
	public void saveTodo(String fileName) throws IOException;
}
