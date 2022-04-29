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
	<h1>대한민국 만세!!</h1>
	<form>
		<div>
			<input name="name" placeholder="이름을 입력하세요">
		</div>
		<div>
			<button>서버로 보내기</button>
		</div>
	</form>
	<div>${result}님 반갑습니다.</div>
	<div>
		<a href="?name=이몽룡">이몽룡</a>
	</div>
	<div>
		<a href="?name=홍길동">홍길동</a>
	</div>
	<div>
		<a href="?name=장보고">장보고</a>
	</div>
</body>
</html>