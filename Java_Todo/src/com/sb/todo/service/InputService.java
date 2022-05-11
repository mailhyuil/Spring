package com.sb.todo.service;

/*
 * Scanner를 사용하여 키보드에서 입력받은 일을 대신 수행할 클래스 정의
 */
public interface InputService {
	public Integer menu();
	public String inputContent();
	
	public Integer selectTodo();
	
}
