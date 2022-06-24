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
div.detail, div.btn-box {
	width: 80%;
	margin: 10px auto;
}
div.btn-box{
	text-align: right;
}

div.btn-box a {
	text-decoration: none;
	color: white;
	display: inline-block;
	padding: 12px 16px;
	border-radius: 5px;
}

div.btn-box a:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.7);
}

a.list {
	background-color: green;
}

a.update {
	background-color: blue;
}

a.delete {
	background-color: red;
}
</style>
</head>
<body>
	<div class="detail">
		<p>ISBN : ${BOOK.isbn}</p>
		<p>도서명 : ${BOOK.title}</p>
		<p>저자 : ${BOOK.author}</p>
		<p>출판사 : ${BOOK.publisher}</p>
		<p>가격 : ${BOOK.price}</p>
		<p>출판일자 : ${BOOK.pubdate}</p>
	</div>
	<div class="btn-box">
		<a class="list" href="${rootPath}/books">리스트로 가기</a> <a
			class="update" href="${rootPath}/books/${BOOK.isbn}/update"
		>수정</a> <a class="delete" href="javascript:void(0)">삭제</a>
	</div>
</body>
<script>
	document.querySelector("a.delete")?.addEventListener("click", ()=>{
		if(confirm("정말 삭제할까요?")){
			document.location.replace("${rootPath}/books/${BOOK.isbn}/delete");
		}
	})
</script>
</html>