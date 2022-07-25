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
   /*
        font-family: 'Black Han Sans', sans-serif;
        font-family: 'Nanum Pen Script', cursive;
        font-family: 'Single Day', cursive;
        font-family: 'Song Myung', serif;
        font-family: 'Stylish', sans-serif;
    */
    
    div.logfrom{
    	width:500px;
    	margin: 0 auto;
    	margin-top:100px;
    }
    
</style>
</head>
<%
	//세션에 저장된 아이디
	String id = (String)session.getAttribute("mid");

	//세션에 저장된 아이디 저장 체크값
	String saveid = (String)session.getAttribute("saveid");
	
	//아이디 저장에 체크하면 true, 안하면 false
	boolean b;
	if(saveid==null || saveid.equals("no")){
		b = false;
	}else b = true;
	
	
%>
<body>
	<div class="logfrom">
		<h2>회원로그인</h2>
		<form action="loginaction.jsp" method="post">
			<input type="text" class="form-control input-lg" name="mid" style="width: 200px;" placeholder="로그인할 아이디" 
			value="<%=b?id:"" %>" required="required">
			<br>
			<input type="password" class="form-control input-lg" name="pass" style="width: 200px;" placeholder="로그인할 비밀번호" required="required">
			<br>
			<button type="submit" class="btn btn-success btn-lg" style="width:200px; height:50px;">로그인</button>
			<br>
			<input type="checkbox" name="saveid" <%=b?"checked":""%> >아이디저장
		</form>
	
	
	</div>
</body>
</html>