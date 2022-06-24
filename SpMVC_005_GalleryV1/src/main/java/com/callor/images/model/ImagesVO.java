package com.callor.images.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ImagesVO {
	
	private long i_seq;
	private long i_bseq;
	private String i_originalName; // 원래 파일 이름
	private String i_imageName; // 변경된 파일 이름
	
}
