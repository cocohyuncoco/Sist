<%@page import="sinsang.sinsangDto"%>
<%@page import="java.util.Vector"%>
<%@page import="sinsang.sinsangDao"%>
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
</style>
</head>
<body>
	<%
		//여기선 출력과 동시에 처리
		sinsangDao db = new sinsangDao();
		Vector<sinsangDto> list = db.getAllDatas();
	
	
	%>
	<a href="insertform.jsp"><button type="button" class="btn btn-success">데이터추가</button>	</a>
	
	<table class="table table-bordered" style="width:700px;">
		<caption><b>신상정보</b></caption>
		<tr>
			<th width="50">No.</th>
			<th width="100">이름</th>
			<th width="200">연락처</th>
			<th width="80">혈액형</th>
			<th width="200">생년월일</th>
			<th width="200">편집</th>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				sinsangDto dto = list.get(i);
				%>
				<tr>
					<td align="center"><%=i+1 %></td>
					<td align="center"><%=dto.getName() %></td>
					<td align="center"><%=dto.getHp() %></td>
					<td align="center"><%=dto.getBlood() %></td>
					<td align="center"><%=dto.getBirth() %></td>
					<td align="center">
						<button type="button" class="btn btn-info btn-xs" onclick="location.href='updatefrom.jsp?num=<%=dto.getNum()%>'">수정</button>
						<button type="button" class="btn btn-danger btn-xs" onclick="location.href='passfrom.jsp?num=<%=dto.getNum()%>'">삭제</button>
						<!-- 원레 delete만잇엇는데 지금은 pass를 하나 더 거친거다 -->
						
					</td>
				</tr>
				
			<%}
		%>
	</table>
	
	
</body>
</html>