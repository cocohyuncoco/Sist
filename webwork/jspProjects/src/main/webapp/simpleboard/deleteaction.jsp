<%@page import="java.io.File"%>
<%@page import="simpleboard.SimpleDao"%>
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
		//num, pass 읽어오기
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		//DB선언
		SimpleDao dao = new SimpleDao();
		
		//여기서받은 num, pass는 deletefrom.jsp에서 받은거
		boolean b = dao.isEqualPass(num, pass);
		
		//b가 참이면 삭제 후 이동
		if(b){
			//게시글 지우기 전에 업로드 이미지 먼저 지우기
			String imgName = dao.getData(num).getImgname();
			//업로드된 경로 구하기
			String uploadPath = getServletContext().getRealPath("/photo");
			
			//1. 파일생성
			File file = new File(uploadPath+"\\"+imgName);
			
			//2. 파일삭제
			if(file.exists())//파일이 존재한다면
				file.delete(); //파일을 삭제
				
			//DB로 부터 삭제 메서드 호출
			dao.deleteBoard(num);
				
			//리스트로 이동
			response.sendRedirect("boardlist.jsp");
		}else{%>
			<script type="text/javascript">
				alert("비밀번호가 틀렸습니다");
				history.back();
			</script>
		<%}
	%>
</body>
</html>