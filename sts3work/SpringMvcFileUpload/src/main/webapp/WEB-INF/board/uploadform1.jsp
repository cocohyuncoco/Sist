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
<form action="upload1" class="form-inline" method="post" enctype="multipart/form-data">
   <table class="table table-bordered" style="width:300px;">
      <caption><b>스프링 업로드 - 파일 1개</b></caption>
      <tr>
         <th bgcolor="orange" width="100">제목</th>
         <td>
            <input type="text" name="title" class="form-control" style="width: 150px;">
         </td>
      </tr>
      <tr>
         <th bgcolor="orange" width="100">업로드</th>
         <td>
            <input type="file" name="photo" class="form-control" style="width: 150px;">
         </td>
      </tr>
      <tr>
         <td colspan="2" align="center">
            <button type="submit" class="btn btn-info">업로드 1</button>
         </td>
      </tr>
      
      
      
   </table>
</form>

</body>
</html>