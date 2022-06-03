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
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

html {
	width: 100vw;
	height: 100vh;
}
body{
	width:100%;
	height:100%;
	display:flex;
	flex-direction:column;
}
section{
	flex:1;
}
header{
	font-size:30px;
	font-weight:bold;
}
</style>
<link rel="stylesheet"
	href="${rootPath}/static/css/table.css?ver=2022-05-31-006"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/modal.css?ver=2022-05-31-004"
/>
<link rel="stylesheet"
	href="${rootPath}/static/css/input.css?ver=2022-05-31-004"
/>
<script>
	const rootPath="${rootPath}";
</script>

<script src="${rootPath}/static/js/input.js?ver=2022-05-31-004"></script>
</head>
<body>
	<header>도서정보관리</header>
	<section>
		<form action="${rootPath }/naver/books" method="post">
			<div>
				<input id="isbn" name="isbn" placeholder="ISBN">
				<input id="title" name="title"
					placeholder="도서명 입력 후 ENTER"
				/>
			</div>
			<div>
				<input name="author" placeholder="저자" /> <input name="publisher"
					placeholder="출판사"
				/> <input name="pubdate" placeholder="출판일" /> <input type="number"
					name="price" placeholder="가격"
				/>
			</div>
			<div>
				<input name="link" placeholder="자세히 보기" /> <input name="image"
					placeholder="이미지"
				/>
			</div>

			<textarea rows="10"></textarea>
			<button type="button">저장</button>

		</form>
	</section>
	<footer>
		<address>
			CopyRight &copy; <a href="mailto:mailhyuil@gmail.com">mailhyuil@gmail.com</a>
		</address>
	</footer>
	<section id="modal_box" class="modal"></section>
</body>

</html>