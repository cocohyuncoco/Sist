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
	
	<form action="update" method="post">
		<input type="hidden" name="num" value="${dto.num }">
	
		<table class="table table-bordered" style="width: 500px;">
			<caption><b>차 정보 수정</b></caption>
			
			<tr>
				<th bgcolor="#ddd">자동차명</th>
				<td>
					<input type="text" name="carname" class="form-control" style="width: 200px;" value="${dto.carname }">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">단가</th>
				<td>
					<input type="text" name="price" class="form-control" style="width: 200px;" value="${dto.price }">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">색깔</th>
				<td>
					<input type="color" name="carcolor" class="form-control" style="width: 200px;" value="${dto.carcolor}">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">구입날짜</th>
				<td>
					<input type="date" name="carguip" class="form-control" style="width: 200px;" value="${dto.carguip }">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">자동차수정</button>
					<button type="button" class="btn btn-success" 
					onclick="location.href='list'">목록</button>
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>