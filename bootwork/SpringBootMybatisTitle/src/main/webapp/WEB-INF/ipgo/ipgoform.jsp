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
		<table class="table table-bordered" style="width: 500px; margin: 0 auto;">
			<caption><b>상품정보 입력</b></caption>
			<tr>
				<th bgcolor="#ddd">상품명</th>
				<td>
					<input type="text" name="sangpum" class="form-control" style="width: 100%;" required="required">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">단가</th>
				<td>
					<input type="text" name="price" class="form-control" style="width: 100%;" required="required">
				</td>
			</tr>
			<tr>
				<th bgcolor="#ddd">이미지</th>
				<td>
					<!-- 이미지 name은 DB컬럼이랑 달라도됨 -->
					<input type="file" name="upload" class="form-control" style="width: 100%;" required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center" bgcolor="#ddd">
					<button type="submit" class="btn btn-success">저장</button>
					<button type="button" class="btn btn-info" onclick="location.href='list'">목록</button>
				</td>
			</tr>			
		</table>	
	</form>


</body>
</html>