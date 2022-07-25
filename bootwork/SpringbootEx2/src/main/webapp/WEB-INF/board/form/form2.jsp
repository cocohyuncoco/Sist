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
	<h2>폼데이터 DTO읽기</h2>
	<form action="read2" method="post">
		<table class="table table-bordered" style="width:300px">
			<tr>
				<th style="width: 100px;">이름</th>
				<td>
					<input type="text" name="name" class="form-control">
				</td>
			</tr>
			<tr>
				<th style="width: 100px;">나이</th>
				<td>
					<input type="text" name="age" class="form-control">
				</td>
			</tr>
			<tr>
				<th style="width: 100px;">주소</th>
				<td>
					<input type="text" name="addr" class="form-control">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-success">서버전송</button>					
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>