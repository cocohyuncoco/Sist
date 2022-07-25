<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//한글 엔코딩
		request.setCharacterEncoding("Utf-8");
	
		//form 값 받아주기 name 값으로
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String lic = request.getParameter("license");
		
		//하나 값 받는게 아니라 여러개 받을때 (복수일때)
		//String 체크박스[] = request.getParameterValues("체크박스값 4개");
		//String 셀렉트[] = request.getParameterValues("셀렉트");
		//String 라디오[] = request.getParameterValues("라디오");
		
	%>
	
		<h3>결과값 출력</h3>
		<b>이름:<%=name %> </b><br>
		<b>비밀번호:<%=pass %> </b><br>
		<b>운전면허:<%=lic==null?"없음":"있음" %> </b><br>
		
</body>
</html>