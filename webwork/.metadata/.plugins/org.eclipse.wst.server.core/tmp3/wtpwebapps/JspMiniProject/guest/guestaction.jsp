<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="data.dao.GuestDao"%>
<%@page import="data.dto.GuestDto"%>
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
	
	//form에서 id를 안썼음
	//세션에서 DB에 저장할 id 얻기
	String myid = (String)session.getAttribute("idok");

	//이미지 업로드될 실제 경로 구하기 (파일명 save라 생성해서 /save 입력)
	String realpath = getServletContext().getRealPath("/save");
	System.out.println(realpath);
	
	int uploadSize = 1024*1024*2; //2mb
	
	MultipartRequest multi = null;
	
	try{
		multi = new MultipartRequest(request, realpath, uploadSize, "utf-8",
				new DefaultFileRenamePolicy());
		
		//request 아니고 multi로 모든 폼데이터 변수 읽어온다
		String content = multi.getParameter("content");
							//img파일 가져올땐 getFilesystemName
							//DB 네임이 아니라 from 네임 쓰기 ↓
		String photoname = multi.getFilesystemName("photo");
		
		//Dto에 저장
		GuestDto dto = new GuestDto();		
		dto.setMyid(myid);
		dto.setContent(content);
		dto.setPhotoname(photoname);	
		
		//Dao 선언해서 insert메서드 연결, 새로 저장한 DTO값 넘김
		GuestDao dao = new GuestDao();		
		dao.insertGuest(dto);
		
		//방명록추가 후 방명록리스트로 이동
		response.sendRedirect("../index.jsp?main=guest/guestlist.jsp");
		
	}catch(Exception e){
		
	}
%>
</body>
</html>