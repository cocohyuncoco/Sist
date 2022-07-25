<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>twoInclude.jsp include하기</h3>
		<jsp:include page="_07_twoInclude.jsp">
			<jsp:param value="HappyDay!!!" name="msg"/>
			<jsp:param value="../img/1.png" name="imgname"/>
		</jsp:include>
		
		
</body>
</html>