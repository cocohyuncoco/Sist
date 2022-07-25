<%@page import="newmem.NewmemDao"%>
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
</head>
<body>
<%
	String loginok = (String)session.getAttribute("loginok");

	if(loginok==null){
		%>
		<button type="button" class="btn btn-info" style="width:120px; margin-left:100px;" onclick="location.href='loginform.jsp'">로그인</button>
	<%}else{
		NewmemDao dao = new NewmemDao();
		
		//세션에 저장된 아이디 얻기
		String id = (String)session.getAttribute("mid");
		
		//아이디에 해당하는 name 얻기
		String name = dao.getName(id);
		%>
		<b><%=name %>님이 로그인 하셨습니다</b>
		<button type="button" class="btn btn-success" style="width:120px; margin-left:30px;" onclick="location.href='logoutaction.jsp'">로그아웃</button>
	<%}
	
%>
	<hr>
	<img alt="" src="../image/star8.png" style="width:300px;">
	
</body>
</html>