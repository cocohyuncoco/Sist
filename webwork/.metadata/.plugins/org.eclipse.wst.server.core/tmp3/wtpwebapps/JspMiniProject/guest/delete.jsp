<%@page import="java.io.File"%>
<%@page import="data.dao.GuestDao"%>
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
	//주의: DB삭제포함 업로드된 사진파일도 삭제
	
	String num = request.getParameter("num");
	String currentPage = request.getParameter("currentPage");
	
	//DB로부터 저장된 이미지명 얻기
	GuestDao dao = new GuestDao();
	String photoname = dao.getData(num).getPhotoname();
	
	//DB삭제
	dao.deleteGuest(num);
	
	//프로젝트 살제경로
	String realPath = getServletContext().getRealPath("/save");
	
	//파일객체 생성 (생성해서 파일삭제)__어느경로의 어느 이미지다 입력
	File file = new File(realPath+"\\"+photoname);
	//파일삭제
	file.delete();
	
	//보던페이지로 이동
	response.sendRedirect("../index.jsp?main=guest/guestlist.jsp?currentPage="+currentPage);
	
%>
</body>
</html>