<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/views/include/nav.jsp" %>

<h1>${my_name}님 반갑습니다</h1>
<h3>30 * 40 = ${30*40}</h3>
<h3>1 &lt; 9 : ${1<9}</h3>
<h3>1 &gt; 9 : ${1>9}</h3>

<ul>
	<li>${ST[0]}</li>
	<li>${ST[1]}</li>
	<li>${ST[2]}</li>
</ul>
<div></div>
</body>
</html>