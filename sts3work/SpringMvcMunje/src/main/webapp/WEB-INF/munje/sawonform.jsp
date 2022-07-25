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
</body>

	<form action="data" method="post">
		<table class="table table-bordered" style="width: 300px;">
			<tr>
				<th bgcolor="orange">사원명</th>
				<td>
					<input type="text" name="name" class="form-control" style="width:150px;">
				</td>
			</tr>		
			
			<tr>
				<th bgcolor="orange">급여</th>
				<td>
					<input type="text" name="pay" class="form-control" style="width:150px;">
				</td>
			</tr>
			
			<tr>
				<th bgcolor="orange">나이</th>
				<td>
					<input type="text" name="age" class="form-control" style="width:150px;">
				</td>
			</tr>
			
			<tr>
				<th bgcolor="orange">부서</th>
				<td>
					<input type="text" name="buseo" class="form-control" style="width:150px;">
				</td>
			</tr>	
			
			<tr>				
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-success">데이터 전송</button>
				</td>
			</tr>	
		</table>
	</form>
</html>