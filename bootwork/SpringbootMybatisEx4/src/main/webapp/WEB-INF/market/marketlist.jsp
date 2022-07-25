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
</head>
<body>
		<button type="button" class="btn btn-info" onclick="location.href='form'">상품추가</button>
		
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
		
		<br>
		
		<c:forEach items="${list }" var="a">
		 <table class="table table-bordered" style="width: 500px; margin: 0 auto; margin-bottom: 20px;"> 
		 	<tr>		 		
		 		<td>
		 			<img alt="" src="photo/${a.photoname}" style="max-width: 150px;">
		 			<h4>상품명: ${a.sang }</h4>
		 			<h4>단가: <fmt:formatNumber value="${a.dan }" type="currency"/></h4>
		 			<h4>입고일: <fmt:formatDate value="${a.ipgo }" pattern="yyyy-MM-dd HH:mm"/></h4>
		 			
		 			<button type="button" class="btn btn-success btn-xs"
		 			onclick="location.href='updateform?num=${a.num}'">상품수정</button>
		 			
					<button type="button" class="btn btn-danger btn-xs"
		 			onclick="location.href='delete?num=${a.num}'">상품삭제</button>
		 		</td>
		 	</tr>
		 </table>		
		</c:forEach>
		
</body>
</html>