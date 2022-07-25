<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
</head>
<body>

<c:set var="tot" value="${java+spring+jquery }"/>
<c:set var="avg" value="${tot/3 }"/>

	<table class="table table-bordered" style="width: 300px">
		<tr>
			<th>이름</th>
			<td>${name }</td>
		</tr>
		<tr>
			<th>자바 점수</th>
			<td>${java }점</td>			
		</tr>
		<tr>
			<th>스프링 점수</th>
			<td>${spring }점</td>
		</tr>
		<tr>
			<th>제이쿼리 점수</th>
			<td>${jquery }점</td>
		</tr>		
		<tr>
			<th>총합계</th>
			<td>${tot }</td>
		</tr>
		<tr>
			<th>평균</th>
			<td>${avg }</td>
			
		</tr>
	</table>
</body>
</html>