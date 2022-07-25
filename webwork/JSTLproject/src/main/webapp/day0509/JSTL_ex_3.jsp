<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
	<fmt:requestEncoding value="utf-8"/>
	
	<form action="#" method="post">
	<table class="table table-bordered" style="width: 300px">
		<tr>
			<th bgcolor="orange" width="100">이름</th>
			<td>
				<input type="text" name="irum" class="form-control" style="width:120px;">
			</td>
		</tr>
		<tr>
			<th bgcolor="orange" width="100">나이</th>
			<td>
				<input type="text" name="nai" class="form-control" style="width:120px;">
			</td>
		</tr>
		<tr>
			<th bgcolor="orange" width="100">급여</th>
			<td>
				<input type="text" name="pay" class="form-control" style="width:120px;">
			</td>
		</tr>
		<tr>
			<th bgcolor="orange" width="100">가고싶은 나라</th>
			<td>
				<input type="text" name="nara" class="form-control" style="width:120px;">
			</td>
		</tr>
		<tr>
			<td bgcolor="orange" colspan="2" align="center"> 
				<button type="submit" class="btn btn-danger">결과확인</button>
			</td>
		</tr>
		
	</table>
	</form>		
	
	<hr>
	<!-- 이름을 입력했을 경우에만 div가 출력되게 -->
	<c:if test="${!empty param.irum }">	
		<div class="alert alert-info" style="width:400px; font-size: 1.2em;">
			이름: ${param.irum }<br>
			나이: ${param.nai }세(
			<c:if test="${param.nai>=20 }">
				<span style="color: blue;">성인</span>
			</c:if>
			
			<!-- JSTL에는 else 없다 -->
			<c:if test="${param.nai<20 }">
				<span style="color:red;">미성년</span>
			</c:if>
			)<br>
			
			월 급여: <fmt:formatNumber value="${param.pay }" type="currency"/><br>
			나라: ${param.nara }<br>
			
			<b style="padding-left: 20px;">
				<c:choose>
					<c:when test="${param.nara=='프랑스' }">
						에펠탑 보러가기
					</c:when>				
				
					<c:when test="${param.nara=='캐나다' }">
						로키산맥 보러가기
					</c:when>				
			
					<c:when test="${param.nara=='미국' }">
						뉴욕에 쇼핑하러 가기
					</c:when>	
					
					<c:otherwise>
					${param.nara } 는 관심없음
					</c:otherwise>			
				</c:choose>
			</b>
		</div>
	</c:if>
	
</body>
</html>