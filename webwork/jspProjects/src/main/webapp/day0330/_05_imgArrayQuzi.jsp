<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<!-- 4�� 5���� img ������ �ִ� �̹����� 1~20���� ��Ÿ�� ������ -->

<% 
	int n =1; //�����Ҽ��ִ� ����
%>
	<table class="table table-bordered" style="width: 500px;">
		
	<%
		for(int i=0; i<4; i++){//��%> 
		 <tr height="80px;">
			<%
			  for(int j=0; j<5; j++){ //��
			  %>
				<td>
					<img alt="" src="../img/<%=n%>.png" width="150px;" height="150px;">
				</td>					  
			  <%
			  	n++;
			  }%>				
		 </tr>
		<% }%>
	
	</table>
	
</body>
</html>