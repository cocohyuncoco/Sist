<%@page import="data.dto.SmartDto"%>
<%@page import="data.dao.SmartDao"%>
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
<%
	String num = request.getParameter("num");
	SmartDao dao = new SmartDao();
	
	//조회수증가
	dao.updateReadCount(num);
	
	//데이터 가져오기
	SmartDto dto = dao.getData(num);

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
<table class="table table-condensed" style="width:650px;">
	<caption> <b>내용보기</b> </caption>
	<tr>
		<td style="width: 500px;">
			<b><%=dto.getSubject() %></b>
		</td>
		<td>
			<span style="color:gray; font-size:9pt;"></span>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<span style="color:gray; font-size:9pt;"><%=dto.getWriter() %></span>
			<br><br>
			<%=dto.getContent().replace("\n", "<br>") %> <!-- pre태그 대신 이렇게 -->
			<br><br>
			
			<%-- 이미지 클릭하면 새창에 원래 사이즈로보기 
			<a href="save/<%=dto.getContent()%>" target="_blank">
				<img alt="" src="../photo/<%=dto.getImgname()%>" style="max-width:200px;">
			</a>
			<br><br>--%>
			
			<b style="color:gray; font-size:9pt;">조회수 <%=dto.getReadcount() %></b>			
		</td>
	</tr>
</table>
	
	<div style="margin-left: 400px;">
		<button type="button" class="btn btn-warning" onclick="location.href='index.jsp?main=board/smartform.jsp'">글쓰기</button>
		<button type="button" class="btn btn-success" onclick="location.href='index.jsp?main=board/boardlist.jsp'">목록</button>
		<button type="button" class="btn btn-info" onclick="location.href='updateform.jsp?num=<%=dto.getNum()%>'">수정</button>
		<button type="button" class="btn btn-danger" onclick="location.href='deletefrom.jsp?num=<%=dto.getNum()%>'">삭제</button>
	</div>	
	
</body>
</html>