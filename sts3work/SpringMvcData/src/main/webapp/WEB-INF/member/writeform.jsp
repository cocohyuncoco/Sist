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
	
	<form action="write" method="post">
		<table class="table table-bordered" style="width: 400px;">
			<caption><b>멤버등록</b></caption>
			<tr>
				<th width="100">이름</th>
				<td>
					<input type="text" name="name" class="form-control input-sm" style="width: 100px">
				</td>
			</tr>
			
			<tr>
				<th width="100">아이디</th>
				<td>
					<input type="text" name="id" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>
			
			<tr>
				<th width="100">비밀번호</th>
				<td>
					<input type="text" name="pass" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>
			
			<tr>
				<th width="100">번호</th>
				<td>
					<input type="text" name="hp" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>			
			
			<tr>
				<th width="100">주소</th>
				<td>
					<input type="text" name="addr" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>
			<tr>
				<th width="100">이메일</th>
				<td>
					<input type="text" name="email" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-danger">DB에 저장</button>
				</td>
			</tr>
			
			
		</table>
	</form>

</body>
</html>