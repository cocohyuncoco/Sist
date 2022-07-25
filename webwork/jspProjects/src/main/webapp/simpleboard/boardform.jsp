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
<body>
	<form action="boardaction.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width:500px;">
			<tr>
				<th style="width:100px;" bgcolor="#add">작성자</th>
				<td>
					<input type="text" name="writer" class="form-control" placeholder="writer" autofocus="autofocus" required="required" style="width:200px;">
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">제목</th>
				<td>
					<input type="text" name="subject" class="form-control" placeholder="subject" required="required">
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">사진업로드</th>
				<td>
					<input type="file" name="photo" class="form-control" placeholder="photo" required="required" style="width:300px;"
					onchange="readURL(this)">
				</td>
			</tr>
			
			<tr>
				<th style="width:100px;" bgcolor="#add">비밀번호</th>
				<td>
					<input type="password" name="pass" class="form-control" placeholder="pass" required="required" style="width:200px;" pattern="[0-9]{4}"><!-- 0~9까지의 숫자를 4자리만 넣을수있게  -->
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<textarea style="width:500px; height:200px;" class="form-control" name="content" required="required"></textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info btn-md">저장하기</button>
					<button type="button" class="btn btn-danger btn-md" onclick="location.href='boardlist.jsp'">목록보기</button>
					<button type="reset" class="btn btn-warning btn-md" id="reset">초기화</button>
				</td>
			</tr>
			
		</table>	
	</form>
	
	<img id="blah" src="../img/no-image.png" style="max-width:200px;">
	
<script type="text/javascript">
	$(function() {
		$("#reset").click(function () {
			
			$("img#blah").attr("src", "../img/no-image.png");
		});
	})
</script>
</body>
</html>