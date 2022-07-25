<%@page import="idx.idxDao"%>
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
	//세션으로부터 아이디 읽어온다
	String id = (String)session.getAttribute("idok");

	//id에 해당하는 이름 얻기
	idxDao dao = new idxDao();
	String name = dao.getName(id);
%>

	<br><br>
	<b style="color:gray;"><%=name %></b>님이 로그인 하셨습니다
	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	
	<input type="button" value="로그아웃" onclick="location.href='logoutPrco.jsp'">
	<br><br>
	
	
	<img alt="" src="../image/bgspring.jpg">	
	
	
</body>
</html>















