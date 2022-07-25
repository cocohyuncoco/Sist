<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.SmartDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.SmartDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Hi+Melody&family=Nanum+Brush+Script&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
SmartDao db=new SmartDao();
//기존방식
/* 페이징처리에 필요한 변수 */
int totalCount; //총 게시글 수
int totalPage;   //총 페이지 수
int startPage;   //각 블럭의 시작페이지
int endPage;   //각 블럭의 끝페이지
int start;      //각 페이지의 시작번호
int perPage=5;   //한페이지에 보여질 게시글 개수
int perBlock=5;   //한 블럭당 보여지는 페이지 개수
int currentPage;//현재 페이지

int no; //4-15 /2:40 / 33분꺼보기

//총 개수
totalCount=db.getTotalCount();

//현재 페이지번호 읽기, 단 null일 경우는 1페이지로 설정
if(request.getParameter("currentPage")==null)
   currentPage=1;
else
   currentPage=Integer.parseInt(request.getParameter("currentPage"));

//총 페이지 개수
totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);

//각 블럭의 시작페이지
/* 
ex) 현재페이지가 3인 경우 startpage=1, endpage=5
   현재페이지가 6인 경우 startpage=6, endpage=10
*/
startPage=(currentPage-1)/perBlock*perBlock+1;
endPage=startPage+perBlock-1;

//마지막 블럭
//총 페이지수가 8개인 경우 1~5 // 6~8 이므로 두번째 블럭은 endpage=8이 되어야함
if(endPage>totalPage)
   endPage=totalPage;

//각페이지에서 불러올 시작번호
start=(currentPage-1)*perPage;

//각페이지에서 필요한 게시글 가져오기
List<SmartDto> list=db.getList(start, perPage);

//각 글앞에 붙일 시작번호 구하기
//총 글이 20개면 1페이지 20 2페이지 15부터 출력해서 1씩 감소
no=totalCount-(currentPage-1)*perPage; 

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>

<body>

<!-- 게시판 출력 -->
<button type="button" class="btn btn-success" style="margin-left: 20px; width: 100px" 
onclick="location.href='index.jsp?main=board/smartform.jsp'"><span class="glyphicon glyphicon-pencil"></span>
글쓰기
</button>

<table class="table table-bordered" style="width: 900px;">
   <caption><b>스마트 게시판</b></caption>
   <tr>
      <th width="70">번호</th>
      <th width="370">제목</th>
      <th width="100">작성자</th>
      <th width="170">작성일</th>
      <th width="70">조회수</th>
   </tr>
   <%
   if(totalCount==0){
   %>
      <tr>
         <td colspan="5" align="center">
            <b>등록된 게시글이 없습니다</b>
         </td>
      </tr>
   <%}else{
      for(SmartDto dto:list){
         %>
         <tr>
            <td align="center"><%=no-- %></td>
            <td><a href="index.jsp?main=board/detail.jsp?num=<%=dto.getNum()%>&currentPage=<%=currentPage%>"><%=dto.getSubject() %></a></td>
            <td><%=dto.getWriter() %></td>
            <td><%=dto.getWriteday() %></td>
            <td><%=dto.getReadcount() %></td>
         </tr>
      <%}
      
      %>
   <%}
   %>   
</table>

<!-- 페이징처리 : 페이지 번호 -->
<div style="width: 500px; text-align: center;" class="container">
   <ul class="pagination">
      <%
      //이전 : 현재 블럭의 전 블럭으로 이동
      if(startPage>1){%>
         <li>
         <a href="index.jsp?main=board/boardlist.jsp?currentPage=<%=startPage-1%>">이전</a>
         </li>
      <%}   
      
      //현재 블럭의 각 페이지번호
      for(int pp=startPage;pp<=endPage;pp++){
         if(pp==currentPage){//현재페이지가 맞으면 active클래스주기
            %>
            <li class="active">
            <a href="index.jsp?main=board/boardlist.jsp?currentPage=<%=pp%>"><%=pp%></a>
            </li>
            
            <% 
         }else{//현재페이지 아니면 평범하게 페이지 번호 띄우기
            %>
            
            <li>
            <a href="index.jsp?main=board/boardlist.jsp?currentPage=<%=pp%>"><%=pp%></a>
            </li>
             
         <%}
      }
      //다음 : 현재 블럭의 다음 블럭으로 이동
      if(endPage<totalPage){%>
         <li>
         <a href="index.jsp?main=board/boardlist.jsp?currentPage=<%=endPage+1%>">다음</a>
         </li>
      <%}   
      %>
   </ul>
</div>

</body>
</html>