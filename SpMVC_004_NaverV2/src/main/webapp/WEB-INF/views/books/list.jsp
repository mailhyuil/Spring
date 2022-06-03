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
</head>
<body>
	<h1>도서 정보 리스트 보여주기</h1>
	<table>
		<tr>
			<td>No.</td>
			<td>ISBN</td>
			<td>도서명</td>
			<td>출판사</td>
			<td>저자</td>
			<td>출판일자</td>
		</tr>
		<c:forEach items="${BOOKS}" var="BOOK">
			<tr>
				<td>1</td>
				<td>${BOOK.ISBN}</td>
				<td>${BOOK.TITLE}</td>
				<td>${BOOK.PUBLISHER}</td>
				<td>${BOOK.AUTHOR}</td>
				<td>${BOOK.PUBDATE}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${rootPath}/books/insert">도서 정보 추가</a>
</body>
</html>