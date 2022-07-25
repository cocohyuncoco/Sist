<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		request.setCharacterEncoding("Utf-8");
	
		String ctiy=request.getParameter("ctiy");
		String[] ctiy2 =request.getParameterValues("ctiy2");
		
	%>
	
		<h2>근무하고 싶은 도시는?</h2>
		<b>1순위 :[<%=ctiy %>]</b><br>
		<b>2순위:
		<%if(ctiy2==null){%>
			<font color="red">지역선택 안함</font><br>	
		
		<%}else{
			for(int i=0; i<ctiy2.length; i++){%>
				[<%=ctiy2[i] %>]</b>&nbsp;	
		  <%}%>
			
			<b>총<%=ctiy2.length %>개 지역 선택함</b><br>
			
		<%}%>
			
		<a href="_12_selectForm.html">다시 입력</a><br>
		<a href="javascript:history.back()">자바스크립트 뒤로돌아가기</a>

</body>
</html>