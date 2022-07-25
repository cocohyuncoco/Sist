<%@page import="team.TeamDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script><!--�������� ��ũ-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"><!--��Ʈ��Ʈ�� ��ũ-->
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet"> <!--������Ʈ ��ũ-->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> <!--��Ʈ��Ʈ�� ��ũ��Ʈ-->
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
		
			//num 읽기
			String num = request.getParameter("num");
			//dao선언해야 메서드 불러옴
			TeamDao dao = new TeamDao();
			//삭제메서드 호출
			dao.teamDelete(num);
			//list로 이동
			response.sendRedirect("teamlist.jsp");
		%>

</body>
</html>