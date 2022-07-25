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
  table tr td{
  		padding: 10px 0;
  	}
</style>
</head>
<%
	String saveok = (String)session.getAttribute("saveok");
	String id = (String)session.getAttribute("idok");
%>
<body>

	<form action="login/loginaction.jsp" method="post">
		<table style="width:300px; margin: 0 auto;">
			<tr height="30">
				<th colspan="2" style="font-size:30px; text-align: center; padding: 20px 0;">로그인</th>
			</tr>
			
			<tr height="30">
				<th width="100">아이디:</th>
				<td>
					<%
						if(saveok==null){
							%>
							<input type="text" name="id" autofocus="autofocus" class="form-control" value="" placeholder="아이디를 입력하세요">
						<%}else{%>
							<input type="text" name="id" autofocus="autofocus" class="form-control" value="<%=id%>" placeholder="아이디를 입력하세요">
						<%}
					%>
				</td>
			</tr>
			
			<tr height="30">
				<th width="100">비밀번호:</th>
				<td>
					<input type="password" name="pass" required="required" class="form-control" placeholder="비밀번호를 입력하세요">
				</td>
			</tr>
		
			
			<tr>
				<td colspan="2">
					<%
						if(saveok==null){%>
							<input type="checkbox" name="savechk">아이디저장
						<%}else{%>
							<input type="checkbox" name="savechk" checked="checked">아이디저장
							<!-- <input type="checkbox" name="savechk" checked="checked" <%=saveok==null?"":"checked"%>>아이디저장 -->
						<%}
					%>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인" class="btn btn-info">
					<input type="button" value="회원가입" class="btn btn-success" onclick="location.href='index.jsp?main=member/memberform.jsp'">
				</td>
			</tr>
			
		</table>
	
	
	</form>
	

</body>
</html>