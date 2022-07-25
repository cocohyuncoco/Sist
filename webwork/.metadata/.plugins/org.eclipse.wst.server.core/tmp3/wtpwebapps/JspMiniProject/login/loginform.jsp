<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle:wght@300&family=Gamja+Flower&family=Hi+Melody&family=Titillium+Web:wght@200&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<% 
//세션으로부터 아이디저장 체크값,아이디를 얻는다
String saveok=(String)session.getAttribute("saveok");
String id=(String)session.getAttribute("idok");
%>
<body>
<form action="login/loginaction.jsp" method="post">
	<table class="table table-bordered" style="width: 250px; margin: 0 auto; ">
		<caption><font size="7">&nbsp;&nbsp;회원로그인</font></caption>
	<br><br><br><br>
		<tr height="30">
		  	<th width="80" bgcolor="#fff0f5"><font size="4">아이디</font></th>
		  		<td>
		  		<% 
		  		if(saveok==null)  //아이디저장 체크란에 체크를 안했을때
		  		{%>
		  			<input type="text" size="10" name="id"
		  			autofocus="autofocus" class="form-control" value=""> 
		  		<%}else //아이디저장에 체크가 되었을때....아이디세션값 유지
		  		{%>
		  			<input type="text" size="10" name="id"
		  			autofocus="autofocus" class="form-control" value="<%= id %>"> 
		  		<%}
		  		%>
		  		</td>
		  </tr>
		  
		  
		  <tr height="30">
		  	<th width="80" bgcolor="#fff0f5"><font size="3">비밀번호</font></th>
		  		<td>
		  			<input type="password" size="10" name="pass"
		  			required="required" class="form-control"> 
		  		</td>
		  </tr>
	
		<tr height="30">
		  	<td colspan="2" style="padding-left: 10px;background-color: #fff0f5;">
		  	
		  	<% 
		  	if(saveok==null) //아이디저장 체크란에 체크를 안했을때
		  	{%>
		  		<input type="checkbox" name="savechk" style="margin-left: 15px; ">
		  		&nbsp;&nbsp;아이디저장
		  	<%}else //아이디저장에 체크가 되었을때
		  	{%>
		  		<input type="checkbox" name="savechk" checked="checked">아이디저장
		  	<%}
		  	%>
		  		<b style="margin-left: 28px;">보안로그인</b>
		  	</td>
		  </tr>
		   
		  <tr height="30">
		  	<td colspan="2" align="center">
		  		<input type="submit" value="로그인" class="btn btn-info">
		  		<input type="button" value="회원가입" onclick="" class="btn btn-danger">
		  	</td>
		  </tr>
	
	</table>

</form>
</body>
</html>