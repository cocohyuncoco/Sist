<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simpleboard.SimpleDto"%>
<%@page import="simpleboard.SimpleDao"%>
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
	SimpleDao dao = new SimpleDao();
	//List<SimpleDto> list = dao.getAllDatas();
	
	//페이징 처리에 필요한변수
	int totalCount; //총 글수
	int totalpage; //총 페이지수
	int startPage; //각 블럭의 시작페이지
	int endPage; //각 블럭의 끝페이지
	int start; //각 페이지의 시작번호
	int perpage=5; //한페이지에 보여질 글 갯수
	int perBlock=5; //한 블럭당 보여지는 페이지 갯수
	int currentPage; //★현재페이지★
	
	int no;
	
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
	if(endPage>totalpage)
		endPage=totalpage;
	
	//각 페이지에서 불러올 시작번호
	start=(currentPage-1)*perpage;
	
	//각페이지에서 필요한 게시글
	List<SimpleDto> list = dao.getList(start, perpage);
	
	//각 글앞에 붙일 시작번호 구하기
	//총 글이 20개면? 1페이지 20 2페이지 15부터 출력해서 1씩 감소
	no = totalCount-(currentPage-1)*perpage;		
			
%>

<div class="container">
	<div class="alert alert-info" style="width:800px;">
		<%-- <b>총 <%=list.size() %>개의 글이 있습니다</b> --%>
		<b>총 <%=totalCount %>개의 글이 있습니다</b>
	</div>
	
	<br>
	
	<table class="talbe table-bordered" style="width:800px">
		<caption><b>게시판 목록 출력</b>
			<button type="button" class="btn btn-success btn-sm" onclick="location.href='boardform.jsp'" style="margin-left:600px;">글쓰기</button>
		</caption>
		<tr style="background-color: #ffc0cd; height: 40px;">
			<th style="width:70px">번호</th>
			<th style="width:400px">제목</th>
			<th style="width:100px">작성자</th>
			<th style="width:120px">작성일</th>
			<th style="width:70px">조회수</th>
		</tr>
		<%
			//출력할 날짜 형식
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			for(SimpleDto dto:list){//list.size()는 백터로 알아서 쓸수있는 for문 <int i=0; i<list.size(); i++>. 모르면 포이치로 대체 
				%>
				<tr style="height: 50px;">
					<!-- 번호 -->
					<td align="center"><%=no-- %></td>
					
					<!-- 제목..내용보기로 연결 | num값 물고 들어가기 ★ -->
					<td>
						<a href="content.jsp?num=<%=dto.getNum()%>">
							<img alt="" src="../photo/<%=dto.getImgname()%>" style="width: 30px; height: 30px;">
							<%=dto.getSubject() %>
						</a>
					</td>
					
					<!-- 작성자 -->
					<td><%=dto.getWriter() %></td>
					
					<!-- 작성일 -->
					<td><%=sdf.format(dto.getWriteday()) %></td>
					
					<!-- 조회수 -->
					<td align="center"><%=dto.getReadcount() %></td>
				</tr>
			<%}
		%>
	
	</table>
</div>
	
	<!-- 페이징 처리 -->
	<div style="width:500px; text-align: center;" class="container">
		<ul class="pagination">
		<%
			//이전
			if(startPage > 1)
			{%>
				<li>
				 	<a href="boardlist.jsp?currentPage=<%=startPage-1%>">이전</a>
				</li>
			<%}
			for(int pp=startPage; pp<=endPage; pp++){
				if(pp==currentPage)
				{%>
					<li class="active">
					  <a href="boardlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
					</li>
				<%}else{%>
					<li>
					  <a href="boardlist.jsp?currentPage=<%=pp%>"><%=pp %></a>
					</li>
				<%}
			}
			//다음버튼
			if(endPage < totalpage){%>
				<li>
					<a href="boardlist.jsp?currentPage=<%=endPage+1%>">다음</a>
				</li>				
			<%}
		%>
		</ul>
	</div>
	<!-- 페이징 처리 끝-->
	
</body>
</html>
