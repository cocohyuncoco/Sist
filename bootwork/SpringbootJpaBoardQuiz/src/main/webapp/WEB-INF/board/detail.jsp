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
	<h1>${dto.writer }님의 글 입니다</h1>
	
	<table class="table table-bordered" style="width: 500px; font-size: 20px;">
	
		<tr>
			<th bgcolor="pink" width="100">제목</th>
			<td>${dto.subject }			
			</td>
		</tr>
		<tr>
			<th bgcolor="pink">등록일</th>
			<td><fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd"/>	</td>
		</tr>
		
		<tr>
			<th bgcolor="pink">내용</th>
			<td>
				<img alt="" src="../save/${dto.photo }" style="width: 200px;">
				<br><br><br>
				${dto.content }
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" class="btn btn-info" onclick="location.href='list'">
					목록으로
				</button>
			</td>
		</tr>
	
	</table>
	
</body>
</html>