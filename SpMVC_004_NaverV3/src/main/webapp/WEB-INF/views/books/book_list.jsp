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

<link rel="stylesheet"
	href="${rootPath}/static/css/home.css?ver=2022-06-02-001"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/main.css?ver=2022-06-02-001"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/table.css?ver=2022-06-02-001"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/modal.css?ver=2022-05-31-004"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/input.css?ver=2022-05-31-004"
/>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath }/static/js/books.js?ver11"></script>
</head>
<body>
<%@include file="/WEB-INF/views/include/nav.jsp"%>
<section class="main">
		<h1>도서 정보 리스트 보여주기</h1>
		<table class="books">
			<tr>
				<td>No.</td>
				<td>ISBN</td>
				<td>도서명</td>
				<td>출판사</td>
				<td>저자</td>
				<td>출판일자</td>
			</tr>
			<c:forEach items="${BOOKS}" var="BOOK" varStatus="INDEX">
				<tr data-isbn="${BOOK.isbn}">
					<td>${INDEX.count}</td>
					<td>${BOOK.isbn}</td>
					<td>${BOOK.title}</td>
					<td>${BOOK.publisher}</td>
					<td>${BOOK.author}</td>
					<td>${BOOK.pubdate}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="${rootPath}/books/insert">도서 정보 추가</a>
	</section>
	<footer>
		<address>
			CopyRight &copy; <a href="mailto:mailhyuil@gmail.com">mailhyuil@gmail.com</a>
		</address>
	</footer>
</body>
</html>