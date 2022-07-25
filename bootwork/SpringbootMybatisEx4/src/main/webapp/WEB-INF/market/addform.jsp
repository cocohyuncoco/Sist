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
	
	<h2>Market 정보입력</h2>
	
	<form action="insert" method="post" enctype="multipart/form-data">
		<b>상품명</b>:
		<input type="text" name="sang" class="form-control" style="width: 200px;"><br>
		<b>단가</b>:
		<input type="text" name="dan" class="form-control" style="width: 200px;"><br>
		<b>이미지</b>:
		<input type="file" name="photo" class="form-control" style="width: 200px;"><br>
		
		<button type="submit" class="btn btn-success">DB에 저장</button>
	</form>
	
</body>
</html>