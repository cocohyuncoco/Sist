<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String message = request.getParameter("msg");
		String imgname = request.getParameter("imgname");
		
	%>
	<h3>전달받은 메세지:<%=message %></h3>
	<h3>전달받은 이미지명:
	<img alt="" src="<%=imgname %>"></h3>
	
</body>
</html>