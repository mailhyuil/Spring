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
	<h1>자세히보기</h1>
	<h3>${memoVO.m_author}</h3>
	<h4>${memoVO.m_date}</h4>
	<h4>${memoVO.m_time}</h4>
	<h1>${memoVO.m_memo}</h1>
	<img src="${rootPath}/upload/${memoVO.m_image}" width="100px"
		alt="${memoVO.m_image}">
	<button onclick="location.href='${rootPath}/update?id=${memoVO.m_seq}';">수정하기</button>
	<button onclick="location.href='${rootPath}/delete?id=${memoVO.m_seq}';">삭제하기</button>
	
</html>



