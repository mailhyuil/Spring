package com.sb.app.exec;

import java.util.List;

import com.sb.app.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO addr) {
		System.out.println(addr.toString());
	}

	public void printAddrList(List<AddressVO> list) {
		for(AddressVO vo : list) {
			System.out.println(vo.toString());			
		}
	}
}
