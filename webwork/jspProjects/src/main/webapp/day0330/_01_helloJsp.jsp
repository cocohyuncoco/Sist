<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<h2>JSP�� HTML5������ �ڹ��ڵ带 ����Ҽ� �ִ� ��������̴�</h2>
	<h2>Servlet�� Ȯ���ڰ� java�̸� �ڹ�Ŭ���� ������ html,css,javascript�� ����Ҽ��ִ�</h2>
	<hr>
	<h4>jsp�� �ּ��� 2���� ���</h4>
	<hr>
	
	<!-- �ּ�1: html �⺻�ּ�->�ҽ����⿡�� ���δ� -->
	<%--�ּ�2: jsp�ּ�: �ҽ����⿡���� �Ⱥ��δ� --%>
	
	<%!
		//����
		//��������, �޼����ۼ�..Ŭ���� ����������
		//��ġ���
	%>
		 
	 <h4>java �ڵ带 ������ scriptlet ������ ǥ���� �ڵ�</h4>
	 
	 <%
	 	//��ũ��Ʈ��
	 	//���⼭ �����ϸ� �������� ���
	 	//������ ������ �Ʒ����� ����ؾ� �Ѵ�
	  
	  	int age =20;
	  	String name = "���ƶ�";
	  	
	  	//���尴ü�� out�� �̿��ؼ� �������� ����Ҽ� ������, ������ ���尴ü �Ⱦ�
	  	out.print("�� �̸���"+name+"�̰� ���̴�"+age+"�Դϴ�");
	  %>  
	  
	  <h4>���ڿ��̳� ��������� ǥ������ �̿��ؼ� ����� �����Ѵ�</h4>
	  <b>�̸�: </b><%=name %><br>
	  <b>����: </b><%=age %>��<br>
	  
</body>
</html>