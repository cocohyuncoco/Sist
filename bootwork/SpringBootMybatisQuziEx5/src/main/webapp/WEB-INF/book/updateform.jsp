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
		<h2>책 정보수정</h2>
	
		<form action="update" method="post" enctype="multipart/form-data">
		<input type="hidden" name="num" value="${dto.num }">
		
		<b>제목</b>:
		<input type="text" name="bookname" class="form-control" style="width: 200px;" value="${dto.bookname  }"><br>
		
		<b>저자</b>:
		<input type="text" name="writer" class="form-control" style="width: 200px;" value="${dto.writer }"><br>
		
		<b>가격</b>:
		<input type="text" name="bookprice" class="form-control" style="width: 200px;" value="${dto.bookprice }"><br>
		
		<b>이미지</b>:
		<input type="file" name="photo" class="form-control" style="width: 200px;"><br>
		
		<b>책 주제(내용)</b>:
		<textarea style="width: 500px; height: 200px" name="booksubject" class="form-control">${dto.booksubject }</textarea>
		<br>
		
		<b>출판사</b>:
		<input type="text" name="bookcompany" class="form-control" style="width: 200px;" value="${dto.bookcompany }"><br>
		
		<button type="submit" class="btn btn-success">DB에 수정</button>
	</form>
</body>
</html>