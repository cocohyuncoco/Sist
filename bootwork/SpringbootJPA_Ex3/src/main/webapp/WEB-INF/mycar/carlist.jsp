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
	
	<button type="button" class="btn btn-danger" style="margin: 50px 20px;"
	onclick="location.href='carform'">차 정보추가</button>
	
	<h4 class="alert alert-success">총 ${count}개의 자동차 정보가 있습니다</h4>
	 
	 <table class="table table-bordered" style="width: 800px; margin: 0 auto;">
	 	<caption><b>차 정보</b></caption>
	 	
	 	<tr>
	 		<th width="50">번호</th>
	 		<th width="150">자동차명</th>
	 		<th width="80">색상</th>
	 		<th width="150">단가</th>
	 		<th width="200">구입일</th>
	 		<th width="200">등록일</th>
	 		<th width="150">편집</th>
	 	</tr>
	 	<c:forEach var="dto" items="${list }" varStatus="i">
		 	<tr>
		 		<td>${i.count }</td>
		 		<td>${dto.carname }</td>
		 		<td bgcolor="${dto.carcolor }"></td>
		 		<td><fmt:formatNumber value="${dto.price }" type="currency"/></td>
		 		<td>		 		
			 		<fmt:parseDate value='${dto.carguip}' pattern="yyyy-MM-dd" var='carguip'/>
					<fmt:formatDate value="${carguip}" pattern="yyyy-MM-dd"/>
				</td>
		 		<td>
		 			<fmt:formatDate value="${dto.guipday}" pattern="yyyy-MM-dd HH:mm"/>
		 		</td>
		 		<td>
		 			<button type="button" class="btn btn-info btn-xs" onclick="location.href='updateform?num=${dto.num}'">수정</button>
		 			<button type="button" class="btn btn-danger btn-xs"onclick="location.href='delete?num=${dto.num}'">삭제</button>
		 		</td>
		 	</tr>
	 	</c:forEach>
	 	
	 </table>
	
</body>
</html>