<%@page import="simpleboard.SimpleDao"%>
<%@page import="simpleboard.SimpleDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>simpleboard 수정</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
  
  #blah{
  	position: absolute;
  	left:600px;
  	top: 100px;
  	border:1px solid #ccc;
  }
</style>
<script>
	
	function readURL(input) {
	if (input.files && input.files[0]) {
	var reader = new FileReader();
	
	reader.onload = function (e) {
		$("#blah").attr('src', e.target.result);
	};
	reader.readAsDataURL(input.files[0]);
	}
	}

</script>
</head>
<%
	String num = request.getParameter("num");
	SimpleDao dao = new SimpleDao();
	SimpleDto dto = dao.getData(num);

%>
<body>
	<form action="updateaction.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width:500px;">
			<tr>
				<th style="width:100px;" bgcolor="#add">작성자</th>
				<td>
					<b><%=dto.getWriter() %></b>
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">제목수정</th>
				<td>
					<input type="text" name="subject" class="form-control" value="<%=dto.getSubject()%>">
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">사진업로드</th>
				<td>
					<input type="file" name="photo" class="form-control" placeholder="photo" style="width:300px;"
					onchange="readURL(this)" required="required">
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">비밀번호</th>
				<td>
					<input type="password" name="pass" class="form-control" style="width:200px;" pattern="[0-9]{4}" value="<%=dto.getPass()%>"><!-- 0~9까지의 숫자를 4자리만 넣을수있게  -->
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<textarea style="width:500px; height:200px;" class="form-control" name="content"><%=dto.getContent() %></textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					
					<input type="hidden" name="num" value="<%=num %>">
					
					<button type="submit" class="btn btn-info btn-md">수정하기</button>
					<button type="button" class="btn btn-danger btn-md" onclick="history.back()">이전으로</button>
				</td>
			</tr>
			
		</table>	
	</form>
	
	<img id="blah" src="../img/no-image.png" style="max-width:200px;">
</body>
</html>