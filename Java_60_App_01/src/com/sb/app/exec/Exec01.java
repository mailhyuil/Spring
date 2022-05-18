package com.sb.app.exec;

import com.sb.app.model.AddressVO;

/*
 * 배열, 리스트에 담겨있는
 * 어떤 항목, 값을 기준으로 정렬을 할 필요가 많다
 * DBMS와 같은 데이터 관리 도구를 사용하는 경우는
 * SQL 명령으로 쉽게 정렬을 할 수 있다
 * 
 * 하지만, 배열 리스트에 담긴 데이터들을
 * 그 양이 별로 많지 않기 때문에 코딩으로 데이터를 정렬할 수 있다.
 */
public class Exec01 {
	public static void main(String[] args) {
		AddressVO[] addrs = new AddressVO[3];
		addrs[0] = new AddressVO();
		addrs[0].setName("홍길동");
	}
}
