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

	<!-- 인덱스 있을때 홈컨트롤러 없어도댐..삭제헀음 -->
	<%-- <c:redirect url="list"></c:redirect> --%>
	
	<a href="list">스프링 게시판 연습</a>	
	<br>
	<a href="member/list">스프링 과제_member</a>
	<br>
	<a href="hoewon/list">스프링 월요일추가_hoewon(파일업로드_1개)</a>
	
</body>
</html>