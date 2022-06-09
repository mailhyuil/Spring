<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학사관리</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	width: 100vw;
	height: 100vh;
	display: flex;
	flex-direction: column;
}

header {
	background-color: rgb(200, 200, 100);
	padding: 2rem;
	font-weight: 900;
	/*
	header tag에 속성을 지정해서
	header가 감싸고 있는 tag들에게
	속성이 상속되어 공통으로 적용된다.
	*/
	text-align: center;
	text-shadow: 1px 1px 1px black;
	color: white;
}

nav {
	background-color: navy;
	color: white;
}

nav ul {
	display: flex;
	list-style: none;
}

nav li {
	padding: 12px 15px;
}

nav li:hover {
	color: yellow;
	font-weight: bold;
	cursor: pointer
}

nav li:nth-of-type(4) {
	margin-left: auto;
}

section.main {
	flex: 1;
	padding: 5px;
	display: flex;
}

section.main article {
	flex: 1;
	margin: 0 5px;
	border: 1px solid blue;
}

footer {
	background-color: orange;
	color: white;
	text-align: center;
	padding: 0.9rem;
}

button {
	border: none;
	outline: none;
	padding:12px 16px;
	border-radius: 5px;
}
button:hover{
	box-shadow:2px 2px 2px rgba(0,0,0,0.4);
	cursor:pointer;
}

button.btn-blue {
	background-color: blue;
	color: white;
}
button.btn-green {
	background-color: green;
	color: white;
}
button.btn-orange {
	background-color: orange;
	color: white;
}
button.btn-red {
	background-color: red;
	color: white;
}
</style>

<script>
const rootPath = "${rootPath}";
</script>
<script src="${rootPath}/static/nav.js?ver=2022-05-09-002"></script>
</head>
<body>
	<header>
		<h1>학사관리 시스템</h1>
		<p>대한고교 학사관리 시스템 2022</p>
	</header>

	<nav>
		<ul>
			<li>HOME</li>
			<li>학생정보</li>
			<li>성적정보</li>
			<li>로그인</li>
			<li>회원가입</li>
		</ul>
	</nav>
	<section class="main">
		<c:choose>
			<c:when test="${LAYOUT == 'ST_LIST'}">
				<article>
					<%@ include file="/WEB-INF/views/student/list.jsp"%>
				</article>
			</c:when>
			<c:when test="${LAYOUT eq 'ST_INPUT'}">
				<article>
					<%@ include file="/WEB-INF/views/student/input.jsp"%>
				</article>
			</c:when>
			<c:otherwise>
				<article></article>
				<article></article>
				<article></article>
			</c:otherwise>
		</c:choose>

	</section>
	<footer>
		<address>Copyright &copy; mailhyuil@gmail.com</address>
	</footer>



</body>

</html>