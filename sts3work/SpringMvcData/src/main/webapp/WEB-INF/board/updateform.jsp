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
		<!-- hidden -->
		<input type="hidden" name="num" value="${dto.num }">
		
		<table class="table table-bordered" style="width: 400px;">
			<caption><b>글 수정</b></caption>
			<tr>
				<th width="100">작성자</th>
				<td>
					<input type="text" name="writer" class="form-control input-sm" style="width: 100px"
					value="${dto.writer }">
				</td>
			</tr>
			
			<tr>
				<th width="100">제목</th>
				<td>
					<input type="text" name="subject" class="form-control input-sm" style="width: 300px"
					value="${dto.subject }">
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<textarea style="width: 400px; height: 200px;" name="content" class="form-control">${dto.content }</textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-danger">DB에 수정</button>
				</td>
			</tr>
			
			
		</table>
	</form>

</body>
</html>