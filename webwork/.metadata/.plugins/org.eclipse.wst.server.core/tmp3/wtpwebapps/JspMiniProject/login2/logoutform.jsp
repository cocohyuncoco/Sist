<%@page import="data.dao.MemberDao"%>
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
<%
	
	String id =(String)session.getAttribute("idok");

	MemberDao dao = new MemberDao();
	String name = dao.getName(id);
	
%>
<body>
	
		<div style="width:340px; margin: 0 auto;">
		
		<img alt="" src="image/welcome.png" style="width:200px;display: flex; margin: 0 auto;">
		
		<p style="font-size:24px;text-align: center;"><b style="color: #38d3db; "><%=name %></b>님 환영합니다</p>
		
		<button type="button" class="btn btn-danger" style="float: right;" onclick="location.href='index.jsp?main=login/loginform.jsp'">로그아웃</button>
		</div>
		
</body>
</html>