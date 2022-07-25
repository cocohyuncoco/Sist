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
	String folder = "/save";
	ServletContext context = getServletContext();
	String realFolder = context.getRealPath(folder);
	
	System.out.println("folder: "+realFolder);
	
	int filesize = 1024*1024*5; //5메가 바이트 mb
	
	MultipartRequest multi = null;
	
	
	try{
		multi = new MultipartRequest(request,realFolder,filesize,"UTF-8",new DefaultFileRenamePolicy());
		
		String name = multi.getParameter("name");
		String title = multi.getParameter("title");
		String uploadFilename = multi.getFilesystemName("uploadFile");
		String orginalFileName = multi.getOriginalFileName("uploadFile");
	%>
	
	<table class="table table-bordered" style="width:300px;">
		<tr>
			<th width="100">이름</th>
			<td><%=name %></td>
		</tr>
		
		<tr>
			<th width="100">제목</th>
			<td><%=title %></td>
		</tr>
		
		<tr>
			<th width="100">업로드된 파일명</th>
			<td><img alt="" src="../save/<%=uploadFilename %>">	</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"> 
				 <input type="submit" value="다시 업로드 하기" onclick="location.href='uploadfrom.jsp'">
			</td>
		</tr>
	</table>
	<%
	}catch(Exception e){
		
	} %>
	


</body>
</html>