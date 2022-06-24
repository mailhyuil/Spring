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
	href="${rootPath}/static/css/input.css?ver=2022-05-31-008"
/>
<script>
	const rootPath = "${rootPath}";
</script>

<script src="${rootPath}/static/js/input.js?ver=2022-05-31-004"></script>
</head>
<body>
<%@include file="/WEB-INF/views/include/nav.jsp"%>
	<section class="main">
		<form method="post">
			<div>
				<input id="isbn" name="isbn" placeholder="ISBN" value="${BOOK.isbn}"
				<c:if test="${not empty BOOK.isbn }">
					readonly="readonly"
				</c:if>
				>
				<input
					id="title" name="title" placeholder="도서명 입력 후 ENTER"
				value="${BOOK.title}"/>
			</div>
			<div>
				<input name="author" placeholder="저자" value="${BOOK.author}"/>
				<input name="publisher"
					placeholder="출판사" value="${BOOK.publisher}"
				/>
				<input name="pubdate" placeholder="출판일" value="${BOOK.pubdate}"/>
				<input type="number"
					name="price" placeholder="가격" value="${BOOK.price}"
				/>
			</div>
			<div>
				<input name="link" placeholder="자세히 보기" value="${BOOK.link}"/>
				<input type="number" name="discount" placeholder="discount" value="${BOOK.discount}"/>
				<input name="image"
					placeholder="이미지" value="${BOOK.image}"
				/>
			</div>
			<div>
			<textarea name="description" placeholder="description" value="${BOOK.description}"></textarea>
			</div>
			<button type="submit">저장</button>
			<button type="reset" >새로작성</button>
			<button type="button">리스트보기</button>
		</form>
	</section>
	<footer>
		<address>
			CopyRight &copy; <a href="mailto:mailhyuil@gmail.com">mailhyuil@gmail.com</a>
		</address>
	</footer>
</body>
</html>