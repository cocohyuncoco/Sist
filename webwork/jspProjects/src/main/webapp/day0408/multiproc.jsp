<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Hi+Melody&family=Nanum+Brush+Script&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	MultipartRequest multi=null;
	
	//톰캣에 업로드된 프로젝트 경로
	ServletContext context=getServletContext();
	
	//realfolder: 프로젝트에 업로드된 실제경로
	String realFolder=context.getRealPath("/upload");
	//System.out.print(realFolder);
	
	//허용할 크기 1024*1024 * 원하는 MB수
	int uploadSize=1024*1024*3;//3MB
	
	try{
	   //사용법 고정 : request,realFolder,업로드 크기,"utf-8",new DefaultFileRenamePolicy()
	   multi=new MultipartRequest(request,realFolder,uploadSize, "utf-8", new DefaultFileRenamePolicy());
	   
	   //입력한 값들 읽어오기
	   String writer=multi.getParameter("writer");
	
	   %>
	   <h2>작성자: <%=writer %></h2>
	   
	   <%
	   //파일타입이 여러개인경우
	   Enumeration formNames=multi.getFileNames();   //file타입만 받을 수 있다
	   
	   //반복문. 더이상 파일네임이 없을때까지 반복
	   while(formNames.hasMoreElements()){
	      //파일태그에서 name얻기
	      String fileName=(String)formNames.nextElement();
	      //System.out.println("fileType name: "+fileName);
	      
	      //실제 업로드된 파일명
	      String uploadFileName=multi.getFilesystemName(fileName);
	      
	      //파일 선택 안했을 경우 거르기
	      if(uploadFileName!=null){
	         %>
	         <img src="../upload/<%= uploadFileName%>" style="max-width: 200px border='1'">
	         <b><%=uploadFileName %></b><br>
	         <%
	      }
	      
	   }
	   
	   
	}catch(Exception e){
	   
	}
	

%>
</body>
</html>