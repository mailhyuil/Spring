<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form.join{
	width:60%;
	margin:20px auto;
}
form.join fieldset{
	border:1px solid green;
}
form div{
	display:flex;
	margin:5px auto;	
}
form input{
	flex:1;
	padding:8px;
}
.warn{
color:red;
font-weight:900;
text-decoration:underline;
}
.ok{
color:blue;
}
</style>
<script>
	const rootPath = "${rootPath}";
</script>
<script src="${rootPath}/static/js/join.js?ver=2022-05-26-016"></script>
</head>
<body>
	<form class="join" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<div>
				<input name="username" placeholder="USERNAME" autocomplete="off" />
				<button class="id-check" type="button">중복검사</button>
			</div>
			<div class="username ok"></div>
			<div>
				<input type="password" name="password" placeholder="PASSWORD"
					autocomplete="off"
				/>
			</div>
			<div>
				<input type="password" name="re_password" placeholder="PASSWORD"
					autocomplete="off"
				/>
			</div>
			<div>
				<input name="name" placeholder="NAME" />
			</div>
			<div>
				<input name="email" placeholder="E-MAIL" />
			</div>
			<div>
				<button class="join" type="button">회원가입</button>
				<button class="join" type="reset">새로작성</button>
			</div>
		</fieldset>
	</form>
</body>
</html>