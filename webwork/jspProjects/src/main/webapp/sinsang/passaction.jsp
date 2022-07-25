<%@page import="sinsang.sinsangDao"%>
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
   /*
        font-family: 'Black Han Sans', sans-serif;
        font-family: 'Nanum Pen Script', cursive;
        font-family: 'Single Day', cursive;
        font-family: 'Song Myung', serif;
        font-family: 'Stylish', sans-serif;
    */
</style>
</head>
<body>

	<!-- 비밀번호가 무조건 a1234면 삭제되게 가정 (지금 DB엔 비밀번호가 없기떄문에) -->
	
	<%
		String pass = request.getParameter("pass");
		String num = request.getParameter("num");
		
		//비밀번호 확인후 맞으면 ssdelete.jsp로 이동
		//틀리면 이전화면으로 이동 (history.back)
		
		//equals -> 같다
		if(pass.equals("a1234")){
			//삭제시 필요한 num값 도 전달해야한다
			//response.sendRedirect("ssdelete.jsp?num="+num);
			sinsangDao dao = new sinsangDao();
			dao.deletesinsang(num);
			//목록으로 이동
			response.sendRedirect("ssdelete.jsp");
		}else{%>
			<script type="text/javascript">
				/* ★자주씀★ 비밀번호 확인 로직*/
				alert("비밀번호가 맞지 않습니다");
				history.back();
			</script>
		<% }
		
	%>

</body>
</html>