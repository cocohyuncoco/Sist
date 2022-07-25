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
	
	<h2>상품구매 내역</h2>
	<p>상품명 :<%=sang%></p>
	<div style="width: 50px; display: inline-block;float: left;">색상 : </div>
	
		<%if(scolor==null){%>
			<b>색상선택 안함</b>
		<%}else{
			for(int i=0; i<scolor.length; i++){%>
					<div class="box" style="background-color: <%=scolor[i]%>"></div> 
			<% }%>
		<%} %>
	
	
	
	
	<p style="clear: both;">사이즈 : <%=ssize %></p>
	<p>추가상품 :<%=chuga %></p>
	
</body>
</html>