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

	<h2>1번 폼에서 입력한 값_get</h2>
	이름: ${name }<br> 
	나이: ${age }<br>
	
	<!-- <button type="button" onclick="location.href='redirect:data/myform'">폼</button> -->
	<button type="button" onclick="location.href='myform'">폼</button>
	
</body>
</html>