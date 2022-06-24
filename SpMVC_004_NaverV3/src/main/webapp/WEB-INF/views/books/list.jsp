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
<style>
table {
	border-collapse: collapse;
	margin: 10px auto;
	width: 80%;
}

</style>
</head>
<body>
	<h1>도서 정보 리스트 보여주기</h1>
	<table>
		<colgroup>
			<col width="100px">
			<col width="100px">
			<col width="300px">
			<col width="100px">
			<col width="100px">
			<col width="100px">
			<col width="100px">
		</colgroup>
		<thead>
			<tr>
				<th>No.</th>
				<th>ISBN</th>
				<th>도서명</th>
				<th>저자</th>
				<th>출판사</th>
				<th>출판일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${BOOKS}" var="BOOK">
				<c:set var="INDEX" value="${INDEX+1 }"></c:set>
				<tr>
					<th>${INDEX}</th>
					<th>${BOOK.isbn }</th>
					<th>${BOOK.title }</th>
					<th>${BOOK.publisher }</th>
					<th>${BOOK.author }</th>
					<th>${BOOK.pubdate }</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="${rootPath}/books/insert">도서 정보 추가</a>
</body>
</html>