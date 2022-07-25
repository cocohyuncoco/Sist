<%@page import="data.dto.ShopDto"%>
<%@page import="data.dao.ShopDao"%>
<%@page import="java.text.NumberFormat"%>
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
   /*
        font-family: 'Black Han Sans', sans-serif;
        font-family: 'Nanum Pen Script', cursive;
        font-family: 'Single Day', cursive;
        font-family: 'Song Myung', serif;
        font-family: 'Stylish', sans-serif;
    */
    img.photo{
    	width: 200px; height: 200px;
    	border:1px solid gray;
    	margin-bottom: 10px;
    }
    
    .shoptb tr{
    	height: 280px;
    	font-weight: bold;
    	color: cyan;
    }
</style>
<script type="text/javascript">
	$(function () {
		$("a.godetail").click(function () {
			//태그에 넣어둔 shopnum
			let shopnum = $(this).attr("shopnum");
			//alert(shopnum);
			window.location.href = "index.jsp?main=shop2/detailpage.jsp?shopnum="+shopnum;
		})
	});
</script>
</head>
<%
ShopDao dao = new ShopDao();
List<ShopDto> list = dao.getAllSangpums();
%>
<body>

<div class="container" style="width: 900px;">
	  <h2>쇼핑몰</h2>
	  <ul class="nav nav-tabs">
	    <li class="active"><a data-toggle="tab" href="#home">전체상품</a></li>
	    <li><a data-toggle="tab" href="#menu1">뷰티</a></li>
	    <li><a data-toggle="tab" href="#menu2">패션잡화</a></li>
	    <li><a data-toggle="tab" href="#menu3">생활</a></li>
	  </ul>
	  
  <div class="tab-content">	
	<div class="tab-pane fade in active" id="home">
	  <p>
	    <table class="table table-bordered" style="width: 700px;">
	      <caption><b>전체 상품 목록</b></caption>
	      <tr>
	      <%
	        NumberFormat nf = NumberFormat.getCurrencyInstance();
	        int i=0;
	        for(ShopDto dto:list)
	        {
	           //사진
	           String photo = dto.getPhoto();
	           //할인율 20~50% 난수 발생
	           int sale = (int)(Math.random()*31)+20;
	           %>
	           <td style="width: 200px;">
	             <a shopnum="<%=dto.getShopnum() %>" style="cursor: pointer;" class="godetail">

	               <img alt="" src="shopsave/<%=photo %>" class="photo">
	               <br>
	               <%=dto.getSangpum() %>
	               <br>
	               <b style="color: red; font-size: 1.3em;"><%=sale %>%</b>
	               <span style="float: right;">
	                 <div style="color: gray; font-size: 13pt;">
	                   <%
	                     int price = (int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
	                   %>
	                   <strike><%=nf.format(price) %></strike>
	                 </div>
	                 <div style="color: black; font-size: 16px;">
	                   <%=nf.format(dto.getPrice()) %>
	                 </div>
	               </span>
	             </a>
	           </td>
	           <%
	           if((i+1)%4==0)
	           {%>
	              </tr>
	              <tr>
	           <%}
	           i++;
	      }
	      %>
	     </tr>
	   </table>
	  </p>
	</div>
		
	<div id="menu1" class="tab-pane fade">
	  <p>
	    <table class="table table-bordered" style="width: 700px;">
	      <caption><b>뷰티</b></caption>
	      <tr>
	      <%     
	      int j=0;
	        for(ShopDto dto:list)
	        {
	        	if(dto.getCategory().equals("뷰티")){
	        	
	           //사진
	           String photo = dto.getPhoto();
	           //할인율 20~50% 난수 발생
	           int sale = (int)(Math.random()*31)+20;
	           %>
	           <td style="width: 200px;">
	             <a shopnum="<%=dto.getShopnum() %>" style="cursor: pointer;" class="godetail">
	               <img alt="" src="shopsave/<%=photo %>" class="photo">
	               <br>
	               <%=dto.getSangpum() %>
	               <br>
	               <b style="color: red; font-size: 1.3em;"><%=sale %>%</b>
	               <span style="float: right;">
	                 <div style="color: gray; font-size: 13pt;">
	                   <%
	                     int price = (int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
	                   %>
	                   <strike><%=nf.format(price) %></strike>
	                 </div>
	                 <div style="color: black; font-size: 16px;">
	                   <%=nf.format(dto.getPrice()) %>
	                 </div>
	               </span>
	             </a>
	           </td>
	           <%
	           if((j+1)%4==0)
	           {%>
	              </tr>
	              <tr>
	           <%}
	           j++;}
	      }
	      %>
	     </tr>
	   </table>
	  </p>
	</div>
	
	
	<div id="menu2" class="tab-pane fade">
	  <p>
	    <table class="table table-bordered" style="width: 700px;">
	      <caption><b>패션잡화</b></caption>
	      <tr>
	      <%      
	      int s=0;
	        for(ShopDto dto:list)
	        {
	        	if(dto.getCategory().equals("패션잡화")){
	        	
	           //사진
	           String photo = dto.getPhoto();
	           //할인율 20~50% 난수 발생
	           int sale = (int)(Math.random()*31)+20;
	           %>
	           <td style="width: 200px;">
	             <a shopnum="<%=dto.getShopnum() %>" style="cursor: pointer;" class="godetail">
	               <img alt="" src="shopsave/<%=photo %>" class="photo">
	               <br>
	               <%=dto.getSangpum() %>
	               <br>
	               <b style="color: red; font-size: 1.3em;"><%=sale %>%</b>
	               <span style="float: right;">
	                 <div style="color: gray; font-size: 13pt;">
	                   <%
	                     int price = (int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
	                   %>
	                   <strike><%=nf.format(price) %></strike>
	                 </div>
	                 <div style="color: black; font-size: 16px;">
	                   <%=nf.format(dto.getPrice()) %>
	                 </div>
	               </span>
	             </a>
	           </td>
	           <%
	           if((s+1)%4==0)
	           {%>
	              </tr>
	              <tr>
	           <%}
	           s++;}
	      }
	      %>
	     </tr>
	   </table>
	  </p>
	</div>
	
	<div id="menu3" class="tab-pane fade">
	  <p>
	    <table class="table table-bordered" style="width: 700px;">
	      <caption><b>생활</b></caption>
	      <tr>
	      <%      
	      int a =0;
	        for(ShopDto dto:list)
	        {
	        	if(dto.getCategory().equals("생활")){
	        	
	           //사진
	           String photo = dto.getPhoto();
	           //할인율 20~50% 난수 발생
	           int sale = (int)(Math.random()*31)+20;
	           %>
	           <td style="width: 200px;">
	             <a shopnum="<%=dto.getShopnum() %>" style="cursor: pointer;" class="godetail">
	               <img alt="" src="shopsave/<%=photo %>" class="photo">
	               <br>
	               <%=dto.getSangpum() %>
	               <br>
	               <b style="color: red; font-size: 1.3em;"><%=sale %>%</b>
	               <span style="float: right;">
	                 <div style="color: gray; font-size: 13pt;">
	                   <%
	                     int price = (int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
	                   %>
	                   <strike><%=nf.format(price) %></strike>
	                 </div>
	                 <div style="color: black; font-size: 16px;">
	                   <%=nf.format(dto.getPrice()) %>
	                 </div>
	               </span>
	             </a>
	           </td>
	           <%
	           if((a+1)%4==0)
	           {%>
	              </tr>
	              <tr>
	           <%}
	           a++;}
	      }
	      %>
	     </tr>
	   </table>
	  </p>
	</div>
	

	</div><!-- 탭 div 끝 -->
</div><!-- container 끝 -->
</body>
</html>