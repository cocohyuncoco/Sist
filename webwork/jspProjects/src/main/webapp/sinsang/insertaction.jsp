<%@page import="sinsang.sinsangDao"%>
<%@page import="sinsang.sinsangDto"%>
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
	
	//값 받아오기
	String name = request.getParameter("name");
	String blood = request.getParameter("blood");
	String birth = request.getParameter("birth");
	
	//010-0000-0000 얘네 3개를 합쳐서 http로 받아야함 __따로 띄어진것들은 이렇게 받으면된다
	String hp = request.getParameter("hp1")+"-"
				+request.getParameter("hp2")+"-"
				+request.getParameter("hp3");
	
	sinsangDto dto = new sinsangDto();
	dto.setName(name);
	dto.setBlood(blood);
	dto.setHp(hp);
	dto.setBirth(birth);
	
	sinsangDao dao = new sinsangDao();
	
	//dao에 set해논 dto를 넘긴다
	dao.insertSinsang(dto);
	
	//응답 받아야함
	response.sendRedirect("sslist.jsp");
	
%>
</body>
</html>