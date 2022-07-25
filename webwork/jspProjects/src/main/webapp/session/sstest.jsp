<%@page import="java.sql.Date"%>
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
	<!-- 
		세션 테스트 할수잇는 가장 간단한게 로그인
		
		◆설정됫던 속성값없애는 -> 리무브어트리뷰트	
	 -->
	 <%
	 	//세션을 지정(저장)하는 방법
	 	session.setAttribute("msg", "Happy Day");
	 						//스트링값, 오브젝트값
	 
	 	//세션의 시간설정
	 	session.setMaxInactiveInterval(60); //60초 설정
	 	
	 	
	 %>
	 
	 <h3>세션값 얻기</h3>
	 세션값: <%=session.getAttribute("msg") %><br>
	 세션 유지시간: <%=session.getMaxInactiveInterval() %> 초<br>
	 세션 생성시간: <%=session.getCreationTime() %><br>
	 세션 생성시간: <%=new Date(session.getCreationTime())%><br>
	 
</body>
</html>