<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="memoVO" enctype="multipart/form-data">
	<form:input path="m_author" placeholder="m_author"/>
	<form:textarea path="m_memo" placeholder="m_memo"/>
	<input type="file" name="up_file"/>
	<button>추가</button>
</form:form>
</body>
</html>