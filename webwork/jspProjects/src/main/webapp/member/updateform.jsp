<%@page import="member.memberDto"%>
<%@page import="member.memberDao"%>
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
<%
	String num = request.getParameter("num");
	memberDao dao = new memberDao();
	memberDto dto = dao.getData(num);
%>
<body>

<form action="updateformproc.jsp" method="post" class="form-inline">
	 <table class="table table-bordered" style="width: 350px;">
	 	<caption>멤버 정보 추가</caption>
         <tr>
             <th bgcolor="pink">이름</th>
             <td>
                 <input type="text" name="name" class="form-control" value="<%=dto.getName()%>">
             </td>
         </tr>

         <tr>
            <th bgcolor="pink">연락처</th>
            <td>
                <input type="text" name="hp" class="form-control" value="<%=dto.getHp()%>">
            </td>
        </tr>        

  		<tr>
          
            <td colspan="2" align="center">
            
            	<!-- hidden으로 num을 넘겨준다...위치는 폼안에만 있음됨 -->
            	<input type="hidden" name="num" value="<%=num%>">
           		<input type="submit" value="수정" class="btn btn-info" >
           		<input type="button" value="목록" class="btn btn-danger" onclick="location.href='memberlist.jsp'">
            </td>
        </tr> 
	 </table>
	</form>
</body>
</html>