<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />    
<style>
	table {
		width:95%;
		margin:10px auto;
		border:1px solid green;
	}
	th, td {
		text-align: left;
	}
	
	div.btn-box {
		width:95%;
		margin:5px auto;
		text-align: right;
	}
=======
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<style>
table {
	width: 95%;
	margin: 10px auto;
	border: 1px solid green;
}

th, td {
	text-align: left;
}

div.btn-box {
	width: 95%;
	margin: 5px auto;
	text-align: right;
}
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
</style>
<script src="${rootPath}/static/js/std_list.js?ver=2022-05-10-001"></script>
<table>
	<tr>
		<th>학번</th>
		<th>이름</th>
<<<<<<< HEAD
		<th>전화번호</th>
	</tr>
	<c:forEach items="${ST_LIST}" var="ST">
	<tr>
		<th>${ST.st_num}</th>
		<th>${ST.st_name}</th>
		<th>${ST.st_tel}</th>
	</tr>
	</c:forEach>

=======
<<<<<<< HEAD
		<th>전화번호</th>
	</tr>
	<c:forEach items="${ST_LIST}" var="ST">
		<tr>
			<td>${ST.st_num}</td>
			<td>${ST.st_name}</td>
			<td>${ST.st_tel}</td>		
		</tr>
	</c:forEach>
	
	
=======
		<th>학과</th>
		<th>학년</th>
		<th>전화번호</th>
	</tr>
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
</table>
<div class="btn-box">
	<button class="btn-green std-input">학생정보 등록</button>
</div>


