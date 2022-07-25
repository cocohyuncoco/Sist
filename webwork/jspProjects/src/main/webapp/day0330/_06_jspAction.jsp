<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- include: 이동했다 돌아옴 ..예를 들면 방문횟수 같은거 만들때 사용
		 forward: 이동했다 돌아오지 않는다, 다른 파일로 이동
		 redirect: forwaed는 url주소가 안바뀌고, redirect는 주소가 바뀐다
		 forward 는 request, response가 그대로 전달되고 redirect는 전달 안됨-->
	
	<h2>다른 폴더의 파일 include하기</h2>
	<h4>3번 구구단 예제</h4>
		<jsp:include page="_03_gugu.jsp"/>
		<hr>
	<h4>5번</h4>
		<jsp:include page="_05_imgArrayQuzi.jsp"></jsp:include>
</body>
</html>