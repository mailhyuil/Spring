package com.schoolverse.app.model;

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

@Setter
@Getter
@ToString
<<<<<<< HEAD
=======
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
@Builder
public class AcademyVO {
	private long aca_code;
	private String aca_name;
	private String aca_subject;
	private String aca_addr;
	private String aca_info;
<<<<<<< HEAD
	private long aca_img;
	private long aca_teacher;
=======
	private String aca_img;
	private long aca_teacher;
	private String aca_region;
	private String aca_age;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
