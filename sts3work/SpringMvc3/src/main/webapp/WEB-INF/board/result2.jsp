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

<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
	
	<h2>${title }</h2>
	<img alt="" src="${myimg1 }">

	<hr>
	
	<table style="width: 200px;">
		<tr>
			<th>이름</th>
			<th>핸드폰</th>
		</tr>
		<tr>
			<td>홍길동</td>			
			<td>000-1111-2222</td>
		</tr>
	</table>
	
	<hr>
	
	<!-- 링크 걸때는 action과 마찬가지로 파일명만 쓰기 -->
	<!-- 	<a href="board/form1">writeform으로 이동</a> -->
	<a href="form1">writeform으로 이동</a>
	
</body>
</html>