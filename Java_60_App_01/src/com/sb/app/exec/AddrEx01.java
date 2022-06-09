package com.sb.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.sb.app.model.AddressVO;

public class AddrEx01 {
	public static void main(String[] args) {
		List<AddressVO> list = new ArrayList<>();
				
		AddressVO adVO = AddressVO.builder()
				.name("hong")
				.addr("hong주소")
				.tel("010-0000-0001")
				.age(10)
				.hobby("축구")
				.build();
		list.add(adVO);
		
		adVO = AddressVO.builder()
				.name("lee")
				.addr("lee주소")
				.tel("010-0000-0001")
				.age(10)
				.hobby("축구")
				.build();
		list.add(adVO);
		
		adVO = AddressVO.builder()
				.name("sung")
				.addr("sung주소")
				.tel("010-0000-0001")
				.age(10)
				.hobby("축구")
				.build();
		list.add(adVO);
		
		AddrServiceV1 service = new AddrServiceV1();
		
		service.printAddrList(list);

	}
}
