package com.sb.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.sb.todo.model.TodoVO;
import com.sb.todo.service.TodoService;

public class TodoServiceImpl implements TodoService {

	List<TodoVO> todoList;

	public TodoServiceImpl() {
		todoList = new ArrayList();
	}

	@Override
	public void todoInsert(String content) {
		Date curDate = new Date(System.currentTimeMillis());

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh-mm-ss");

		// 현재 날짜, 시간에 해당하는 문자열 생성
		// simpledateformat에 의해서 패턴대로 날짜 시각 문자열을 만든다.
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		/*
		 * Data 관련하여 사용되는 KEY, ID 값 Data의 무결성을 보장하기 위하여 모든 데이터(레토드단위, 로우단위)
		 * 
		 * Java에서는 java.util.UUID 클래스를 사용하여 범 우주적으로 유일한 ID값을 생성하는 도구를 제공한다.
		 */
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();

		TodoVO tVO = TodoVO.builder().sdate(today).stime(time).tContent(content).tKey(idStr).build();

		todoList.add(tVO);
	}

	@Override
	public List<TodoVO> todoSelectAll() {
		return todoList;
	}

	@Override
	public void findByKey(String key) {
	}

	@Override
	public void update(TodoVO tVO) {
	}

	/*
	 * 매개변수로 전달받은 num 값을 List요소의 실제값보다 1만큼 크다 num 값이 4라면 실제로 3번 요소를 선택한 것이다.
	 * 
	 * 선택한 요소의 edate,etime 부분을 현재 시스템의 날짜와 시간을 사용하여 문자열로 바꾼다음 setting
	 */
	@Override
	public void compTodo(Integer num) {
		
		Integer compNum = num -1;
		
		Date curDate = new Date(System.currentTimeMillis());

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh-mm-ss");
		
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		
		todoList.get(compNum).setEdate(today);
		todoList.get(compNum).setEtime(time);
		
	}

	@Override
	public void saveTodo(String fileName) {
	}

}
