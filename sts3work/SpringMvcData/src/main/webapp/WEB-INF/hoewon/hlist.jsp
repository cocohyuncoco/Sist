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
	
	<div class="alert alert-info">
		총 ${totalCount }개의 데이터가 있습니다
	</div>
	<br>
	
	<button type="button" class="btn btn-info" onclick="location.href='form'">글쓰기</button>
	<br>
	
	
	<!-- 검색폼 추가 -->
	<div style="width: 800px; text-align: center">
		<form action="list" class="form-inline">
			<select name="title" class="form-control" style="width: 100px">
				<option value="name" ${title=='name'?"selected":"" }>이름</option>
				<option value="addr" ${title=='addr'?"selected":"" }>주소</option>	
				<option value="driver" ${title=='"driver"'?"selected":"" }>운전면허</option>				
			</select>
			<input type="text" name="search" class="form-control" placeholder="검색단어" style="width: 200px"
			value="${search }">
			
			<button type="submit" class="btn btn-success">검색</button>
			
		</form>
	</div>
	
	<br>
	<hr>
	
	<table class="table table-bordered" style="width: 800px"> 
		<tr bgcolor="#ffc">
			<th width="50">번호</th>
			<th width="80">이름</th>
			<th width="100">사진</th>
			<th width="80">운전면허</th>
			<th width="180">주소</th>
			<th width="180">가입일</th>
			<th width="100">편집</th>
		</tr>
		<c:forEach items="${list }" varStatus="i" var="dto">
			<tr>			
				<td align="center">${i.count }</td>
				<td align="center">${dto.name }</td>
				<td>
					<c:if test="${dto.photo!='no' }">
					 	<img src="../photo/${dto.photo}" width="60" height="60" class="img-circle">
					</c:if>
					<c:if test="${dto.photo=='no'}">
						<img src="../photo/1.PNG" width="60" height="60" class="img-circle">
					</c:if>
				</td>
				<td>${dto.driver }</td>
				<td>${dto.addr }</td>
				<td>
					<fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				<td>
					<button type="button" class="btn btn-info btn-xs">수정</button>
					<button type="button" class="btn btn-danger btn-xs">삭제</button>
				</td>
			</tr>
			
		</c:forEach>				
	</table>
	
</body>
</html>