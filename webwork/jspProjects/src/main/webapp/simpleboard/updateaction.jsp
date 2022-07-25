<%@page import="simpleboard.SimpleDao"%>
<%@page import="simpleboard.SimpleDto"%>
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
	
	//톰캣 업로드 경로
	String realFolder = getServletContext().getRealPath("/photo");
	System.out.println(realFolder);
	
	//사이즈
	int uploadSize = 1024*1024; //1mb
	
	MultipartRequest multi = null;
	
	try{
		multi = new MultipartRequest(request, realFolder, uploadSize, "utf-8", 
				new DefaultFileRenamePolicy());
		
		//입력값 읽기. 
		String num = multi.getParameter("num"); //수정은 num도 받기		
		String subject = multi.getParameter("subject");
		String content = multi.getParameter("content");
		String pass = multi.getParameter("pass"); //비번이랑 비교할거니까 둔다
		
		//살제 업로드 이미지이름 읽어오기
		String imgname = multi.getFilesystemName("photo"); //from 안에있는 name넣기
		
		//dto에 담기
		SimpleDto dto = new SimpleDto();
		
		dto.setNum(num);
		dto.setSubject(subject);
		dto.setContent(content);
		dto.setPass(pass);
		dto.setImgname(imgname);
	
		//db선언
		SimpleDao dao = new SimpleDao();
		
		//비번 비교한거 db로부터 받기
		//비번이 맞으면 수정후 내용보기로 이동
		//비번이 틀리면 script로 경고
		boolean b = dao.isEqualPass(num, pass);
		
		if(b==true){
			//비번이 맞는 경우에 실행문 -> (수정성공)
			
			//update 메서드 호출 
			dao.updateBorad(dto);
			
			//목록으로 이동 (내용보기로 이동)
			response.sendRedirect("content.jsp?num="+num);
			
		}else{%>
			<script type="text/javascript">
			  alert("비밀번호가 틀렸습니다");
			  history.back();
			</script>
		<%}
		
	}catch(Exception e){
		
	}
%>
</body>
</html>