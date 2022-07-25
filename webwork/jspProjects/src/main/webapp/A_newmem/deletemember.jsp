<%@page import="java.io.File"%>
<%@page import="newmem.NewmemDao"%>
<%@page import="newmem.NewmemDto"%>
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

	//루트 (/)의 서버에 배포된 실제폴더 구하기
	String path = getServletContext().getRealPath("/");
	System.out.println(path);
	
	//num읽기
	String num = request.getParameter("num");
	//num에 해당하는 photo값 얻기
	NewmemDao dao = new NewmemDao();
	String photo = dao.getData(num).getPhoto();
	
	//photo 실제 경로를 save폴더일 경우에만 해당이미지 삭제
	if(photo.startsWith("save")){
		File file = new File(path+"\\"+photo);
		file.delete();
	}
	
	//num에 해당하는 db데이터 삭제
	dao.deleteNewmem(num);
	
	//로그인시 저장한 세션도 삭제
	session.removeAttribute("loginok");
	session.removeAttribute("mid");
	session.removeAttribute("saveid");
	
	//삭제 후 성공하면 리스트로
	response.sendRedirect("../A_newmem/list.jsp");
%>
</body>
</html>