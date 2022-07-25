<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html class="csstransforms no-csstransforms3d csstransitions">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- menu add-->
<link rel="stylesheet" type="text/css" href="${root}/menu/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="${root}/menu/css/menu.css">
    
<script type="text/javascript" src="${root}/menu/js/jquery.js"></script>
<script type="text/javascript" src="${root}/menu/js/function.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<!-- 절대경로 가져오기 -->
<c:set var="root" value="<%=request.getContextPath() %>"/>



<style type="text/css">




</style>
</head>

<body>
	
	<!-- <ul class="menu">
		<li>
			<a href="${root}/">Home</a>
		</li>
		<li>
			<a href="${root}/ipgo/ipgoform">상품등록</a>
		</li>
		<li>
			<a href="${root}/ipgo/list">상품목록</a>
		</li>
		<li>
			<a href="${root}/">게시판</a>
		</li>
		<li>
			<a href="${root}/">회원가입</a>
		</li>
		<li>
			<a href="${root}/load/map">오시는길</a>
		</li>
	</ul>	-->
	
 	 <ul id="main-menu">
               <li class="current-menu-item"><a href="${root }/">Home</a></li>
               <li class="parent">
                  <a href="#">상품등록</a>
                  <ul class="sub-menu">
                     <li><a href="${root }/member/form"><!-- <i class="icon-wrench"></i> -->회원가입</a></li>
                     <li><a href="${root }/member/mlist"><!-- <i class="icon-credit-card"></i> -->회원목록</a></li>
                     <li><a href="#"><i class="icon-gift"></i> Icons</a></li>
                     <li>
                        <a class="parent" href="#"><i class="icon-file-alt"></i> Pages</a>
                        <ul class="sub-menu">
                           <li><a href="#">Full Width</a></li>
                           <li><a href="#">Left Sidebar</a></li>
                           <li><a href="#">Right Sidebar</a></li>
                           <li><a href="#">Double Sidebar</a></li>
                        </ul>
                     </li> 
                  </ul>
               </li>
               
               <li><a href="index.jsp?main=login/loginform.jsp">로그인</a></li>
                              
               <li class="parent">
                  <a href="#">방명록</a>
                  <ul class="sub-menu">
                     <li><a href="index.jsp?main=guest/guestlist.jsp">회원방명록</a></li>
                     <li><a href="index.jsp?main=board/smartform.jsp">스마트게시판 등록</a></li>
                     <li><a href="index.jsp?main=board/boardlist.jsp">스마트게시판 목록</a></li>
                  </ul>
               </li>
               
               <li>
	               	<a href="">Shop</a>
	                <ul class="sub-menu">
	                	                     	                     
	                </ul>
                </li>
            </ul>
        
</body>
</html>