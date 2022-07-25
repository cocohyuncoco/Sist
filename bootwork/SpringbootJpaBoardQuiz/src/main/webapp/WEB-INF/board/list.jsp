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
	onclick="location.href='write'">글 추가</button>
	
	<h4 class="alert alert-success">총 ${count}개의 글이 있습니다</h4>
	 
	 <table class="table table-bordered" style="width: 800px; margin: 0 auto;">
	 	<caption><b>글 정보</b></caption>
	 	
	 	<tr>
	 		<th width="50">글 번호</th>
	 		<th width="50">작성자</th>
	 		<th width="150">제목</th>
	 		<th width="50">작성일</th>
	 	</tr>
	 	<c:forEach var="dto" items="${list }" varStatus="i">
		 	<tr>
		 		<td>${dto.num}  </td>
		 		<td>${dto.writer} </td>		 		
		 		<td><a href="detail?num=${dto.num}">${dto.subject}</a></td>
		 		<td>
		 			<fmt:formatDate value="${dto.writeday}" pattern="yyyy-MM-dd HH:mm"/>
		 		</td>
		 	</tr>
	 	</c:forEach>
	 	
	 </table>
	
</body>
</html>