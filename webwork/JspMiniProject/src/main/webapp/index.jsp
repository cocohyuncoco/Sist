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
<style type="text/css">
	div.layout{  
	   position: absolute;
	}
	
	div.title{
	   width: 100%;
	   height: 100px;
	   line-height: 80px;
	}
	
	div.menu{
	   width: 100%;
	   font-size: 20pt;
	 font-family: 'Song Myung', serif;
	   text-align: center;
	   top: 110px;
	}
	
	div.info{
	     width: 170px;
	    height: 200px;
	    line-height: 10px;
	    font-size: 10px;
	    font-family: 'Song Myung', serif;
	    top: 300px;
	    padding: 20px 10px;	    
	    border-radius: 30px;
	    background: #4f342a12;
	    margin-left: 100px;
	}
	
	div.main{
	   width: 1200px;
	   height: 700px;
	   font-size: 13pt;
	  font-family: 'Song Myung', serif;
	   left: 300px;
	   top: 250px;
	  
	}
	
	a,a:hover{
	   text-decoration: none;
	   color: black;
	}
</style>
</head>
<%
		//프로젝트 절대경로 구하기
		String root=request.getContextPath();
		
		String mainPage="layout/main.jsp"; //기본 페이지
		
		//url을 통해서 main값을 읽어서 메인페이지에 출력한다
		if(request.getParameter("main")!=null) //메인이 있다면
		{
		   mainPage=request.getParameter("main");
		}
%>
<body>
		<div class="layout title">
		  <jsp:include page="layout/title.jsp"/>
		</div>
		
		<div class="layout menu">
		  <jsp:include page="layout/menu.jsp"/>
		</div>
		
		<div class="layout info">
		  <jsp:include page="layout/info.jsp"/>
		</div>
		
		<div class="layout main">
		  <jsp:include page="<%=mainPage %>"/>
		</div>

</body>
</html>