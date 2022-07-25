<%@page import="java.util.Vector"%>
<%@page import="data.dto.AnswerDto"%>
<%@page import="data.dao.AnswerDao"%>
<%@page import="data.dao.MemberDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.GuestDto"%>
<%@page import="data.dao.GuestDao"%>
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
	span.day{
		float:right; 
		font-size: 11pt;
		color: gray;
	}
</style>
<script type="text/javascript">
	$(function () {
		
		//추천누르면 1증가
		$("span.likes").click(function () {
			
			let num = $(this).attr("num");
			let tag = $(this);
			//alert(num);			
			$.ajax({
				
				type:"get",
				dataType:"json",
				url:"guest/ajaxlikechu.jsp",
				data:{"num":num},
				success:function(data){
					//alert(data.chu);
					tag.next().text(data.chu);
					
					//추천 누르면 하트보이게
					tag.next().next().animate({"font-size":"16px"},500,function () {
						//성공한다음엔 어떡할건지 여기씀
						//애니메이션이 끝난후 다시 글꼴 0으로 변경 
						$(this).css("font-size","0px");
					});					
				}
			});			
		});
		
		//댓글부분 무조건 안보이게
		$("div.answer").hide();
		//클릭시 보였다 안보였다
		$("span.anser").click(function () {
			$(this).parent().find("div.answer").toggle();
		});
		
		//댓글삭제 이벤트..ajax으로
		//새로고침..location.reload
		$("span.adel").click(function () {
			
			let idx = $(this).attr("idx");
			//alert(idx);
			
			$.ajax({
				type:"get",
				dataType:"html",
				url:"guest/answerdelete.jsp",
				data:{"idx":idx},
				success: function () {
					
					//성공하면 새로고침
					location.reload();
				}
			});
			
		})
		
	})
</script>
</head>
<%
	//로그인 상태 확인후 입력폼 나타내기
	String loginok = (String)session.getAttribute("loginok");

	//dao선언
	GuestDao dao = new GuestDao();
	
	//페이징 처리에 필요한변수
	int totalCount; //총 글수
	int totalpage; //총 페이지수
	int startPage; //각 블럭의 시작페이지
	int endPage; //각 블럭의 끝페이지
	int start; //각 페이지의 시작번호
	int perpage=3; //한페이지에 보여질 글 갯수
	int perBlock=5; //한 블럭당 보여지는 페이지 갯수
	int currentPage; //★현재페이지★
	
	
	//총갯수
	totalCount = dao.getTotalCount();
	
	//현재 페이지 번호 읽기(단 null일 경우는 1페이지로 설정)
	if(request.getParameter("currentPage")==null)
		currentPage = 1;
	else
		currentPage = Integer.parseInt(request.getParameter("currentPage"));
	
	//총페이지 갯수 구하기
	totalpage=totalCount/perpage+(totalCount%perpage==0?0:1);
	
	//각 블럭의 시작페이지 구하기
	//예: 현재페이지가 3인경우 startpage 1,endpage 5
	//예: 현재페이지가 6인경우 startpage 5,endpage 10
	startPage = (currentPage-1)/perBlock*perBlock+1;
	endPage = startPage+perBlock-1;
	
	//만약 총페이지가 8 -2번째 블럭: 6-10 ..이럴경우는 endpage를 8로 수정되어야함
	if(endPage>totalpage) endPage=totalpage;
	
	//각 페이지에서 불러올 시작번호
	start=(currentPage-1)*perpage;
	
	//각페이지에서 필요한 게시글
	List<GuestDto> list = dao.getList(start, perpage);
			
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
	<%
		//form을 보여줄려고 받은거고
		if(loginok!=null){%>
			<jsp:include page="guestform.jsp"/>
			<hr align="left" width="700">
		<%}
	%>
	
	<!-- <b>방명록 리스트 출력</b> -->
