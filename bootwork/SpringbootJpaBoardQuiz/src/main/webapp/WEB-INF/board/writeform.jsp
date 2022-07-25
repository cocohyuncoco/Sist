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
	
	<form action="insert" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width: 500px;">
			<caption><b>새 글쓰기</b></caption>
			
			<tr>
				<th bgcolor="#ddd" width="120">작성자</th>
				<td>
					<input type="text" name="writer" class="form-control" style="width: 200px;" required="required">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">제목</th>
				<td>
					<input type="text" name="subject" class="form-control" style="width: 200px;" required="required">
				</td>
			</tr>
		
			<tr>
				<th bgcolor="#ddd">사진</th>
				<td>
					<input type="file" name="upload" class="form-control" style="width: 200px;">
				</td>
			</tr>
			
			<tr>				
				<td colspan="2">
					<textarea style="width: 100%; height: 150px;" name="content" class="form-control" required="required"></textarea>
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">구입날짜</th>
				<td>
					<input type="date" name="carguip" class="form-control" style="width: 200px;" required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">글 등록하기</button>
					<button type="button" class="btn btn-success" 
					onclick="location.href='list'">목록</button>
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>