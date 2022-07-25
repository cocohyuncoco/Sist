<%@page import="java.util.StringTokenizer"%>
<%@page import="sinsang.sinsangDto"%>
<%@page import="sinsang.sinsangDao"%>
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
   /*
        font-family: 'Black Han Sans', sans-serif;
        font-family: 'Nanum Pen Script', cursive;
        font-family: 'Single Day', cursive;
        font-family: 'Song Myung', serif;
        font-family: 'Stylish', sans-serif;
    */
</style>
<script type="text/javascript">

	$(function () {
	
		
	
		
	});
	//번호 input에 4자리 다 쓰면 넘어가게
	function goFocus(hp) {
		if (hp.value.length==4) {//만약 hp의 길이가 4면
			frm.hp3.focus(); //frm안에있는 hp3(유일한 name값)로 포커스 이동
			
		}
	};
</script>
</head>
<%
	

	String num = request.getParameter("num");
	
	sinsangDao dao = new sinsangDao();
	sinsangDto dto = dao.getData(num);
	
	
%>
<body>
<form action="updateaction.jsp" method="post" name="frm" >
			<table class="table table-bordered" style="width:350px;">
				<caption><b>개인신상명세(수정)</b></caption>
				<tr>
					<th width="100">이름</th>
					<td>
						<input type="text" name="name" size="8" required="required" value="<%=dto.getName()%>"> 
					</td>
				</tr>

				<tr>
					<th>혈액형</th>
					<td>
						<select size="1" name="blood">
						<%
							String []str = {"A형","B형","O형","AB형"};
						
							for(int i=0; i<str.length; i++)
							{
								if(dto.getBlood().equalsIgnoreCase(str[i]))
								{%>
									<option value="<%=str[i]%>" selected="selected" required="required"><%=str[i] %></option>
								<%}else
									{%>
										<option value="<%=str[i]%>"><%=str[i] %></option>
									<%}
							}
							%>
						</select> 
					</td>
				</tr>
				
				<tr>
					<%
					  //-(하이픈)을 구분자로 HP 문자열 분리 : token
			            StringTokenizer st=new StringTokenizer(dto.getHp(),"-");
			        
						String hp1=st.nextToken();
			            String hp2=st.nextToken();
			            String hp3=st.nextToken();
					%>
					<th width="100">핸드폰</th>
					<td>
						<select name="hp1">
						<%
							String[] strhp={"010","017","019","02"};
						
							for(int i=0; i<strhp.length; i++){
								if(hp1.equals(strhp[i])){
									%>
									<option value="<%=strhp[i]%>" selected="selected" required="required"><%=strhp[i]%></option>
								<%}else{%>
									<option value="<%=strhp[i]%>" required="required"><%=strhp[i]%></option>
								<%};	
						}%>
						</select> 
						<b>-</b>
						<input type="text" name="hp2" size="3" onkeyup="goFocus(this)" value="<%=hp2 %>" required="required">
						<b>-</b>
						<input type="text" name="hp3" size="3" onkeyup="goFocus(this)" value="<%=hp3 %>" required="required">
					</td>
				</tr>	
				
				<tr>
					<th>생년월일</th>
					<td>
						<input type="date" name="birth" value="<%=dto.getBirth()%>" required="required">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"> 
					<input type="hidden" name="num" value="<%=num%>">
						<input type="submit" value="DB수정">
						<input type="button" value="목록" onclick="location.href='sslist.jsp'">
					</td>
				</tr>	
			</table>
			
		</form>
</body>
</html>