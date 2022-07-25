<%@page import="java.util.StringTokenizer"%>
<%@page import="mymem.MymemDto"%>
<%@page import="mymem.MymemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Nanum+Pen+Script&family=Single+Day&family=Song+Myung&family=Stylish&display=swap" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>

    table tr th{
    			width: 100px;
    			text-align:center;
    			line-height: 32px !important;
    			background-color:#f7ffd7;}
    			
  	.hp{
   	width: 68px; height: 32px;    
    border: 1px solid #ccc;
    border-radius: 4px;
    box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%);}
    
    .email{
    	width: 103px; height: 32px;    
	    border: 1px solid #ccc;
	    border-radius: 4px;
	    box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%);}
    }
</style>
</head>
<%
	String num = request.getParameter("num");
	
	MymemDao dao = new MymemDao();
	MymemDto dto = dao.getData(num);
%>
<body>
	<form action="updateAction.jsp" method="post" name="mymemFrm">
		<table class="table table-bordered" style="width:350px;">
			<caption style="text-align: center;"> <b style="color:#000">0408게시판 과제물 데이터 수정 form</b> </caption>
			
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id" class="form-control" value="<%=dto.getId()%>">
				</td>				
			</tr>
		
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="text" name="pass" class="form-control" value="<%=dto.getPass()%>">
				</td>				
			</tr>
			
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" class="form-control" value="<%=dto.getName()%>">
				</td>				
			</tr>
			
			<tr>
			<%
			  //-(하이픈)을 구분자로 HP 문자열 분리 : token
			  StringTokenizer st=new StringTokenizer(dto.getHp(),"-");
			        
				String hp1 = st.nextToken();
			    String hp2 = st.nextToken();
			    String hp3 = st.nextToken();
			%>
				<th>핸드폰번호</th>
				<td>
					<select name="hp1" class="hp">
						<%
							String[] strhp={"010","017","019","02"};
						
							for(int i=0; i<strhp.length; i++){
								if(hp1.equals(strhp[i])){
									%>
									<option value="<%=strhp[i]%>" selected="selected"><%=strhp[i]%></option>
								<%}else{%>
									<option value="<%=strhp[i]%>"><%=strhp[i]%></option>
								<%};	
						}%>
					</select>
					<b>-</b>
					<input type="text" name="hp2" size="3" value="<%=hp2 %>" class="hp">
					<b>-</b>
					<input type="text" name="hp3" size="3" value="<%=hp3 %>" class="hp">
				</td>				
			</tr>
			
			
			<tr>
			<%
			  //@을 구분자로 email 문자열 분리 : token
			  StringTokenizer streamil = new StringTokenizer(dto.getEmail(),"@");
			        
				String email1 = streamil.nextToken();
			    String email2 = streamil.nextToken();
			%>
				<th>email</th>
				<td>
					<input type="text" name="email1" placeholder="이메일" class="email" value="<%=email1%>"> 
					<b>@</b>
					<select name="email2" class="email">
						<%
						String[] emails = {"naver.com","nate.com","gamil.com","daum.net"};
						
						for(int i=0; i<emails.length; i++){
							if(email2.equals(emails[i])){
								%>
							<option value="<%=emails[i]%>" selected="selected"><%=emails[i] %></option>		
							<%}else{
								%>
							<option value="<%=emails[i]%>"><%=emails[i] %></option>	
							<%}
							}%>							
					</select>
				</td>				
			</tr>
			
			<tr bgcolor="#f7ffd7">
				<td colspan="2" align="center">
					<input type="hidden" name="num" value="<%=num %>">
				
					<input type="submit" value="데이터 수정" class="btn btn-info">
					<input type="button" value="데이터 목록" onclick="location.href='mymemList.jsp'" class="btn btn-warning">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>