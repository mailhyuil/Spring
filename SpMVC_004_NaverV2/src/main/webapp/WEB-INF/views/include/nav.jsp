<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<header>
	<h1>My API</h1>
	<p>Naver API를 활용한 도서, 뉴스, 영화 정보 서비스</p>
</header>
<nav>
	<ul>
		<li><a href="${rootPath}/">Home</a></li>
		<li><a href="${rootPath}/books">도서정보</a></li>
		<li><a href="${rootPath}/news">오늘의 뉴스</a></li>
		<li><a href="${rootPath}/movies">영화정보</a></li>
		<li><a href="${rootPath}/naver">네이버 체험</a></li>

		<%
		// 로그인을 하지 않았을 때
		%>
		<c:if test="${empty MEMBER }">
			<li><a href="${rootPath}/member/login">로그인</a></li>
			<li><a href="${rootPath}/member/join">회원가입</a></li>
		</c:if>
		<%
		// 로그인을 했을 때
		%>
		<c:if test="${not empty MEMBER }">
			<li><a href="${rootPath}/member/mypage">My Page</a></li>
			<li><a href="${rootPath}/member/logout">로그아웃</a></li>
		</c:if>
	</ul>
</nav>