<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style type="text/css">

	div.login > button{
		float: right;
		}

</style>
</head>

	<!-- 절대경로 가져오기 -->
	<c:set var="root" value="<%=request.getContextPath() %>"/>
	<a href="/">
		<img alt="" src="${root}/image/f4.png" width="100px;" height="100">
		<b>SpringBoot+Mybatis+Tiles</b>
	</a>
	
 <div class="login">
  	<!-- 로그인 안했을때-->
	<c:if test="${sessionScope.loginok==null}">	  
	    <button type="button" class="btn btn-success"
	    style="width: 100px;" onclick="location.href='${root}/login/main'">Login</button>
    </c:if>
    
    <!-- 로그인중 -->
    <c:if test="${sessionScope.loginok!=null}">
    	<b>${sessionScope.myid }님이 로그인중 입니다</b>	  
	    <button type="button" class="btn btn-success"
	    style="width: 100px;" onclick="location.href='${root}/login/logoutprocess'">LogOut</button>
    </c:if>
 </div>

<body>
	
</body>
</html>