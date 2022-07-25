<%@page import="ajaxboard.AjaxBoardDao"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
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
	//post방식으로 한번에 보낼려면 엔코딩 먼저하고
	request.setCharacterEncoding("UTF-8");

	//업데이트된 unum값 받음
	String num= request.getParameter("unum");
	String writer= request.getParameter("uwriter");
	String subject= request.getParameter("usubject");
	String content= request.getParameter("ucontent");
	String avata= request.getParameter("uavata");
	
	AjaxBoardDto dto = new AjaxBoardDto();
	
	dto.setNum(num);
	dto.setWriter(writer);
	dto.setSubject(subject);
	dto.setContent(content);
	dto.setAvata(avata);
	
	AjaxBoardDao dao = new AjaxBoardDao();
	dao.AjaxboardUpdate(dto);

%>
</body>
</html>