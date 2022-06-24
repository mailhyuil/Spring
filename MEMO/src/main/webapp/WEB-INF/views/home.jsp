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

<title>Insert title here</title>
</head>
<body>
	<h1>홈</h1>

	<div class="memo">
		<c:forEach items="${memoVO}" var="VO">
		<div>
			<h3>${VO.m_author}</h3>
			<h4>${VO.m_date}</h4>
			<h4>${VO.m_time}</h4>
			<h1>${VO.m_memo}</h1>
			<img src="${rootPath}/upload/${VO.m_image}" width="100px" alt="${VO.m_image}">
			<hr>
		</div>
		</c:forEach>
	</div>
	<a href="${rootPath}/input">추가</a>
</body>
</html>



