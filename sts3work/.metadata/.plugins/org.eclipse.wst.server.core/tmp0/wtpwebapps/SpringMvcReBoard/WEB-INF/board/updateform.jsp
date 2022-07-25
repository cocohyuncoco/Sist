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

	<div style="margin-left: 50px;">
		<form action="update" method="post" enctype="multipart/form-data">													
			<!-- hidden 2개 -->
			<input type="hidden" name="num" value="${dto.num}">
			<input type="hidden" name="currentPage" value="${currentPage}">
		
			
			<table class="table table-bordered" style="width: 500px;">
				<caption><b>수정폼</b></caption>
		
				<tr>
					<th width="100" bgcolor="#ddd">작성자</th>
					<td width="130">
						<input type="text" name="writer" class="form-control" required="required" value="${dto.writer }"> 
					</td>
				</tr>	
				
				<tr>
					<th width="100" bgcolor="#ddd">제목</th>
					<td colspan="3">
						<input type="text" name="subject" class="form-control" required="required" value="${dto.subject }"> 
					</td>
				</tr>	
				
				<tr>
					<th width="100" bgcolor="#ddd">사진</th>
					<td colspan="3">
						<input type="file" name="upload" class="form-control" multiple="multiple"> 
					</td>
				</tr>	
				
				<tr>					
					<td colspan="4">
						<textarea style="width: 100%; height: 150px;" name="content" required="required">${dto.content }</textarea> 
					</td>
				</tr>
				
				<tr>					
					<td colspan="4" align="center">							
						<button type="submit" class="btn btn-success">수정하기</button>
						<button type="button" class="btn btn-info" onclick="history.back()">이전으로</button> 
					</td>
				</tr>
								
			</table>
		
		</form>
	</div>
</body>
</html>