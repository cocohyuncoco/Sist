<%@page import="memo.memoDao"%>
<%@page import="memo.memoDto"%>
<%@page import="member.memberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Hi+Melody&family=Nanum+Brush+Script&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
		
		//엔코딩
		request.setCharacterEncoding("utf-8");
		
		//전달받은 값 변수에 저장
		String num=request.getParameter("unum");
		String writer=request.getParameter("uwriter");
		String content=request.getParameter("ucontent");
		String avatar=request.getParameter("uavatar");
		
		//DTO선언
		memoDto dto= new memoDto();
		
		//DTO에 값 전달
		dto.setNum(num);
		dto.setWriter(writer);
		dto.setContent(content);
		dto.setAvatar(avatar);
		
		//DAO 객체로 update 메서드 호출
		memoDao dao=new memoDao();
		dao.updateMemo(dto);
		
		%>
</body>
</html>

