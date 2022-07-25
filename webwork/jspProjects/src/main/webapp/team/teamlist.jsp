
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="team.TeamDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="team.TeamDao"%>

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
    table *{ font-family: 'Single Day', cursive; font-size:18px;}
</style>
</head>
<body>
	<%
		//db목록 가져오기
		TeamDao dao = new TeamDao();
		ArrayList<TeamDto> list = dao.getAllDatas();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	%>
	
	<button type="button" class="btn btn-info" style="width:100px; margin-left:200px;" onclick="location.href='addfrom.html'">팀원 추가</button>
	
	<br>
	
	<table class="table table-bordered" style="width:800px;">
		<caption><b>팀원 정보 출력</b></caption>
		<tr bgcolor="orange">
			<th>번호</th>
			<th>이름</th>
			<th>운전면허</th>
			<th>주소</th>
			<th>작성일</th>
			<th>삭제</th>			
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				TeamDto dto = list.get(i);
				%>
				<tr>
				 <td align="center"><%=i+1 %></td>
				 <td><%=dto.getName() %></td>
				 <td align="center"><%=dto.getDriver() %></td>
				 <td><%=dto.getAddr() %></td>
				 <td align="center"><%=sdf.format(dto.getWriteday()) %></td>
				 <td align="center">
				 	<button type="button" class="btn btn-xs btn-danger" onclick="location.href='teamdelete.jsp?num=<%=dto.getNum()%>'">Delete</button>
				 </td>
				</tr>
			<%}
			%>
	
		
	</table>
</body>
</html>