<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload3" class="form-inline" method="post" enctype="multipart/form-data">
   <table class="table table-bordered" style="width:500px;">
      <caption><b>복습과제물_연락처</b></caption>
      <tr>
         <th bgcolor="orange" width="100">이름</th>
         <td>
            <input type="text" name="name" class="form-control">
         </td>
      </tr>
      <tr>
         <th bgcolor="orange" width="100">업로드</th>
         <td>
            <input type="file" name="photo" class="form-control">
         </td>
      </tr>
      <tr>
         <th bgcolor="orange" width="100">전화번호</th>
         <td>
            <input type="text" name="hp" class="form-control">
         </td>
      </tr>
      <tr>
         <th bgcolor="orange" width="100">주소</th>
         <td>
            <input type="text" name="addr" class="form-control">
         </td>
      </tr>
      
      <tr>
         <td colspan="2" align="center">
            <button type="submit" class="btn btn-info">과제업로드</button>
         </td>
      </tr>
   </table>
</form>

</body>
</html>