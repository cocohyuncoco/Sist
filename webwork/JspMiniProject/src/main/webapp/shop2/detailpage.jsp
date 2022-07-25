<%@page import="data.dao.MemberDao"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="data.dto.ShopDto"%>
<%@page import="data.dao.ShopDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

</style>
</head>
<%
	
	//해당상품 하나의 데이터 가져온거
	String shopnum = request.getParameter("shopnum");
	ShopDao dao = new ShopDao();
	ShopDto dto = dao.getData(shopnum);
	
	//금액 달러랑 , 표시
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	//로그인상태체크
	String loginok = (String)session.getAttribute("loginok");
	//로그인한 아이디
	String myid = (String)session.getAttribute("idok");
	
	//아이디에 해당하는 멤버테이블에 시퀀스번호(num)
	MemberDao mdao = new MemberDao();
	String num = mdao.getNum(myid);
%>

<body>
	<form id="frm">
		<input type="hidden" name="shopnum" value="<%=shopnum%>">
		<input type="hidden" name="num" value="<%=num%>">
		
		
		<table class="table table-bordered" style="width:700px;margin: 0 auto;">
		<tr>
			<td rowspan="6" style=" width: 200px;">
				<img src="shopsave/<%=dto.getPhoto() %>" style="width: 200px;height: 100%;">
			</td>
			
			<th width="100" bgcolor="#f1e3de">카테고리</th>			
			<td><%=dto.getCategory() %></td>
		</tr>
		<tr>
			<th width="100" bgcolor="#f1e3de">상품명</th>		
			<td><%=dto.getSangpum() %></td>
		</tr>
		<tr>
			<th width="100" bgcolor="#f1e3de">가격</th>	
			<td><%=nf.format(dto.getPrice()) %>원</td>
		</tr>
		<tr>
			<th width="100" bgcolor="#f1e3de">갯수</th>	
			<td>
				<input type="number" class="form-control" min="1" max="10" value="1" step="1" name="cnt">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center" bgcolor="#f1e3de" style=" vertical-align: inherit;">
				<button type="button" class="btn btn-success" id="btncart">장바구니</button>
				<button type="button" class="btn btn-info" onclick='history.back()'>상품목록</button>
			</td>
		</tr>
	</table>
</form>
	
	
<script type="text/javascript">
	
	//로그인이 안되있다면
	$("#btncart").click(function () {
		
		let login ="<%=loginok%>";
		
		if(login=="null"){
			alert("먼저 로그인을 해주세요");
			return;
		}
		
		//from태그의 모든것 가져오기
		let fromdata =$("#frm").serialize();
		//alert(fromdata);
		
		//장바구니를 누르면 ajax로 처리한다(성공시 alert("성공"), 또는 mycart )
		$.ajax({
			type:"post",
			dataType:"html",
			data:fromdata,
			url:"shop2/detailprocess.jsp",
			success:function(){
				//alert("성공");
				let a = confirm("장바구니에 저장하였습니다\n장바구니로 이동하려면 [확인] 버튼을 눌러주세요");
				if(a){
					location.href="index.jsp?main=shop2/mycart.jsp";
				}
			}
		});
		

	});
	
	
</script>
</body>
</html>