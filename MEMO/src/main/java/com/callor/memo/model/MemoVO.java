package com.callor.memo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD
@ToString
@Setter
@Getter
=======
@Getter
@Setter
@ToString
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemoVO {
	private long m_seq;
	private String m_author;
	private String m_date;
	private String m_time;
	private String m_memo;
	private String m_image;
<<<<<<< HEAD
	
	
=======
>>>>>>> 6af348449b33d62cc2a7a1dd7d9e505246078509
}
