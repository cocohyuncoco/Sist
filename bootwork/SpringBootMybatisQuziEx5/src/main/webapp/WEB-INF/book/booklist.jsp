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

p.title{
	font-size: 18px;
    line-height: 30px;
    font-weight: bold;
}
p{
	font-size: 14px;
    font-weight: bold;
}

div.con{
display: flex;
    flex-direction: row;
    flex-wrap: nowrap;
    align-items: center;
    justify-content: center;
    width: 1000px;
    margin: 0 auto;
}
td{
cursor: pointer;
}
</style>
</head>
<body>
		
		
		<button type="button" class="btn btn-info" onclick="location.href='form'">책 추가</button>
		<br>
		<c:if test="${totalCount==0 }">
			<div class="alert alert-info">
				<b>저장된 정보가 없습니다</b>
			</div>
		</c:if>
		<c:if test="${totalCount>0 }">
			<div class="alert alert-info">
				<b>총 ${totalCount} 개의 상품정보가 있습니다</b>
			</div>
		</c:if>
		
		<div class="con">
		
		
		<c:forEach items="${list }" var="a">
		 <table class="table table-bordered" style="width: 200px; margin: 0 auto; margin-bottom: 20px;"> 
		 	<tr>		 		
		 		<td style="background-color: #ffecc5" onclick="location.href='content?num=${a.num}'">
		 			<img alt="" src="photo/${a.bookphoto}" style="width: 200px; height:300px;  border: 1px solid #ccc;">
		 			
		 			<p class="title">${a.bookname  }</p>
		 			<p>저자: ${a.writer }</p>
		 			<p>출판사: ${a.bookcompany }</p>
		 			
		 		</td>
		 	</tr>
		 </table>		
		</c:forEach>
		</div>
</body>
</html>