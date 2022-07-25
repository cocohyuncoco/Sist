<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style type="text/css">
	
div.layout div.menu{
	position: absolute;
	left: 300px;
    top: 100px;
	height: 500px;
}


div.layout div.main{
	position: absolute;
	top: 200px; left: 200px;
	
}


</style>
</head>
<body style="background-color: #e0ffff;">
	<div class="layout">
		<div>
			<h1>오시는 길</h1>
		</div>		
		
		<div class="menu">
			<tiles:insertAttribute name="menu"/>
		</div>
		
		<div class="main">
			<tiles:insertAttribute name="main"/>
		</div>
		
	</div>
	
</body>
</html>