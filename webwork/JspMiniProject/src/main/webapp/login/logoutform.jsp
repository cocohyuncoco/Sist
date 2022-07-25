<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gamja+Flower&family=Hi+Melody&family=Titillium+Web:wght@200&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
div{
	text-align: center;
}
</style>
</head>
<body>
<% 
//세션으로부터 id읽어온다
String id=(String)session.getAttribute("idok");

//id에 해당하는 이름 얻기
MemberDao dao=new MemberDao();
String name=dao.getName(id);

%>
	<div>
		<img alt="" src="image/welcome.png" style="width:200px; margin-top: 50px; text-align: center;">
		<br><br>
		
		<b style="color: navy; font-size: 1.3em;"><%=name %></b>&nbsp;님이 로그인 하셨습니다
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		<input type="button" class="btn btn-danger" value="로그아웃" onclick="location.href='login/logoutaction.jsp'">
	</div>
</body>
</html>