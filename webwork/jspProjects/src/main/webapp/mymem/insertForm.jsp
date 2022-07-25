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

    table tr th{
    			width: 100px;
    			text-align:center;
    			line-height: 32px !important;
    			background-color:#dfe9ff;}
    			
  	.hp{
   	width: 68px; height: 32px;    
    border: 1px solid #ccc;
    border-radius: 4px;
    box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%);}
    
    .email{
    	width: 103px; height: 32px;    
	    border: 1px solid #ccc;
	    border-radius: 4px;
	    box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%);}
    }
</style>
</head>
<body>
	<form action="insertAction.jsp" method="post" name="mymemFrm">
		<table class="table table-bordered" style="width:350px;">
			<caption style="text-align: center;"> <b style="color:#000">0408게시판 과제물 데이터 추가 form</b> </caption>
			
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id" placeholder="아이디를 입력해주세요" class="form-control">
				</td>		
						
			</tr>
		
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="text" name="pass" placeholder="비밀번호를 입력해주세요" class="form-control">
				</td>				
			</tr>
			
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" placeholder="이름을 입력해주세요" class="form-control">
				</td>				
			</tr>
			
			<tr>
				<th>핸드폰번호</th>
				<td>
					<select name="hp1" class="hp">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
						<option value="02">02</option>
					</select>
					<b>-</b>
					<input type="text" name="hp2" size="3" class="hp">
					<b>-</b>
					<input type="text" name="hp3" size="3" class="hp">
				</td>				
			</tr>
			
			<tr>
				<th>email</th>
				<td>
					<input type="text" name="email1" placeholder="이메일" class="email"> 
					<b>@</b>
					<select name="email2" class="email">
						<option value="naver.com">naver.com</option>
						<option value="nate.com">nate.com</option>
						<option value="gamil.com">gamil.com</option>
						<option value="daum.net">daum.net</option>
					</select>
				</td>				
			</tr>
			
			<tr bgcolor="#dfe9ff">
				<td colspan="2" align="center">
					<input type="submit" value="데이터 추가" class="btn btn-info">
					<input type="button" value="데이터 목록" onclick="location.href='mymemList.jsp'" class="btn btn-warning">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>