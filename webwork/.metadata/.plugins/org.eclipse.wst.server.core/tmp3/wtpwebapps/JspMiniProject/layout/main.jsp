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
    img.mainimg{
    	width:250px;
    	height: 160px;
    	box-shadow: 1px 6px 8px 0px #4f342a33;
    	margin-left: 50px;    	
    	border-radius: 30px;
    }
    table.maintb{
    	width: 700px;
    }
    table.maintb tr{
    	height:200px; 
    }
    img.mainimg:hover{
    	cursor: pointer;    	
    	width: 260px;
    	height: 200px;    	
    }
</style>
</head>
<body>
<table class="maintb">
<%
	int n=0;

	for(int row=1; row<=3; row++){
	%>
	<tr>
		<%
			for(int col=1; col<=4; col++){
				n++;
				%>
				<td>
					<img alt="" src="image/<%=n%>.jpg" class="mainimg">
				</td>
			<%}
		%>
	</tr>	
	<%}
%>
</table>
</body>
</html>