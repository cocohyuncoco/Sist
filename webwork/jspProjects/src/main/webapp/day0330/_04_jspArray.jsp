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

<% 
	String[] str={"f1.png","f2.png","f3.png","f4.png","f5.png","f6.png","f7.png","f8.png","f9.png"};
	
	int n =0; //증가할수있는 변수
%>
	<table class="table table-bordered" style="width: 500px;">
		
	<%
		for(int i=0; i<3; i++){//행%> 
		 <tr height="80px;">
			<%
			  for(int j=0; j<3; j++){ //열
			  %>
				<td>
					<img alt="" src="../image/<%=str[n]%>" width="150px;" height="150px;">
				</td>					  
			  <%
			  	n++;
			  }%>				
		 </tr>
		<% }%>
	
	</table>
</body>
</html>