<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_08_twoInclude.jsp">
			<jsp:param value="������" name="name"/>
			<jsp:param value="����� ������ �ֿ뱳������" name="addr"/>
		</jsp:include>
</body>
</html>