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
		session.setAttribute("msg", "Happy Time");
		session.setMaxInactiveInterval(10); //10초
	%>
	
	<h2>10초안에 눌러주세요!</h2>
	<form action="sessionAction.jsp" method="post">
		<h2>가고싶은 여행지는?</h2>
		<input type="radio" value="태국3박4일" name="travel">태국3박4일 &nbsp;
		<input type="radio" value="영국10박" name="travel">영국10박 &nbsp;
		<input type="radio" value="일본3박4일" name="travel">일본3박4일 &nbsp;
		<input type="radio" value="미국8박" name="travel">미국8박 &nbsp;
		<input type="radio" value="그리스 산토리니11박" name="travel">그리스 산토리니11박 &nbsp;
		<input type="submit" value="상품신청" >		 
	</form>
</body>
</html>