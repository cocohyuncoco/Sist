<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	<table class="table table-bordered" style="width:800px;">
		<tr>
			<td colspan="8" align="center">
				<b style="font-size:2em;">전체구구단</b>
			</td>
		</tr>
		
		<tr bgcolor="#ffc">
			<%
			for(int dan=2; dan<=9; dan++){
			%>
			<td align="center">
				<b><%=dan %>단</b>
			</td>	
			<% }
			%>
		</tr>
		
		<% for(int i=1; i<=9; i++){%>
		   <tr>
		   	 <%
		   	 for(int dan=2; dan<=9; dan++){
		   	 %>
		   		<td align="center">
					<%=dan %>X<%=i %>=<%=dan*i%>
				</td>
		 	<%}
		 	%>
		   </tr>
		<%}
		%>
				
		
	</table>
		
	
</body>
</html>