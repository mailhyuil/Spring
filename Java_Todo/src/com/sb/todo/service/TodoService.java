package com.sb.todo.service;

import java.util.List;

import com.sb.todo.model.TodoVO;

public interface TodoService {
	public void todoInsert(String content);
	
	public List<TodoVO> todoSelectAll();
	
	public void findByKey(String key);
	// todo 내용 변경하기
	public void update(TodoVO tVO);
	// 할일이 완료했을때 사용할 메소드
	public void compTodo(Integer num);
	// TodoList 내용을 파일에 저장하기
	public void saveTodo(String fileName);
}
