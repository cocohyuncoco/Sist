
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<fmt:requestEncoding value="utf-8"/>
	<form action="JSTL_ex_6.jsp" method="post">
		이름: <input type="text" name="name" size="10">
		나이: <input type="text" name="age" size="6">
		핸드폰: <input type="text" name="hp" size="18">
		주소: <input type="text" name="addr" size="18">
		
		<input type="submit" value="서버전송">
		
		<!-- dto 선언과 마찬가지 -->
		<jsp:useBean id="dto" class="data.member.MemberDto"/>
		<jsp:setProperty property="*" name="dto"/>
		
		<pre>
		이름: ${dto.name }
		나이: ${dto.age }
		핸드폰: ${dto.hp }
		주소: ${dto.addr }
		</pre>		
	</form>
	
</body>
</html>