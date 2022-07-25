<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
</head>
<body>

	작성자: ${dto.writer }
	<br>
	작성일: <fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/>
	<br>
	제목: ${dto.subject }
	내용:	<pre>${dto.content }</pre>
	<br><br>
	<button type="button" class="btn btn-success btn-sm" onclick="location.href='writeform'">글쓰기</button>
	<button type="button" class="btn btn-success btn-sm" onclick="location.href='list'">목록</button>
	
	<button type="button" class="btn btn-success btn-sm" onclick="location.href='updateform?num=${dto.num}'">수정</button>
	<button type="button" class="btn btn-success btn-sm" onclick="location.href='delete?num=${dto.num}'">삭제</button>
</body>
</html>