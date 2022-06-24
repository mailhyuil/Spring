<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
<h1>추가하기</h1>
<%-- <form method="post" enctype="multipart/form-data">
	<input placeholder="m_author" name="m_author"/>
	<textarea placeholder="m_memo" name="m_memo"></textarea>
	<input type="file" name="up_file"/>
	<button>추가</button>
</form> --%>

<form:form modelAttribute="memoVO" enctype="multipart/form-data">
	<form:input path="m_author" placeholder="m_author"/>
	<form:textarea path="m_memo" placeholder="m_memo"/>
	<input type="file" name="up_file"/>
	<button>추가</button>
</form:form>
</body>
</html>



