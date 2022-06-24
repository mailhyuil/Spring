<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
=======
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
form.login {
	width: 70%;
	margin: 20px auto;
	padding: 20px;
}

form.login input, form.login button {
	margin: 5px;
}
</style>
<script src="${rootPath }/static/js/login.js?20106091233231"></script>
</head>
<body>
	<form class="w3-container login w3-card-4" method="post">
		<h2>로그인</h2>
		<c:if test="${error == 'LOGIN_NEEDED'}">
		<div class="w3-red w3-padding-16">로그인이 필요한 서비스입니다</div>		
		</c:if>
		<c:if test="${error == 'USERNAME_FAILED'}">
		<div class="w3-red w3-padding-16">아이디가 없습니다, 회원가입을 해주세요</div>		
		</c:if>
		<c:if test="${error == 'PASSWORD_FAILED'}">
		<div class="w3-red w3-padding-16">비밀번호가 틀렸습니다</div>		
		</c:if>
		<label class="w3-text-blue" for="username"><strong>아이디</strong></label> 
		<input
			class="w3-input w3-border" id="username" name="username"
			placeholder="USERNAME"
		/> <label class="w3-text-blue" for="password"><strong>비밀번호</strong></label>
		 <input
			class="w3-input w3-border" id="password" name="password"
			placeholder="PASSWORD"
		/>
		<button class="w3-button w3-blue btn-login" type="button">로그인</button>
	</form>
</body>
</html>
=======

<title>Insert title here</title>
<style>
	form.login {
		width: 60%;
		margin:10px auto;
		padding:10px;
	}
	
	form.login input, form.login button {
		margin:10px;
	}
</style>
<script src="${rootPath}/static/js/login.js?20220609001"></script>
</head>
<body>
	<form method=POST class="w3-container w3-card-4 login">
		<h2 class="w3-text-blue">로그인</h2>
		
		<c:if test="${error == 'LOGIN_NEED'}">
			<div class="w3-red w3-padding-16"> * 로그인이 필요한 서비스 입니다</div>
		</c:if>
		<c:if test="${error == 'USERNAME_FAIL'}">
			<div class="w3-red w3-padding-16"> * ID 가 없음. 회원가입을 먼저 하세요</div>
		</c:if>
		<c:if test="${error == 'PASSWORD_FAIL'}">
			<div class="w3-red w3-padding-16"> * 비밀번호가 틀렸습니다</div>
		</c:if>

		<label class="w3-text-blue"><strong>USER NAME(ID)</strong></label>
		<input name="username" placeholder="USERNAME" class="w3-input w3-border">
		
		<label class="w3-text-blue"><strong>비밀번호</strong></label>
		<input name="password" placeholder="PASSWORD" class="w3-input w3-border">
		<button type="button" class="w3-button w3-green btn-login">로그인</button>
	</form>	
</body>
</html>




>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
