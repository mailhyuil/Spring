<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nice to Meet You!</title>
</head>
<body>
	<h1>반갑습니다!</h1>
	<form method="post">
		<div>
			<input name="num1" placeholder="숫자1 입력">
		</div>
		<div>
			<input name="num2" placeholder="숫자1 입력">
		</div>
		<div>
			<button>서버로 보내기</button>
		</div>
	</form>
	<div>결과 : ${result}</div>
</body>
</html>