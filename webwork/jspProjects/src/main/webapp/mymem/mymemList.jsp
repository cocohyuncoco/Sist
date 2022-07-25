<%@page import="mymem.MymemDto"%>
<%@page import="java.util.Vector"%>
<%@page import="mymem.MymemDao"%>
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

    *{
       font-family: 'Song Myung', serif;
       font-size:20px;

    }
    
    th{
    	text-align: center;
	    background-color: #5cb85c;
	    color: #fff;
	    font-weight: 300;
    }
</style>
</head>
<body>
<%
	MymemDao dao = new MymemDao();
	Vector<MymemDto> list = dao.getAllDatas();
%>


	<div style="width:1300px; margin: 0 auto;">
	<table class="table table-bordered" style="width:1300px;">
		<caption style="text-align: center"><b>0408 게시판 과제물 리스트 전체출력</b></caption>
		<tr>
			<th width="50">No.</th>
			<th width="100">아이디</th>
			<th width="200">비밀번호</th>
			<th width="200">이름</th>
			<th width="500">연락처</th>
			<th width="300"> 이메일</th>
			<th width="600">가입날짜</th>
			<th width="300">수정/삭제</th>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				MymemDto dto = list.get(i);
				%>
				<tr>
					<td align="center"><%=i+1 %></td>		
					<td align="center"><%=dto.getId() %></td>
					<td align="center"><%=dto.getPass() %></td>
					<td align="center"><%=dto.getName() %></td>
					<td align="center"><%=dto.getHp() %></td>
					<td align="center"><%=dto.getEmail() %></td>
					<td align="center"><%=dto.getGaip() %></td>
					<td align="center">
						<button type="button" class="btn btn-info btn-xs" onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">수정</button>
						<button type="button" class="btn btn-danger btn-xs" onclick="location.href='deleteMymem.jsp?num=<%=dto.getNum()%>'">삭제</button>
					</td>
				</tr>
				
			<%}
		%>
	
	</table>
	
	
	<a href="insertForm.jsp" style="float: right;">
		<button type="button" class="btn btn-info btn-lg">데이터추가</button>
	</a>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>