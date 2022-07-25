<%@page import="data.dto.ShopDto"%>
<%@page import="data.dao.ShopDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	<%
	
		request.setCharacterEncoding("utf-8");
	
		String realFolder = getServletContext().getRealPath("/shopsave");
		System.out.print(realFolder);
		
		int uploadSize = 1024*1024*2; 
		
		MultipartRequest multi = null;
		
		try{
			multi = new MultipartRequest(request, realFolder, uploadSize, "utf-8",
					new DefaultFileRenamePolicy());
			
			String category = multi.getParameter("category");
			String sangpum = multi.getParameter("sangpum");
			String photo = multi.getParameter("photo");
			int price = Integer.parseInt(multi.getParameter("price"));
			String ipgoday = multi.getParameter("ipgoday");
			
			String imgname = multi.getFilesystemName("photo");
			
			ShopDto dto = new ShopDto();
			
			dto.setCategory(category);
			dto.setSangpum(sangpum);
			dto.setPhoto(imgname);
			dto.setPrice(price);
			dto.setIpgoday(ipgoday);
			
			ShopDao dao = new ShopDao();
			
			dao.insertShop(dto);
			
			response.sendRedirect("../index.jsp?main=shop2/addfrom.jsp");
		}catch(Exception e){
			
		}
	%>
</body>
</html>