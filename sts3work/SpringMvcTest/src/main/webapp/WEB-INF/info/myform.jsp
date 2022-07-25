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

	<form action="result" method="post">
		<table class="table table-bordered" style="width: 450px;">
			<tr>
				<th style="width: 140px;">이름</th>
				<td>
					<input type="text" name="name" class="form-control">
				</td> 
			</tr>
			
			<tr>
				<th style="width: 140px;">좋아하는 색</th>
				<td>
					<input type="color" name="color" class="form-control">
				</td> 
			</tr>
			
			<tr>
				<th style="width: 140px;">취미</th>
				<td>
					<input type="checkbox" name="hobby" value="독서">독서
					<input type="checkbox" name="hobby" value="운동">운동
					<input type="checkbox" name="hobby" value="맛집탐방">맛집탐방
					<input type="checkbox" name="hobby" value="게임">게임
					<input type="checkbox" name="hobby" value="영화감상">영화감상
				</td> 
			</tr>
			
			<tr>
				<th style="width: 140px;">가장 재밌는 언어</th>
				<td>
					<select name="lang" class="form-control">
						<option value="JAVA">JAVA</option>
						<option value="HTML">HTML</option>
						<option value="AJAX">AJAX</option>
						<option value="Spring">Spring</option>
					</select>
				</td> 
			</tr>
			
			
			<tr>				
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">서버에 전송</button>
				</td> 
			</tr>
		</table>	
	</form>

</body>
</html>