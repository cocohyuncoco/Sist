<%@page import="data.dao.ShopDao"%>
<%@page import="data.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
	
	div.con{display: flex;
    flex-direction: row;
    justify-content: center;
    align-content: center;
    flex-wrap: nowrap;
    align-items: center;
}
a.testlogo{width: 40%;
    line-height: 100px;
    align-content: center;
    padding: 25px;}
    
    
    div.cart{
    	float: right;
    	cursor: pointer;
    }
    span.carticon{
    	font-size:30px;
    }
    
    div.count{
    	float: right;
	    background-color: #4f342a;
	    color: #fff;
	    width: 30px;
	    height: 30px;
	    border-radius: 100px;
	    text-align: center;
	    line-height: 26px;
	    font-size: 18px;
    }
</style>
<script type="text/javascript">
	$(function () {
		
		$("div.cart").click(function () {
			location.href="index.jsp?main=shop2/mycart.jsp";
		});
	});
</script>
</head>
<%
	String root = request.getContextPath();
	//System.out.print(root);
	
	String loginok=(String)session.getAttribute("loginok");
	String myid=(String)session.getAttribute("idok");
	MemberDao dao=new MemberDao();
	String name=dao.getName(myid);
			
	//shopDao선언
	ShopDao sdao = new ShopDao();
	
	//카트갯수 얻어오기
	int cartSize = sdao.getCartList(myid).size();
	
%>
<body>
<%-- <img alt="" src="<%=root %>/image/1.jpg"> 
			<svg xmlns="http://www.w3.org/2000/svg"></svg>--%>
		
<div class="con">	
	<!-- 절대경로로 로고이미지	 -->
	<a href="<%=root %>" class="testlogo"> <img alt="logo" src="<%=root %>/image/testlogo.svg"> </a>
	
	<div style="float: right; padding-right: 100px;">		
		<% 
		if(loginok==null)
			{%>
			   <button type="button" class="btn btn-success"
			   onclick="location.href='index.jsp?main=login/loginform.jsp'">Login</button>
			<%}else{%>
			   <b style="font-size: 12pt;"><%= name %>님 환영합니다</b>
			   <button type="button" class="btn btn-danger"
			   onclick="location.href='login/logoutaction.jsp'">Logout</button>
			   
			   <div class="cart">
			   	 	<span class="glyphicon glyphicon-shopping-cart carticon">
						<div class="count"><%=cartSize %></div>			   	 	
			   	 	</span>			   	 	
			   </div>
			<%}
		%>
</div>

</div>
</body>
</html>