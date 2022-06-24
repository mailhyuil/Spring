package com.schoolverse.app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class AcademyVO {
	private long aca_code;
	private String aca_name;
	private String aca_subject;
	private String aca_addr;
	private String aca_info;
	private long aca_img;
	private long aca_teacher;
}
