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
	<h2>JSTL 연산자</h2>
	<!-- 증감연산자가 없는데 어떻게 표현할지 -->
	
	<!-- JSTL 변수선언 su1라는 변수에 값 7-->
	<c:set var="su1" value="7"/>
	<c:set var="su2" value="4"/>
	
	<b>두 변수값 출력(su1:${su1},su2:${su2})</b>
	
	<table class="table table-border" style="width:400px;">
		<tr>
			<th width="250">\${su1+su2}</th>
			<td>
				${su1+su2}
			</td>
		</tr>
			
		<tr>
			<th width="250">\${su1-su2}</th>
			<td>
				${su1-su2}
			</td>
		</tr>
		
		<tr>
			<th width="250">\${su1 div su2}</th>
			<td>
				${su1 div su2}
			</td>
		</tr>	
		
		<tr>
			<th width="250">\${su1 / su2}</th>
			<td>
				${su1 / su2}
			</td>
		</tr>	
			
		<tr>
			<th width="250">\${su1%su2}</th>
			<td>
				${su1%su2}
			</td>
		</tr>
		
		<tr>
			<th width="250">\${su1 mod su2}</th>
			<td>
				${su1 mod su2}
			</td>
		</tr>		
		
		<tr>
			<th width="250">su1을 1증가</th>
			<td>
				증가 전 su1: <c:out value="${su1}"/><br>
				<c:set var="su1" value="${su1+1}"/>
				증가 후 su1: ${su1}
			</td>
		</tr>
	</table>
	
	
</body>
</html>