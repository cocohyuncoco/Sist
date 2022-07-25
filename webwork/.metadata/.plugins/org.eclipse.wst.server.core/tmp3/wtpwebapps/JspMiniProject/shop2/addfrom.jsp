<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
</head>
<body>
	<form action="shop2/addaction.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width:600px;">
			<caption><b>상품등록</b></caption>
			<tr>
				<td style="width:150px; background-color: #66cdaa;">
					<b>카테고리</b>
				</td>
				
				<td>
					<select style="width: 200px;" name="category" class="form-control" required="required">
						<option value="뷰티">뷰티</option>
						<option value="패션잡화">패션잡화</option>
						<option value="생활">생활</option>
					</select>
				</td>
			</tr>	
			
			<tr>
				<td style="width:150px; background-color: #66cdaa;">
					<b>상품명</b>					
				</td>
				<td>					
					<input type="text" name="sangpum" style="width:200px;" class="form-control" placeholder="상품명입력" required="required">
				</td>
			</tr>	
			
			<tr>
				<td style="width:150px; background-color: #66cdaa;">
					<b>상품사진</b>					
				</td>
				<td>					
					<input type="file" name="photo" style="width:300px;" class="form-control">
				</td>
			</tr>		
			
			<tr>
				<td style="width:150px; background-color: #66cdaa;">
					<b>상품가격</b>					
				</td>
				<td>					
					<input type="text" name="price" style="width:200px;" class="form-control" placeholder="가격입력" required="required">
				</td>
			</tr>
			
			<tr>
				<td style="width:150px; background-color: #66cdaa;">
					<b>입고일</b>
				</td>
				<td>					
					<%
						//현재날짜
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						String day = sdf.format(new Date());
					%>
					<input type="date" name="ipgoday" value="<%=day%>" required="required" style="width:200px;" class="form-control">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">상품저장</button>
					<button type="button" class="btn btn-info" onclick="location.href='index.jsp?main=shop2/shoplist.jsp'">상품목록</button>
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>