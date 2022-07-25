<%@page import="java.util.Vector"%>
<%@page import="org.apache.tomcat.jdbc.pool.Validator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="member.memberDto"%>
<%@page import="member.memberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
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
      table *{ font-family: 'Stylish', sans-serif; font-size:20px;}
</style>
</head>
<body>
	<%
		//db목록 가져오기
		memberDao dao = new memberDao();
		Vector<memberDto> list = dao.getAlldatas();
		
	%>
	
	<b style="font-size:10pt;">
		<a href="form.html"><button type="button" class="btn btn-info">데이터 추가</button></a>
	</b>
	
	<hr>
	
	<table class="table table-bordered" style="width:600px;">
     	<caption><b>member 목록</b></caption>
     	<tr>
     		<th width="60">번호</th>
     		<th width="80">이름</th>
     		<th width="150">연락처</th>
     		<th width="200">날짜</th>
     		<th width="100">수정/삭제</th>
     	</tr>
     	<%
     		for(int i=0; i<list.size(); i++){
     			memberDto dto = list.get(i);
     			%>
     			<tr>
     				<td align="center"><%=i+1 %></td>
     				<td><%=dto.getName() %></td>
     				<td><%=dto.getHp() %></td>
     				<td><%=dto.getSdate() %></td>
     				<td>
     					<button type="button" class="btn btn-info btn-xs" onclick="location.href='updateform.jsp?num=<%=dto.getNum()%>'">수정</button>
     					<button type="button" class="btn btn-danger btn-xs" onclick="location.href='memberdelete.jsp?num=<%=dto.getNum()%>'">삭제</button>
     				</td>
     			</tr>
     		<%}
     	%>
	</table>
		

</body>
</html>