<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
</head>
<body>
	<div class="alert alert-success">
		총 ${totalCount }개의 글이 있습니다
	</div>
		
	<table class="table table-bordered" style="width: 800px; margin: 0 auto;"> 
		<caption><b>Spring 답변형 게시판</b>
		<span style="float: right;"><button type="button" class="btn btn-success"
		onclick="location.href='writeform'">글쓰기</button></span></caption>
	
		<tr bgcolor="#dff0d8" align="center">
			<th width="50">번호</th>
			<th width="300">제목</th>
			<th width="100">작성자</th>
			<th width="150">작성일</th>
			<th width="60">조회</th>			
		</tr>
		<!-- 등록된 게시글이 없을경우 -->
		<c:if test="${totalCount==0 }">
			<tr>
				<td colspan="5" align="center">등록된 게시글이 없습니다.</td>
			</tr>
		</c:if>
		<!-- 등록된 게시글이 있을경우(c:forEach로 뽑아주기만 하면댐) -->
		<c:if test="${totalCount>0 }">
			<c:forEach var="dto" items="${list}">
				<tr>
					<td align="center">${no }</td>
					<!-- 출력후 감소(왜냐면 증감식이 안됨으로) -->
					<c:set var="no" value="${no-1 }"/>
					
					<!-- 제목 -->
					<td>
						<!-- relevel만큼 공백을 주고 -->
						<c:forEach var="sp" begin="1" end="${dto.relevel }">
						 	<!-- 2칸 띄움..원글이면 0임으로 이부분이 안돈다 -->
							&nbsp;&nbsp;														
						</c:forEach>
						
						<!-- 답글인 경우에만 re이미지 출력 -->
						<c:if test="${dto.relevel>0 }">
						  <img alt="" src="../photo/re.png">
						</c:if>					
						
						<!-- 제목 -->
						<a href="content?num=${dto.num}&currentPage=${currentPage}">${dto.subject }</a>
						
						<!-- 댓글갯수 -->
						<c:if test="${dto.acount>0 }">
							<a href="content?num=${dto.num}&currentPage=${currentPage}#answer" style="color: red;">
								[${dto.acount }]
							</a>
						</c:if>
						
						<!-- 사진이 있으면 사진아이콘 표시 -->
						<c:if test="${dto.photo!='no'}">
							<span class="glyphicon glyphicon-picture" style="font-size: 0.8em; color: #ccc;"></span>
						</c:if>
					</td>		
					
					<td align="center">${dto.writer }</td>
					
					<td>
						<fmt:formatDate value="${dto.writeday}" pattern="yyyy-MM-dd"/>
					</td>
					
					<td align="center">${dto.readcount }</td>			
				</tr>
			</c:forEach>
		</c:if>
	</table>

<!-- 페이징 -->
<c:if test="${totalCount>0 }">
  <div style="width: 800px; text-align: center;" class="container">
    <ul class="pagination">
      <!-- 이전 -->
      <c:if test="${startPage>1 }">
        <li>
          <a href="list?currentPage=${startPage-1 }">이전</a>
        </li>
      </c:if>
      
      <c:forEach var="pp" begin="${startPage }" end="${endPage }">
        <c:if test="${currentPage==pp }">
          <li class="active">
            <a href="list?currentPage=${pp }">${pp }</a>
          </li>
        </c:if>
        <c:if test="${currentPage!=pp }">
          <li>
            <a href="list?currentPage=${pp }">${pp }</a>
          </li>
        </c:if>
      </c:forEach>
      
      <!-- 다음 -->
      <c:if test="${endPage<totalPage}">
        <li>
          <a href="list?currentPage=${endPage+1}">다음</a>
        </li>
      </c:if>
    </ul>
  </div>
</c:if>


	
</body>
</html>