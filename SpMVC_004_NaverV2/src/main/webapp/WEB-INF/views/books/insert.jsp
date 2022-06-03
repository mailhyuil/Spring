<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<form method="post">
	<div>
		<input id="isbn" name="isbn" placeholder="ISBN">
		<input id="title" name="title" placeholder="도서명 입력 후 ENTER"	/>
	</div>
	<div>
		<input name="author" placeholder="저자" />
		<input name="publisher"	placeholder="출판사"/>
		<input name="pubdate" placeholder="출판일" />
		<input type="number" name="price" placeholder="가격"	/>
	</div>
	<div>
		<input name="link" placeholder="자세히 보기" />
		<input name="image"	placeholder="이미지"	/>
	</div>
	<button type="submit">저장</button>
</form>