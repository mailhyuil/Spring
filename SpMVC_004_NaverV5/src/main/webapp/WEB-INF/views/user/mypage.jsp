<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>hello!</title>
</head>
<body>
<div class="w3-container w3-card-4">
<h1 >LOGIN USER</h1>
<h3 class="w3-text-blue">USERNAME : ${USER.username}</h3>
<h3 class="w3-text-blue">Email : ${USER.email}</h3>
<h3 class="w3-text-blue">NAME : ${USER.name}</h3>
<h3 class="w3-text-blue">NICKNAME :${USER.nickname}</h3>
<h3 class="w3-text-blue">ROLE : ${USER.role}</h3>
</div>
<ul>
	<c:forEach items="${BUY_BOOKS }" var="BOOK">
		<li>${BOOK.book.isbn}, ${BOOK.book.title}, ${BOOK.book.author}</li>
	</c:forEach>
</ul>
</body>
</html>