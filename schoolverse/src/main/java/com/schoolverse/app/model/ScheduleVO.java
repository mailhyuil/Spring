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
public class ScheduleVO {
	private String sche_code;
=======
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleVO {
	private long sche_code;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
	private String sche_day;
	private String sche_period;
}
