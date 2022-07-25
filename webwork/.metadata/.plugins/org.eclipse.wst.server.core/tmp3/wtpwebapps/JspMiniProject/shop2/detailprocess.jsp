<%@page import="data.dao.ShopDao"%>
<%@page import="data.dto.CartDto"%>
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

</head>
<body>
<%--<%
	request.setCharacterEncoding("utf-8");

	String shopnum = request.getParameter("shopnum");
	String num = request.getParameter("num");
	int cnt = Integer.parseInt(request.getParameter("cnt"));
	
	CartDto dto = new CartDto();
	dto.setShopnum(shopnum);
	dto.setNum(num);
	dto.setCnt(cnt);
	
	ShopDao dao = new ShopDao();
	dao.insertCart(dto);
	
--%> --%>
	<!-- 자바빈즈 반드시 프라이빗 설정이 되잇어야 사용가능 dao, dto 선언하고 모든 멤버값에 주입 시켜주고 -->
	<jsp:useBean id="dao" class="data.dao.ShopDao"/>
	<jsp:useBean id="dto" class="data.dto.CartDto"/>
	<jsp:setProperty property="*" name="dto"/>
	<%
		dao.insertCart(dto);
	%>
</body>
</html>