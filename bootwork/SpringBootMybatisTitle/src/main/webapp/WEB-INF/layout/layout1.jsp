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
	
body {
	font-size: 1.3em;	
}

div.layout div{
}

div.layout div.title{
	position: absolute;
	width: 1000px;
	top: 10px;
	left: 350px;
	height: 100px;
	text-align: center;
}

div.layout div.menu{
	position: absolute;
	left: 355px;
    top: 200px;
	width: 1000px;
	height: 500px;
}

div.layout div.info{
	position: absolute;
	left: 30px;
	top: 250px;
	width: 200px;
	height: 150px;
	padding: 30px 20px;
}

div.layout div.main{
	position: absolute;
	left: 370px;
	top: 295px;
	width: 1000px;
	height: 500px;
}


</style>
</head>
<body>
	<div class="layout">
		<div class="title">
			<tiles:insertAttribute name="title"/>
		</div>
		<div class="menu">
			<tiles:insertAttribute name="menu"/>
		</div>	
		<div class="main">
			<tiles:insertAttribute name="main"/>
		</div>	
		<div class="info">
			<tiles:insertAttribute name="info"/>
		</div>		
	</div>
</body>
</html>