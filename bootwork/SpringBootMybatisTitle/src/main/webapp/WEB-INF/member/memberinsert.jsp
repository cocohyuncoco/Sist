<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Hi+Melody&family=Nanum+Brush+Script&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style type="text/css">
body{font-size: 1.5em; font-family: 'Gamja Flower'; text-align: left;}
</style>
<script type="text/javascript">

$(function () {
	
	// 메일 select
	$("#selemail").change(function () {
		
		if ($(this).val()=='_') {
			$("#email2").val(''); 
		}else {
			$("#email2").val($(this).val());
		}
		
	});
	
	// id 중복체크
	$("#idcheck").click(function () {
		var id = $('#id').val();
		
		$.ajax({
			type: "get",
			dataType: "json",
			url: "idcheck",
			data: {"id",id},
			success: function (data) {
				if(data.count==0){
					alert("가입 가능한 아이디 입니다");
				}else {
					alert("이미 있는 아이디 입니다");
					$("#id").val("");
					$("#id").focus();
				}
			}
			
		});

	});
	
});

</script>
<title>Insert title here</title>
</head>
<body>

<button type="button" class="btn btn-info"
onclick="location.href='list'" style="margin-left: 600px;">전체회원확인</button>

<form action="insert" method="post" class="form-inline">
  <table class="table table-bordered" style="width: 700px; margin-left: 100px;">
    <caption><b>회원가입</b></caption>
      <tr>
        <th width="100" bgcolor="#aaa">아이디</th>
          <td>
            <input type="text" name="id" id="id" class="form-control" required="required"  style="width: 120px;">
            <button type="button" class="btn btn-danger btn-sm" id="idcheck">아이디체크</button>
          </td>
      </tr>
      
      <tr>
        <th width="100" bgcolor="#aaa">비밀번호</th>
          <td>
            <input type="password" name="pass" class="form-control" required="required" style="width: 120px;"
            placeholder="비밀번호">
            <input type="password" name="pass2" class="form-control" required="required" style="width: 120px;"
            placeholder="비밀번호 확인">
          </td>
      </tr>
      
      <tr>
        <th width="100" bgcolor="#aaa">이름</th>
          <td>
            <input type="text" name="name" class="form-control" required="required" style="width: 120px;"
            placeholder="이름입력">
            
          </td>
      </tr>
      
      <tr>
        <th width="100" bgcolor="#aaa">핸드폰</th>
          <td>
            <input type="text" name="hp" class="form-control" required="required" style="width: 200px;"
            placeholder="010-***-****">
            
          </td>
      </tr>
      
      <tr>
        <th width="100" bgcolor="#aaa">주소</th>
          <td>
            <input type="text" name="addr" class="form-control" required="required" style="width: 400px;">
            
          </td>
      </tr>
      
      <tr>
        <th width="100" bgcolor="#aaa">이메일</th>
          <td>
            <input type="text" name="email1" class="form-control" required="required" style="width: 80px;">
            <b>@</b>
            <input type="text" name="email2" id="email2" class="form-control" required="required" style="width: 150px;">
            <select id="selemail" class="form-control">
              <option value="_">직접입력</option>
              <option value="naver.com">네이버</option>
              <option value="gmail.com">구글</option>
              <option value="daum.net">다음</option>
              <option value="nate.com">네이트</option>
            </select>
          </td>
      </tr>
      
      <tr>
        <td align="center" colspan="2" bgcolor="#aaa">
          <button type="submit" class="btn btn-default">저장하기</button>
          <button type="reset" class="btn btn-default">다시하기</button>
        </td>
      </tr>
  </table>
</form>
</body>
</html>