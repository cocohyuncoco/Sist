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
<style type="text/css">

</style>
<script type="text/javascript">

	$(function () {
		
		$(".delbtn").click(function () {
			
			let num = $(this).attr("num");
			
			let del = confirm("책을 삭제할까요?");
			
			if (del) {
				
				$.ajax({
					type:"get",
					dataType:"text",
					url:"delete",
					data:{"num":num},
					success:function(data){
						alert("책을 삭제했습니다");	
						window.location.href = '/';
					}					
				})
			
			} 		
		})
		
		
	});

</script>
</head>
<body>
		
		 <table class="table table-bordered" style="width: 500px; margin: 0 auto;"> 
		 	<tr >	
		 		<th style="width: 100px;">제목</th>	 		
		 		<td>${dto.bookname  }
		 	</tr>
		 	<tr>	
		 		<th>저자</th>	 		
		 		<td>${dto.writer }</td>
		 	</tr>
		 	<tr>	
		 		<th>가격</th>	 		
		 		<td>
		 			<fmt:formatNumber value="${dto.bookprice }"/>원
		 		</td>
		 	</tr>
		 	<tr>	
		 		<th>줄거리</th>	 		
		 		<td>${dto.booksubject }</td>
		 	</tr>
		 	<tr>	
		 		<th>출판사</th>	 		
		 		<td>${dto.bookcompany }</td>
		 	</tr>
			<tr>	
		 		<th>입고날짜</th>	 		
		 		<td>
		 		 <fmt:formatDate value="${dto.ipgoday }" pattern="yyyy-MM-dd"/>
		 		</td>
		 	</tr>
			<tr>
				<td colspan="2" align="center">
		 		<button type="button" class="btn btn-success"
		 		onclick="location.href='updateform?num=${dto.num}'">책 수정</button>
		 			
		 		<!-- 삭제버튼 누르면 확인 창 누르고 삭제되게 아니면 삭제취소 되게 하고싶을때 -->
				<button type="button" class="btn btn-danger delbtn"	num=${dto.num }>책 삭제</button>
				
				<!--
					이건 클릭하면 바로 삭제되게 하고싶을때
					 
					<button type="button" class="btn btn-danger delbtn"
					onclick="location.href='delete?num=${dto.num}'">책 삭제</button>
				 -->
		 		</td>	
		 	</tr>	
		 	
		 </table>	
</body>
</html>