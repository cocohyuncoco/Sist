<%@page import="ajaxboard.AjaxBoardDto"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
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
	//dao선언
	AjaxBoardDao dao = new AjaxBoardDao();

	//엔코딩
	request.setCharacterEncoding("UTF-8");
	
	//데이터 읽기
	String writer = request.getParameter("writer");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String avata = request.getParameter("avata");
	
	//dto로 묶어줍니다
	AjaxBoardDto dto = new AjaxBoardDto();
	
	dto.setWriter(writer);
	dto.setContent(content);
	dto.setSubject(subject);
	dto.setAvata(avata);
	
	//insert호출해서 묶어논 dto를 넘긴다
	dao.insertboard(dto);

%>
</body>
</html>