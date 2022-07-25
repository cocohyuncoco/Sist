<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 기본 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> <!-- 날짜/시간에 관한 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Do+Hyeon&family=Gothic+A1:wght@100;300;500;700;900&family=Gowun+Dodum&family=Gugi&family=Hahmlet:wght@100;300;500;700;900&family=Hi+Melody&family=IBM+Plex+Sans+KR:wght@100;300;500&family=Jua&family=Nanum+Brush+Script&family=Nanum+Gothic:wght@400;700;800&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100;400;700&family=Noto+Serif+KR:wght@200;400;600;900&family=Song+Myung&family=Yeon+Sung&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<span class="alert alert-danger">
  <b>총 ${totalCount } 개의 데이터가 있습니다.</b>
</span>

<br>
<button type="button" class="btn btn-info"
onclick="location.href='writeform'"
style="margin-left: 600px;">글쓰기</button>

<br><br><br>
<table class="table table-bordered" style="width: 700px;">
  <tr style="background-color: orange">
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
  </tr>
  <c:forEach var="dto" items="${list}" varStatus="i">
    <tr>
      <td align="center">${i.count}</td>
      <td>
        <a href="content?num=${dto.num }">${dto.subject}</a>
      </td>
      <td>
        ${dto.writer}
      </td>
      <td>
        <fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd"/>
      </td>
    </tr>
  </c:forEach>
</table>



</body>
</html>