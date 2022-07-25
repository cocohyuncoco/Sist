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

<h2>forEach문, forTokens문</h2>

<c:forEach var="a" begin="1" end="10">
	[ ${a} ]&nbsp;
</c:forEach>
<br>
<c:forEach var="a" begin="1" end="20" step="2">
	[ ${a} ]&nbsp;
</c:forEach>

<%
	String [] mycolor={"red","pink","orange","magenta","gray","yellow","cyan"};
%>

<c:set var="mycolor" value="<%=mycolor %>"/>

	<table class="table table-bordered" style="width:300px;">
		<caption><b>전체출력</b></caption>
		<tr>
			<th>index</th> <th>count</th> <th>color</th> 
		</tr>
		
						<!-- 리스트가 받아올 배열명 --><!-- 상태용 변수 인덱스냐 카운트냐-->
		<c:forEach var="a" items="${mycolor }" varStatus="i">
			<tr align="center">
				<td>${i.index }</td>
				<td>${i.count }</td>
				<td bgcolor="${a }">${a }</td>
			</tr>
		</c:forEach>		
	</table>

	<table class="table table-bordered" style="width:300px;">
		<caption><b>전체출력</b></caption>
		<tr>
			<th>index</th> <th>count</th> <th>color</th> 
		</tr>
		
						<!-- 리스트가 받아올 배열명 --><!-- 상태용 변수 인덱스냐 카운트냐-->
		<c:forEach var="a" items="${mycolor }" begin="2" end="5" varStatus="i">
			<tr align="center">
				<td>${i.index }</td>
				<td>${i.count }</td>
				<td bgcolor="${a }">${a }</td>
			</tr>
		</c:forEach>		
	</table>

	<hr>
	
<!-- 토큰 사용 -->
<c:set var="msg" value="장미,국화,작약,후리지아,다알리아"/>
	
	${msg }<br>
	
	<h2>msg값을 컴마로 분리해서 출력하기</h2>
	<c:forTokens items="${msg }" delims="," varStatus="i" var="s">
		<h3> ${i.count}: ${s } </h3>
	</c:forTokens>

</body>
</html>