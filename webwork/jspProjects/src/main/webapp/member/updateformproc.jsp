<%@page import="member.memberDao"%>
<%@page import="member.memberDto"%>
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
		 
		
		request.setCharacterEncoding("utf-8");
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String hp = request.getParameter("hp");
			
		//dto왜 받을까? 수정하려면 dto에 다시 set 해줘야한다
		memberDto dto = new memberDto();
		
		dto.setNum(num);
		dto.setName(name);
		dto.setHp(hp);
		
		//update호출
		memberDao dao = new memberDao();
		dao.memberUpdate(dto); //업데이트 메소드 호출, 인자값에 ↑ set받아준 값 넣음
		
		//목록
		//수정했으면 리스트로 이동해서 수정된거 보여줘야하기 때문에 맨 마지막에 목록으로 이동하게
		response.sendRedirect("memberlist.jsp");
	%>
	
	
</body>
</html>