<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
div.box{
	float: left;
    width: 15px;  height: 15px;
    margin-left: 6px;
	}
	
	
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("Utf-8");
	
		String sang=request.getParameter("sang");
		String[] scolor =request.getParameterValues("scolor");
		String ssize =request.getParameter("ssize");
		String chuga =request.getParameter("chuga");
		
	%>
	
	<h2>��ǰ���� ����</h2>
	<p>��ǰ�� :<%=sang%></p>
	<div style="width: 50px; display: inline-block;float: left;">���� : </div>
	
		<%if(scolor==null){%>
			<b>������ ����</b>
		<%}else{
			for(int i=0; i<scolor.length; i++){%>
					<div class="box" style="background-color: <%=scolor[i]%>"></div> 
			<% }%>
		<%} %>
	
	
	
	
	<p style="clear: both;">������ : <%=ssize %></p>
	<p>�߰���ǰ :<%=chuga %></p>
	
</body>
</html>