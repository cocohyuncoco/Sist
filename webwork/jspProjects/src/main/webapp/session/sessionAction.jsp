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
	request.setCharacterEncoding("UTF-8");
	
	String msg = (String) session.getAttribute("msg");
	String travel = request.getParameter("travel");
	
	if(msg==null || !msg.equals("Happy Time")){%>
		<h3 style="color:red;">시간초과로 꽝입니다!!</h3>
	<%}else{%>
		<h3 style="color:blue;">축하합니다 <%=travel %> 상품에 신청 되었습니다</h3>		
	<%};

%>

	<a href="sessionMain.jsp">다시선택</a>
</body>
</html>