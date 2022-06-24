package com.callor.images.model;

<<<<<<< HEAD
import lombok.Builder;
import lombok.Getter;
=======
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
<<<<<<< HEAD
=======
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
@Builder
public class ImagesVO {
	
	private long i_seq;
	private long i_bseq;
<<<<<<< HEAD
	private String i_originalName; // 원래 파일 이름
	private String i_imageName; // 변경된 파일 이름
	
=======
	private String i_originalName;
	private String i_imageName;

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
