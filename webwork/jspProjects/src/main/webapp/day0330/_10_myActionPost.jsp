<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Hi+Melody&family=Nanum+Brush+Script&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<title>Insert title here</title>
</head>
<body>
		
		<h2>POST 방식으로 읽기</h2>
		
		<!-- post방식에서는 받는쪽에서 엔코딩해줘도 된다. 
		   보안성, 대용량 데이터는 post로 검색같은거는 get방식 -->
		<%
		request.setCharacterEncoding("Utf-8");
		String msg=request.getParameter("msg");
		
		%>
		
		<b>입력한 메세지는 <br>
		<font color="blue"><%=msg %></font>입니다.
		</b>



</body>
</html>