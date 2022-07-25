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

	<h3>제목 ${title }</h3>
	
	<h3>업로드할 이미지들</h3>
	<c:forEach var="im" items="${files }">
		<img alt="" src="../photo/${im }" style="max-width: 200px; border: 1px solid gray;">
	</c:forEach>
	
	<h3>업로드할 실제경로: ${path }</h3>
</body>
</html>