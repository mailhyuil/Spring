package com.callor.school.dao;

public class SQL {
<<<<<<< HEAD
	public static class STUDENT {
		public static final String INSERT = "INSERT INTO tbl_student("
				+" st_num,"
				+" st_name,"
				+" st_dept,"
				+" st_grade,"
				+" st_tel,"
				+" st_addr)"
				+" VALUES("
				+" #{st_num},"
				+" #{st_name},"
				+" #{st_dept},"
				+" #{st_grade},"
				+" #{st_tel},"
				+" #{st_addr})";
		
		public static final String UPDATE = ""
				+" UPDATE SET tbl_student"
				+" st_name		= #{st_name},"
				+" st_dept		= #{st_dept},"
				+" st_grade		= #{st_grade},"
				+" st_tel		= #{st_tel},"
				+" st_addr		= #{st_addr}"
				+" WHERE st_num = #{st_num}";
	}
=======
	
	public static class STUDENT {
		public static final String INSERT 
			= " INSERT INTO tbl_student ( " 
							+" st_num,"
							+" st_name,"
							+" st_dept,"
							+" st_grade,"
							+" st_tel,"
							+" st_addr"
							+" ) VALUES ( "
							+" #{st_num},"
							+" #{st_name},"
							+" #{st_dept},"
							+" #{st_grade},"
							+" #{st_tel},"
							+" #{st_addr})";
		
		public static final String  UPDATE = ""
				+" UPDATE SET tbl_student "
				+" 		st_name = #{st_name},"
				+" 		st_dept = #{st_dept},"
				+" 		st_grade = #{st_grade},"
				+" 		st_tel = #{st_tel},"
				+" 		st_addr = #{st_addr}"
				+" WHERE st_num = #{st_num} ";
	}

>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
}
