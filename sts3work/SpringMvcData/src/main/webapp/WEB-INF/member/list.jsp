
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
style="margin-left: 600px;">멤버등록</button>

<br><br><br>
<table class="table table-bordered" style="width: 1000px;">
  <tr style="background-color: pink">
    <th>번호</th>
    <th>이름</th>
    <th>아이디</th>
    <th>번호</th>
    <th>주소</th>
    <th>이메일</th>
    <th>가입일</th>
    <th>수정/삭제</th>
  </tr>
  <c:forEach var="dto" items="${list}" varStatus="i">
    <tr>
      <td align="center">${i.count}</td>
      <td>
      	${dto.name}
      </td>
      <td>
        ${dto.id }
      </td>
      <td>
        ${dto.hp }
      </td>
      <td>
        ${dto.addr }
      </td>
      <td>
        ${dto.email }
      </td>
      <td>
        <fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM-dd"/>
      </td>
      <td>
      	<button type="button" class="btn btn-success btn-sm">수정</button>
      	<button type="button" class="btn btn-danger btn-sm" onclick="location.href='delete?num=${dto.num}'">삭제</button>
      </td>
    </tr>
  </c:forEach>
</table>



</body>
</html>