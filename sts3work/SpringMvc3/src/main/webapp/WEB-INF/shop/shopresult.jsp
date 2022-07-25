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

	<table class="table table-bordered" style="width: 300px">
		<tr>
			<th>상품명</th>
			<td>${shopDto.sang }</td>
		</tr>
		<tr>
			<th>수량</th>
			<td><fmt:formatNumber value="${shopDto.su }" pattern="#,##0"/></td>			
		</tr>
		<tr>
			<th>단가</th>
			<td><fmt:formatNumber value="${shopDto.dan }" type="currency"/></td>
		</tr>
		<tr>
			<th>총금액</th>
			<td><fmt:formatNumber value="${shopDto.su*shopDto.dan }" type="currency"/></td>
		</tr>
		<tr>
			<th>색상</th>
			<td bgcolor="${shopDto.color }"></td>
		</tr>
	</table>
</body>
</html>