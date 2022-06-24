package com.schoolverse.app.model;

<<<<<<< HEAD
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
public class ClassVO {
	private String class_code;
	private String aca_code;
	private String class_name;
	private String class_subject;
	private String class_fee;
	private String sche_code;
=======
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassVO {
	private long class_code;
	private long aca_code;
	private String class_name;
	private String class_subject;
	private String class_fee;
	private long sche_code;
	private long class_teacher;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
