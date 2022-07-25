<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
 
</style>
</head>
<body>
	<%
		String num = request.getParameter("num");
	
	%>
	
<div>
	<form action="member/updatepassaction.jsp" method="post">
		<input type="hidden" name="num" value="<%=num%>">
		<b>수정시 필요한 비밀번호를 입력해 주세요</b>
		<br><br>
		<input type="password" name="pass" class="form-control" style="width:120px;" required="required">
		<button type="submit" class="btn btn-success">확인</button>		
	</form>
</div>
</body>
</html>