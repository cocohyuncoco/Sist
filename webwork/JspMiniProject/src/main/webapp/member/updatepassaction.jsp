<%@page import="data.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%		
	//num읽기
	String num = request.getParameter("num");
	//pass읽기	
	String pass = request.getParameter("pass");

	//dao선언
	MemberDao dao = new MemberDao();
	//비번체크 후 맞으면 삭제메서드 호출
	//틀리면 경고 후 이전으로 	
	
	boolean b = dao.ispassEqual(num, pass);
	
	if(b){
		//비밀번호 맞으면 수정 리스트로 이동
		response.sendRedirect("../index.jsp?main=member/updateform.jsp?num="+num);
	}else{
		%>
		<script>
			alert("비밀번호가 맞지않습니다");
			history.back();			
		</script>
	<%}
%>