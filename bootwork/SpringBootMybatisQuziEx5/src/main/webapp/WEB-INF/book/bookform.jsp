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
	
	<div style="width: 500px; margin: 0 auto;">
		<h2>책 정보입력</h2>
		
		<form action="insert" method="post" enctype="multipart/form-data">
		<b>제목</b>:
		<input type="text" name="bookname" class="form-control" style="width: 500px;"><br>
		
		<b>저자</b>:
		<input type="text" name="writer" class="form-control" style="width: 500px;"><br>
		
		<b>가격</b>:
		<input type="text" name="bookprice" class="form-control" style="width: 500px;"
		oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" placeholder="숫자만 입력해주세요"><br>
		
		<b>이미지</b>:
		<input type="file" name="upload" class="form-control" style="width: 500px;"><br>
		
		<b>책 주제(내용)</b>:
		<textarea style="width: 500px; height: 200px" name="booksubject" class="form-control"></textarea><br>
				
		<b>출판사</b>:
		<input type="text" name="bookcompany" class="form-control" style="width: 500px;"><br>
		
		<br>
		<button type="submit" class="btn btn-success">DB에 저장</button>
		<button type="button" class="btn btn-info" onclick="location.href='list'">목록</button>
	</form>
	</div>
</body>
</html>