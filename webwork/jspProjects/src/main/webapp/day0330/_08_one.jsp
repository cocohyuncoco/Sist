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
			<jsp:param value="임현정" name="name"/>
			<jsp:param value="서울시 강남구 쌍용교육센터" name="addr"/>
		</jsp:include>
</body>
</html>