<div>
	<b>총 <%=totalCount %>개의 방명록 글이 있습니다</b>
	<%
		MemberDao mdao = new MemberDao();
		for(GuestDto dto:list){
			//이름얻기__아이디를 알면 이름을 얻어올수있음
			String name = mdao.getName(dto.getMyid());
			%>
			<table class="table table-bordered" style="width:600px;">
				<tr>
					<td>
						<b><span class="glyphicon glyphicon-user"></span><%=name %>(<%=dto.getMyid() %>)</b>
						<%
						//로그인한 아이디
						String myid = (String)session.getAttribute("idok");
						//로그인한 아이디와 글을 쓴 아이디가 같을때만 수정, 삭제되게 한다
						if(loginok!=null && dto.getMyid().equals(myid)){//로그인 중 이라면
						%>
							| <a href="index.jsp?main=guest/updateform.jsp?num=<%=dto.getNum() %>&currentPage=<%=currentPage%>">수정</a>
							| <a href="guest/delete.jsp?num=<%=dto.getNum()%>&currentPage=<%=currentPage%>">삭제</a>
							<!-- 삭제는 인덱스를 안거친다. 인덱스에 안나타나고 넘기고 끝이기때문 -->
						<%}							
						%>
						<span class="day"><%=sdf.format(dto.getWriteday()) %></span>
					</td>
				</tr>
				
				<tr height="120">
					<td>
						<a href="save/<%=dto.getPhotoname()%>" target="_blenk">
							<img alt="" src="save/<%=dto.getPhotoname()%>" align="left" style="max-width:150px; margin-right: 20px;">
						</a>						
						<%=dto.getContent().replace("\n", "<br>") %>
					</td>
				</tr>
				
				<!-- 댓글, 추천 -->
				<tr>
					<td>
						<!-- 댓글 들어갈곳(댓글입력폼) (댓글출력폼)-->
						<%
						//각 방명록에 달린 댓글목록 가져오기
						AnswerDao adao = new AnswerDao();
						List<AnswerDto> alist = adao.getAllAnswer(dto.getNum());						
						%>						
						<span class="anser" style="cursor: pointer;" num="<%=dto.getNum() %>">댓글 <%=alist.size() %></span>
						<span class="likes" style="cursor: pointer;" num="<%=dto.getNum() %>">추천</span>
						<span class="chu"><%=dto.getChu() %></span>						
						<!-- 추천 누르기전엔 size 0 -->
						<span class="glyphicon glyphicon-heart" style="color:red; font-size:0px;"></span>						
												
					<div class="answer">
						<%
						if(loginok!=null){%>
							<div class="answerform">
								<form action="guest/answerinsert.jsp" method="post">
									<!-- hidden -->
									<input type="hidden" name="num" value="<%=dto.getNum()%>">
									<input type="hidden" name="myid" value="<%=myid %>">
									<input type="hidden" name="currentPage" value="<%=currentPage%>">
									<table>
										<tr>
											<td width="480">
												<textarea style="width: 470px; height: 40px;" name="content" required="required"
												class="form-control"></textarea>
											</td>
											<td>
												<button type="submit" class="btn btn-info" style="width:70px; height:40px;">등록</button>
											</td>
										</tr>
									</table>
								</form>										
							</div>
						<%}	%>
						<div class="answerlist" style="background-color:#eee;">
						<table style="width:500px;">
						<%
							for(AnswerDto adto:alist){ //이미 dto, list 있어서 a앞에 붙인거임
						%>
					 <tr>
						<td width="60" align="left">
					  		<span class="glyphicon glyphicon-user" style="font-size:20pt;"></span>
						</td>
						<td>
							<%
							  //댓글 작성자명 얻기
							  String aname = mdao.getName(adto.getMyid());
							%>
							<br>
							<b><%=aname %></b>&nbsp;
							<%
						    //글작성자와 댓글쓴 작성자가 같을경우
							if(dto.getMyid().equals(adto.getMyid())){%>
							<span style="color:gray;">(작성자)</span>													
								<%}	%>
							 <span style="font-size:9pt; color:gray; margin-left:20px;"><%=sdf.format(adto.getWriteday()) %></span>
							<%
							//댓글 삭제는 로그인한 아이디와 같을 경우에만 삭제아이콘 보이게
							if(loginok!=null && adto.getMyid().equals(myid)){%>
						 	 <span class="adel glyphicon glyphicon-remove" idx="<%=adto.getIdx()%>"
						 	 style="cursor: pointer; margin-left: 10px"></span>
					    	<%}	%>							
					    	<br>
					    	<span style="font-size:10pt;"><%=adto.getContent().replace("\n", "<br>")%></span>					
						</td>		
					 </tr>											
					<%}											
					%>
				  </table>
  				</div>
  			  </div>						
			</td>
    	</tr>				
   </table>
 <%}
%>
	
</div>

<!-- 페이징 처리 (이전, 다음 버튼은 페이징5개 넘어야 생김) -->
	<div style="width:600px; text-align: center;">
		<ul class="pagination">
		<%
			//이전
			if(startPage > 1)
			{%>
				<li>
				 	<a href="index.jsp?main=guest/guestlist.jsp?currentPage=<%=startPage-1%>">이전</a>
				</li>
			<%}
			for(int pp=startPage; pp<=endPage; pp++){
				if(pp==currentPage)
				{%>
					<li class="active">
					  <a href="index.jsp?main=guest/guestlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
					</li>
				<%}else{%>
					<li>
					  <a href="index.jsp?main=guest/guestlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
					</li>
				<%}
			}
			//다음버튼
			if(endPage < totalpage){%>
				<li>
					<a href="index.jsp?main=guest/guestlist.jsp?currentPage=<%=endPage+1%>">다음</a>
				</li>
			<%}
		%>
		</ul>
	</div>
<!-- 페이징 처리 끝-->
	
</body>
</html>