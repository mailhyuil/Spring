<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<div>
			<input name="name" placeholder="이름">
		</div>
		<div>
			<input name="kor" placeholder="국어">
		</div>
		<div>
			<input name="eng" placeholder="영어">
		</div>
		<div>
			<input name="math" placeholder="수학">
		</div>
		<div>
			<button>서버로 보내기</button>
		</div>
	</form>
	<div>이름 : ${SCORE.name} 국어 : ${SCORE.kor} 영어 : ${SCORE.eng} 수학 : ${SCORE.math}</div>
</body>
</html>