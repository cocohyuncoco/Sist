<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- include: �̵��ߴ� ���ƿ� ..���� ��� �湮Ƚ�� ������ ���鶧 ���
		 forward: �̵��ߴ� ���ƿ��� �ʴ´�, �ٸ� ���Ϸ� �̵�
		 redirect: forwaed�� url�ּҰ� �ȹٲ��, redirect�� �ּҰ� �ٲ��
		 forward �� request, response�� �״�� ���޵ǰ� redirect�� ���� �ȵ�-->
	
	<h2>�ٸ� ������ ���� include�ϱ�</h2>
	<h4>3�� ������ ����</h4>
		<jsp:include page="_03_gugu.jsp"/>
		<hr>
	<h4>5��</h4>
		<jsp:include page="_05_imgArrayQuzi.jsp"></jsp:include>
</body>
</html>