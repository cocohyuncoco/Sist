<%@page import="idx.idxDao"%>
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
	String id = request.getParameter("id");
 	String pass = request.getParameter("pass");
 	String save = request.getParameter("savechk");
 	
 	//아이디 비번 맞는지 확인
 	idxDao db = new idxDao();
 	boolean flag = db.isLogin(id, pass);
 	
 	//맞으면 세션 저장후에 로그인 메인으로 이동
 	if(flag){
 		
 		//로그인 중인지 알수잇는 세션 저장
		session.setAttribute("loginok", "yes");
 		
 		//아이디, 체크값 저장
 		session.setAttribute("idok", id); //파라메타 받은 id 넣음
 		
 		//체크박스 체크하면 on 안하면 null
 		session.setAttribute("saveok", save); //파라메타 받은 savechk 넣음
 		
 		//세션 유지시간 
 		session.setMaxInactiveInterval(60*60*8); //8시간동안 유지
 		
 		//맞으면 어디로갈지 -> 로그인메인으로 이동
 		response.sendRedirect("loginMain.jsp");
 	}else{%>
 		<script type="text/javascript">
 		 	alert("아이디와 비밀번호가 일치하지 않습니다");
 		 	history.back();
 		</script>
 	<%}
 	
%>
</body>
</html>