<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
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
   /*
        font-family: 'Black Han Sans', sans-serif;
        font-family: 'Nanum Pen Script', cursive;
        font-family: 'Single Day', cursive;
        font-family: 'Song Myung', serif;
        font-family: 'Stylish', sans-serif;
    */
</style>
</head>
<body>

<%
	request.setCharacterEncoding("utf-8");
	
	String grade = request.getParameter("grade");
	String[] lang = request.getParameterValues("lang");
	String file = request.getParameter("file");
	String semi = request.getParameter("semi");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	String color = request.getParameter("color");
	String date = request.getParameter("date");
	
%>

	<h3>**신상정보**</h3>
	
	<b>학력: <%=grade %></b><br>	
	
	<b>가능한 언어: 
	<%if(lang==null){%>
		<font color="blue">아무것도 못합니다<br></font>
	<% }else{
		for(int i=0; i<lang.length; i++){%>
			<%=lang[i] %>&nbsp;&nbsp;</b>
		<%}
	} %>
	
	
	
	
	<br><b>파일명: <%=file %></b><br>
	<b>세미1등조: <%=semi %></b><br>
	<b>키: <%=height %></b><br>
	<b>몸무게: <%=weight %></b><br>
	<b>색상:<%=color %> </b><br>
	<b>날짜:<%=date %> </b><br>
	


</body>
</html>