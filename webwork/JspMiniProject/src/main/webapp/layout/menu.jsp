<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="csstransforms no-csstransforms3d csstransitions"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
   <title>Responsive Drop Down Menu jQuery CSS3 Using Icon Symbol</title>
   <link rel="stylesheet" type="text/css" href="menu/css/font-awesome.css">
   <link rel="stylesheet" type="text/css" href="menu/css/menu.css">
    
   <script type="text/javascript" src="menu/js/jquery.js"></script>
   <script type="text/javascript" src="menu/js/function.js"></script>

</head>
<%
	String loginok = (String)session.getAttribute("loginok");
	String myid = (String)session.getAttribute("idok");
	
%>
<body>

<div id="wrap">
   <header>
      <div class="inner relative">
         <a class="logo" href="http://www.freshdesignweb.com"></a>
         <a id="menu-toggle" class="button dark" href="#"><i class="icon-reorder"></i></a>
         <nav id="navigation">
            <ul id="main-menu">
               <li class="current-menu-item"><a href="index.jsp">Home</a></li>
               <li class="parent">
                  <a href="#">회원관리</a>
                  <ul class="sub-menu">
                     <li><a href="index.jsp?main=member/memberform.jsp"><!-- <i class="icon-wrench"></i> -->회원가입</a></li>
                     <li><a href="index.jsp?main=member/memberlist.jsp"><!-- <i class="icon-credit-card"></i> -->회원목록</a></li>
                     <!-- <li><a href="#"><i class="icon-gift"></i> Icons</a></li>
                     <li>
                        <a class="parent" href="#"><i class="icon-file-alt"></i> Pages</a>
                        <ul class="sub-menu">
                           <li><a href="#">Full Width</a></li>
                           <li><a href="#">Left Sidebar</a></li>
                           <li><a href="#">Right Sidebar</a></li>
                           <li><a href="#">Double Sidebar</a></li>
                        </ul>
                     </li> -->
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
	                	<%
	                		//로그인을 했고 그게 아이디가 admin이여야해 라는 조건문
	                		if(loginok!=null && myid.equals("admin")){%>
	                		<li><a href="index.jsp?main=shop2/addfrom.jsp">상품등록</a></li>		
	                		<li><a href="index.jsp?main=shop2/shoplist.jsp">쇼핑몰</a></li>
	                		<%}else{%>
	                			<li><a href="index.jsp?main=shop2/shoplist.jsp">쇼핑몰</a></li>
	                		<%}
	                	%>	                     	                     
	                </ul>
                </li>
            </ul>
         </nav>
         <div class="clear"></div>
      </div>
   </header>   
</div>    
</body></html>