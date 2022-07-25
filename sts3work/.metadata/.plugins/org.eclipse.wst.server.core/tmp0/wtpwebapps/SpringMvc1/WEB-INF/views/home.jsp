<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<h2>${msg }</h2>
		<h3>
			<fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm"/>
		</h3>
		
		<h2>맵핑 주소 연습</h2>
		
		<ul>
			<li><a href="apple/list">apple/list</a></li>
			<li><a href="apple/list.do">apple/list.do</a></li> <!-- do붙이는건 예전방식. 보안때문에 겹치는게 많았음 -->
			<li><a href="apple/list.nhn">apple/list.nhn</a></li>	
			<li><a href="banana/insert">banana/insert</a></li>
			<li><a href="orange/delete">orange/delete</a></li>
		
		</ul>
		
		<h2>이미지 출력 연습</h2>
		<ul>
			<li><a href="shop/detail">resources의 이미지 출력</a></li>
			<li><a href="board/add/data">과제 이미지 출력_result5에 출력</a></li>
		</ul>


</body>
</html>