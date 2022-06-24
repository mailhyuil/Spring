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
=======

<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
		margin:10px auto;
		width: 80%;
	}
	
	div.btn_box {
		width:80%;
		margin:10px auto;
		text-align: right;
	}
	
	div.btn_box a {
		text-decoration: none;
		display: inline-block;
		padding:12px 16px;
		background-color: blue;
		color:white;
		border-radius: 6px;
	}
	
	div.btn_box a:hover {
		box-shadow: 2px 2px 2px rgba(0,0,0,0.7);
	}
</style>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/books.js?ver=2022-06-07-002"></script>

</head>
<body>
	<table class="books">
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
		<colgroup>
			<col width="100px">
			<col width="100px">
			<col width="300px">
			<col width="100px">
			<col width="100px">
			<col width="100px">
<<<<<<< HEAD
			<col width="100px">
		</colgroup>
		<thead>
			<tr>
				<th>No.</th>
				<th>ISBN</th>
				<th>도서명</th>
				<th>저자</th>
				<th>출판사</th>
=======
		</colgroup>
		<thead>
			<tr>
				<th>NO</th>
				<th>ISBN</th>
				<th>도서명</th>
				<th>출판사</th>
				<th>저자</th>
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
				<th>출판일</th>
			</tr>
		</thead>
		<tbody>
<<<<<<< HEAD
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
=======
		<%/* 
		서버로 부터 받은 데이터(도서리스트)를 보여주기 위한 부분
		BOOKS : 서버로 부터 받을 데이터
		BOOK : forEach 를 사용하여 한개의 요소를 추출하여 저장할 변수
		*/%>
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
		</tbody>
	</table>
	<div class="btn_box">
		<a href="${rootPath}/books/insert">도서정보추가</a>
	</div>
	
	
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
</body>
</html>