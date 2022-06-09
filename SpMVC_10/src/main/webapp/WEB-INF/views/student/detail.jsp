<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/student.js?ver=2022-05-27-013"></script>
</head>
<body>

	<table class="st-list" border="1">
		<tr>
			<th>학번</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${STLIST }" var="VO">
			<tr data-stnum = "${VO.st_num}">
				<td>${VO.st_num }</td>
				<td>${VO.st_name }</td>
			</tr>
		</c:forEach>
	</table>

	<div class="std num">
		<strong>학번 : </strong><input name="st_num" />
	</div>
	<div class="std name">
		<strong>이름 : </strong><span></span>
	</div>
	<div class="std grade">
		<strong>학년 : </strong><span></span>
	</div>
	<div class="std tel">
		<strong>전화번호 : </strong><span></span>
	</div>
	<div class="std addr">
		<strong>주소 : </strong><span></span>
	</div>
</body>
</html>