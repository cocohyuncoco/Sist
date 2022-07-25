<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.MemberDto"%>
<%@page import="data.dao.MemberDao"%>
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

</head>

<body>
<%
	
	MemberDao dao = new MemberDao();
	List<MemberDto> list = dao.getAllMembers();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	int no =1;
%>
	
	<table class="table table-bordered" style="width:100%;">
		
		<caption><b>전체회원목록</b></caption>
		<tr style="background: #4f342a; color: #fff;">
			<th width="50">번호</th>
			<th width="70">회원명</th>
			<th width="70">아이디</th>
			<th width="150">핸드폰</th>
			<th width="150">주소</th>
			<th width="150">이메일</th>
			<th width="150">가입일</th>
			<th width="100">수정/삭제</th>
		</tr>
		
		<%
			for(MemberDto dto:list){
				%>
				<tr>
					<td><%=no++ %></td>
					<td><%=dto.getName() %></td>
					<td><%=dto.getId() %></td>
					<td><%=dto.getHp() %></td>
					<td><%=dto.getAddr() %></td>
					<td><%=dto.getEmail() %></td>
					<td><%=sdf.format(dto.getGaipday())%></td>
					<td>
						<button type="button" class="btn btn-info btn-xs"
						onclick="location.href='index.jsp?main=member/updatepassform.jsp?num=<%=dto.getNum()%>'">수정</button>
						
						<button type="button" class="btn btn-danger btn-xs" onclick="delfunc(<%=dto.getNum()%>)">삭제</button>
					</td>
				</tr>
			<%}		
		%>		
	</table>


 <!-- Modal -->
  <div class="modal fade" id="memberDelModal" role="dialog">
    <div class="modal-dialog modal-sm">
	    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">삭제확인</h4>
        </div>

        <div class="modal-body"> <!-- 실제 고쳐야하는건 이부분 -->
         <b>삭제 비밀번호 :</b>
	         <input type="password" id="delpass" class="form-control" style="width:120px;">
	         <!-- ★ hidden으로 넘겨야함 ★ -->
	         <input type="hidden" id="delnum" >
	   </div>
	   
	   <div class="modal-footer">
	        <button type="button" class="btn btn-default delbtn" data-dismiss="modal">삭제</button>
	   </div>
</div>
	      
	    </div>
	  </div>
	 <!-- Modal 끝-->
	   
<script type="text/javascript">

//테이블에 있는 삭제버튼 눌렀을시 모델창 오픈 함수
	function delfunc(num) {
		//alert(num); 해당 num이 넘어오는게 맞는지 확인		
		$("#delnum").val(num); //넘어온 num 값을 모델창 안의 버튼에 넘김 
		$("#memberDelModal").modal();		
		
		//삭제확인 이벤트
		$("button.delbtn").click(function () {		
		//num과 pass 읽기
		let num=$("#delnum").val();
		let pass=$("#delpass").val();			
		//삭제파일 호출
		location.href="member/memberdelete.jsp?num="+num+"&pass="+pass;
	});
	}

</script>
</body>
</html>