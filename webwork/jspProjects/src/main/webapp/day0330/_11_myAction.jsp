<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//�ѱ� ���ڵ�
		request.setCharacterEncoding("Utf-8");
	
		//form �� �޾��ֱ� name ������
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String lic = request.getParameter("license");
		
		//�ϳ� �� �޴°� �ƴ϶� ������ ������ (�����϶�)
		//String üũ�ڽ�[] = request.getParameterValues("üũ�ڽ��� 4��");
		//String ����Ʈ[] = request.getParameterValues("����Ʈ");
		//String ����[] = request.getParameterValues("����");
		
	%>
	
		<h3>����� ���</h3>
		<b>�̸�:<%=name %> </b><br>
		<b>��й�ȣ:<%=pass %> </b><br>
		<b>��������:<%=lic==null?"����":"����" %> </b><br>
		
</body>
</html>