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
		<table class="table table-bordered" style="width: 400px;">
			<caption><b>회원 데이터 입력</b></caption>
			<tr>
				<th width="100" bgcolor="#ffc">이름</th>
				<td>
					<input type="text" name="name" class="form-control input-sm" style="width: 100px">
				</td>
			</tr>			
			
			<tr>
				<th width="100" bgcolor="#ffc">운전면허</th>
				<td>
					<input type="radio" name=driver  value="있음" checked="checked">있음
					<input type="radio" name=driver  value="없음">없음
				</td>
			</tr>	
			
			<tr>
				<th width="100" bgcolor="#ffc">주소</th>
				<td>
					<input type="text" name="addr" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>
			
			<tr>
				<th width="100" bgcolor="#ffc">사진</th>
				<td>
					<input type="file" name="upload" class="form-control input-sm" style="width: 300px">
				</td>
			</tr>			
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-danger">회원DB에 저장</button>
					<button type="button" class="btn btn-info" onclick="location.href='list'">목록</button>
				</td>
			</tr>
			
			
		</table>
	</form>

</body>
</html>