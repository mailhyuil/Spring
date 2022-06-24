<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
=======
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<<<<<<< HEAD
<title>hello!</title>
<style>
form {
	display: flex;
	justify-content:space-around;
	width: 60%;
	margin:10px auto;
	
}

select, input {
	padding: 8px;
	margin: 5px;
}
input{
flex:1;
=======

<title>Insert title here</title>
<style>
form {
	display: flex;
	justify-content: space-around;
	width: 60%;
	margin:10px auto;
}
select, input {
	padding:8px;
	margin:5px;
}

input {
	flex:1;
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
</style>
</head>
<body>
<<<<<<< HEAD
	<form method=post>
=======
	<form method=POST>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		<select name="cat">
			<option value="BOOK">도서검색</option>
			<option value="NEWS">뉴스검색</option>
			<option value="MOVIE">영화검색</option>
		</select> <input name="search" placeholder="검색어 입력하세요">
		<button>검색</button>
	</form>
</body>
<<<<<<< HEAD
</html>
=======
</html>



>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
