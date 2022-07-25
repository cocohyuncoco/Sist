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
<style>
   
</style>
</head>

	<%
		String num = request.getParameter("num");
		//★num을 hidden으로 처리해주는게 제일 중요★
	%>
<body>
	
	<form action="passaction.jsp" method="post">
		<table class="table table-bordered" style="width: 250px;">
			<tr>
				<td>
					<b>삭제시 필요한 <br> 비밀번호를 입력하세요</b>
					<br>
					<input type="password" name="pass" size="14" required="required">
					
					<!-- hidden num 넘기기 -->
					<input type="hidden" name="num" value="<%=num %>">
					<input type="submit" value="확인"><!--  from은 무조건 submit-->
					<input type="button" value="목록" onclick="location.href='sslist.jsp'">
					
				</td>
			</tr>
		</table>	
	
	</form>
</body>
</html>