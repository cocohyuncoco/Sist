<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	//배열선언
	String[] colors={"green","magenta","yellow","orange","cyan"}; 

	//제목선언
	String title="배열출력";

%>
	
	<table class="table table-bordered" style="width:200px">
		<caption><b><%=title %></b></caption>
		<tr bgcolor="pink">
			<th>번호</th>
			<td>색상</td>
		</tr>
		
		<%
			for(int i=0; i<colors.length; i++){%>
		 	<tr>
		 		<th><%=i+1 %></th>
		 		<td>		 			
		 			<b style="color:<%=colors[i]%>"><%=colors[i]%></b>
		 		</td>
		 	</tr>	
		 		
		<%  	};%>
	</table>
	
	<hr>
	<%
		List<String>list = new ArrayList();
	
		list.add("yellow");
		list.add("red");
		list.add("blue");
		list.add("pink");
		list.add("gray");
		
		for(String a:list){%>
			<div style="width:50px; height:50px; background-color: <%=a%>">
				<%=a%>
			</div>
		
		<%}%>

</body>
</html>