<%@page import="com.sb.web.domain.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>

<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>

<style>
section {
	display: flex;
	flex-direction: column;
}

article {
	width: 80%;
	margin: 0 auto;
}

table {
	width: 80%;
	width: 80%;
	margin: 0 auto;
	border-top: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
	border-collapse: collapse;
}

tr {
	border-top: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
}

tr:nth-of-type(even) {
	background-color: #eee;
}

tr:nth-of-type(odd) {
	background-color: #fff;
}
/* tr:nth-of-type(n+2):hover {
	background-color: #ddd;
} */
tr:not(:first-of-type):hover {
	background-color: #ddd;
}

th, td {
	text-align: left;
	padding: 5px;
	cursor: pointer;
}

div.button-box {
	width: 80%;
	margin: 5px auto;
	text-align: right;
	padding: 5px 0;
}

div.button-box a {
	display: inline-block;
	padding: 12px 16px;
	text-decoration: none;
	color: white;
	background-color: maroon;
	border-radius: 4px;
}

div.button-box a:hover {
	color: maroon;
	background-color: orange;
}
</style>
<script>
//JSP에서 사용하는 rootPath 변수 값을
//JS에서 사용할 수 있도록 var 변수 선언
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/student.js?version=2022-04-26-002"></script>

<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<%@ include file="/WEB-INF/views/include/include_nav.jsp"%>
	<section>
		<article>학생정보</article>
		<table>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>학과</th>
				<th>학년</th>
			</tr>
			<c:forEach var="stVO" items="${ST_LIST}">
			<tr>
				<td>${stVO.stNum}</td>
				<td class="name" data-num="${stVO.stNum}">${stVO.stName}</td>
				<td>${stVO.stDept}</td>
				<td>${stVO.intGrade}</td>
			</tr>
			</c:forEach>
		</table>
		<div class="button-box">
			<a href="${pageContext.request.contextPath}/student/input">학생정보
				등록</a>
		</div>
	</section>

	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>