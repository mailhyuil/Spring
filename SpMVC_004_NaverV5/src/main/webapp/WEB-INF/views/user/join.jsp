<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>hello!</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
form.join {
	width: 70%;
	margin: 20px auto;
	padding: 20px;
}

form.join input, form.join button {
	margin: 5px;
}
form.join label {
font-weight:bold;}
</style>
<script>
	const rootPath = "${rootPath}";
</script>
<script src="${rootPath}/static/js/join.js?202206332112312332"></script>
</head>
<body>
	<form class="w3-container join w3-card-4" method="post">
		<h2>회원가입</h2>
		<label class="w3-text-blue" for="username">아이디</label>
		 <input
			class="w3-input w3-border" id="username" name="username"
			placeholder="USERNAME"
		/> 
		<div class="w3-padding-16 error"></div>
		<label class="w3-text-blue" for="password">비밀번호</label>
		 <input
			class="w3-input w3-border" id="password" name="password"
			placeholder="PASSWORD"
		/> 
		<div class="w3-padding-16 error"></div>
		<label class="w3-text-blue" for="re_password">비밀번호 확인</label>
		 <input
			class="w3-input w3-border" id="re_password" name="re_password"
			placeholder="RE_PASSWORD"
		/> 
		<div class="w3-padding-16 error"></div>
		<label class="w3-text-blue" for="email">이메일</label>
		 <input
			class="w3-input w3-border" id="email" name="email"
			placeholder="EMAIL"
		/>
		<div class="w3-padding-16 error"></div>
		<label class="w3-text-blue" for="name">이름</label>
		 <input
			class="w3-input w3-border" id="name" name="name" placeholder="NAME"
		/> 
		<div class="w3-padding-16 error"></div>
		<label class="w3-text-blue" for="nickname">별명</label>
		 <input
			class="w3-input w3-border" id="nickname" name="nickname"
			placeholder="NICKNAME"
		/>
		<div class="w3-padding-16 error"></div>
		<button class="w3-button w3-blue" id="btn-join" type="button">회원가입</button>
	</form>
</body>
</html>