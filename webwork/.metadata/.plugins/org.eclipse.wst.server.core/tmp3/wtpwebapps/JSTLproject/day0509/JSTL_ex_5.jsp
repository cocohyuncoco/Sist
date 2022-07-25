<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	List<String> list = new ArrayList();
	list.add("장미");
	list.add("국화");
	list.add("작약");
	list.add("후리지아");
	list.add("다알리아");
	//리퀘스트에 저장 (나중에 이렇게 할 일은 없음. 지금은 테스트)
	//셋으로 저장해야 겟으로 가지고오니까 셋사용
	request.setAttribute("list", list);
	
	//세션에 아이디와 핸드폰 저장
	session.setAttribute("id", "hyun");
	session.setAttribute("hp", "010-1111-2222");
	
%>
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

	<h1>request list출력</h1>
	<c:forEach var="s" items="${requestScope.list }" varStatus="i">
		${i.count }: ${s }<br>
	</c:forEach>

	<h1>request list출력</h1>
	<c:forEach var="s" items="${list }" varStatus="i">
		${i.count }: ${s }<br>
	</c:forEach>

	<h1>세션에 들어있는 아이디와 핸드폰 가져오기</h1>
	아이디: ${sessionScope.id }<br>
	핸드폰: ${sessionScope.hp }<br>
	
	<h1>Token분리해서 출력하기</h1>
	<c:set var="msg" value="red,green,gray,pink,tomato"/>
	<c:forTokens items="${msg }" delims="," varStatus="i" var="s">
		<h4>${i.count }: <b style="color: ${s}">${s }</b></h4>		
	</c:forTokens>

	<h1>Token분리해서 출력하기 index</h1>
	<c:set var="msg" value="red,green,gray,pink,tomato"/>
	<c:forTokens items="${msg }" delims="," varStatus="i" var="s">
		<h4>${i.index }: <b style="color: ${s}">${s }</b></h4>
	</c:forTokens>








</body>
</html>