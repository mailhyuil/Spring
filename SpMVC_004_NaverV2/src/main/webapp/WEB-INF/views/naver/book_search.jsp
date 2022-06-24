<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
    
<section class="modal-content">
	<article class="ch-container ch-teal">
		<span 
		onclick="document.getElementById('modal_box').style.display='none'" 
		class="ch-button ch-display-top-right">&times;</span>
		
		<h2>네이버 검색 서비스</h2>
	</article>
	
=======
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<section class="modal-content">
	<article class="ch-container ch-teal">
		<span onclick="document.getElementById('modal_box').style.display='none'"
		class="ch-button ch-display-top-right">&times;</span>
		<h2>네이버 검색 서비스</h2>
	</article>
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
	<article class="ch-container">
		<table class="ch-table">
			<colgroup>
				<col width="300px">
				<col width="100px">
				<col width="100px">
			</colgroup>
			<thead>
				<tr>
					<th>도서명</th>
					<th>출판사</th>
					<th>저자</th>
				</tr>
			</thead>
			<tbody>
<<<<<<< HEAD
				<c:forEach items="${BOOKS}" var="BOOK">
					<tr>
						<td>${BOOK.title}</td>
						<td>${BOOK.publisher}</td>
						<td>${BOOK.author}</td>
=======
				<c:forEach items="${BOOKS }" var="BOOK">
					<tr>
						<td>${BOOK.title }</td>
						<td>${BOOK.publisher }</td>
						<td>${BOOK.author }</td>
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</article>
<<<<<<< HEAD
</section>



=======
</section>
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
