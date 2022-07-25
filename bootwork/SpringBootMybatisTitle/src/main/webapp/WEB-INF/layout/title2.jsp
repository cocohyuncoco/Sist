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
<style type="text/css">

	div.login > button{
		float: right;
		}

</style>
</head>

	<!-- 절대경로 가져오기 -->
	<c:set var="root" value="<%=request.getContextPath() %>"/>
		
<body>
	
	<a>
		<img alt="" src="${root}/image/star9.png" width="100px;" height="100">		
	</a>
	<h3>쌍용 잡화점</h3>
	
	
	<div class="login">
		<button type="button" class="btn btn-success" onclick="location.href='${root}/logout/form'">Logout</button>
	</div>	
</body>
</html>