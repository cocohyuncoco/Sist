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
	
	
	<div class="alert alert-success" style="width: 800px;  margin: 0 auto;">
		<b>총 ${totalCount }개의 상품이 있습니다</b>
	</div>
	
	<table class="table table-bordered" style="width: 800px; margin: 0 auto;">
		<caption>
			<span style="float: right;">
				<button type="button" class="btn btn-info" onclick="location.href='ipgoform'">상품추가</button>
			</span>
		</caption>
	
		<c:forEach items="${list }" var="list">
			<tr>
				<td width="400" rowspan="5">
					<img alt="" src="../photo/${list.photoname }" style="width: 100px; height: 100px;">
				</td>
			</tr>	
			<tr>
				<td>
					<b>상품명: ${list.sangpum }</b>
				</td>
			</tr>
			<tr>
				<td>
					<b>단가 <fmt:formatNumber value="${list.price }"/></b>
				</td>
			</tr>
			<tr>
				<td>
					<b>입고일 <fmt:formatDate value="${list.ipgoday }" pattern="yyyy년 MM월 dd일"/></b>
				</td>
			</tr>
			<tr>
				<td>
					<button type="button" class="btn btn-info" onclick="location.href='updateform?num=${list.num}'">수정</button>
					<button type="button" class="btn btn-danger" onclick="location.href='delete?num=${list.num}'">삭제</button>
				</td>
			</tr>
		</c:forEach>	
	</table>

</body>
</html>