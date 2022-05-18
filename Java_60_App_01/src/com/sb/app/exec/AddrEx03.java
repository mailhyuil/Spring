package com.sb.app.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sb.app.model.AddressVO;

public class AddrEx03 {
	public static void main(String[] args) {
		List<AddressVO> list = new ArrayList<>();
				
		AddressVO adVO = AddressVO.builder()
				.name("김길동")
				.addr("hong주소")
				.tel("010-0000-0001")
				.age(20)
				.hobby("축구")
				.build();
		list.add(adVO);

		adVO = AddressVO.builder()
				.name("이춘향")
				.addr("lee주소")
				.tel("010-0000-0001")
				.age(10)
				.hobby("축구")
				.build();
		list.add(adVO);
	
		adVO = AddressVO.builder()
				.name("박몽룡")
				.addr("sung주소")
				.tel("010-0000-0001")
				.age(30)
				.hobby("축구")
				.build();
		list.add(adVO);
		int size = list.size();
		
		for (int i = 0; i < size-1; i++) {
			for (int j = 1; j < size; j++) {
				if(list.get(i).getName().compareTo(list.get(j).getName())>0) {
					AddressVO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		Collections.sort(null);
		AddrServiceV1 service = new AddrServiceV1();
		
		service.printAddrList(list);

	}
}
