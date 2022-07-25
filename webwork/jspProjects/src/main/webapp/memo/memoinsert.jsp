<%@page import="memo.memoDto"%>
<%@page import="memo.memoDao"%>
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
	memoDao dao = new memoDao();

	//엔코딩
	request.setCharacterEncoding("UTF-8");
	
	//데이터 읽기
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	String avatar = request.getParameter("avatar");
	
	//dto로 묶어줍니다
	memoDto dto = new memoDto();
	
	dto.setWriter(writer);
	dto.setContent(content);
	dto.setAvatar(avatar);
	
	//insert호출해서 묶어논 dto를 넘긴다
	dao.insertMemo(dto);

%>
</body>
</html>