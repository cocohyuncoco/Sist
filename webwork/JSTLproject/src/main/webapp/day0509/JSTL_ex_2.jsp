
<%@page import="java.util.Date"%>
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

 <!-- JSTL 변수 선언 -->
 <c:set var="name" value="송중기"/>
 <c:set var="age" value="22"/>
 <c:set var="today" value="<%=new Date() %>"/>
 
 <!-- JSTL 변수 출력하는 방법 -->
 <h2>이름: ${name }</h2>
 <h2>나이: ${age }</h2>
 <h2>오늘 날짜: ${today }</h2>
 
 <!-- pattern 이용한 fmt 날짜 형식 -->
 <pre>
 	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm"/>
 	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd a hh:mm"/>
 	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd hh:mm EEE"/>
 	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd hh:mm EEEE"/>
 </pre>
 
 <!-- 숫자 -->
 <c:set var="money" value="3485745000"/>
 <c:set var="num1" value="123.456789"/>
 
 <!-- JSTL 숫자 출력 양식 -->
 <pre>
 	${money }
 	${num1 }
 	
 	<!-- 3자리마다 컴마 -->
 	<fmt:formatNumber value="${money }" type="number"/>
 	<!-- 3자리마다 컴마와 화폐단위 -->
 	<fmt:formatNumber value="${money }" type="currency"/>
 	
 	<!-- pattern -->
 	<fmt:formatNumber value="${num1 }" pattern="0.00"/>
 	<fmt:formatNumber value="1.2" pattern="0.00"/> <!-- 값이 없어도 무조건 0출력 -->
 	<fmt:formatNumber value="1.2" pattern="0.##"/> <!-- 값이 없으면 출력 안함 -->
 </pre>
 
 
</body>
</html>