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

	<table class="table table-bordered" style="width: 450px">
		<tr>
			<th>이름</th>
			<td>${dto.name }</td>
		</tr>
		<tr>
			<th>좋아하는 색</th>
			<td bgcolor="${dto.color }"></td>			
		</tr>
		<tr>
			<th>취미</th>
			<td>
				<c:if test="${empty dto.hobby}">
				없음
				</c:if>
				<c:if test="${!empty dto.hobby}">	
					<c:forEach var="h" items="${dto.hobby }">
					[${h }]
					</c:forEach>
				</c:if>		
			</td>
		</tr>
		<tr>
			<th>가장 재밌는 언어</th>
			<td>${dto.lang }</td>
		</tr>
	</table>
</body>
</html>