<%@page import="data.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String save = request.getParameter("savechk");
	
	MemberDao dao = new MemberDao();
	boolean b = dao.isIdPass(id, pass);
	
	if(b){
		//로그인중인지 알수잇는 세션저장
		session.setAttribute("loginok", "yes");
		
		//아이디, 체크값 저장
		session.setAttribute("idok", id);
		
		session.setAttribute("saveok", save);
		
		session.setMaxInactiveInterval(60*60*24);
		
		response.sendRedirect("../index.jsp?main=login/loginmain.jsp");
	}else{%>
		<script>
			alert("아이디와 비밀번호가 일치하지 않습니다");
			history.back();			
		</script>
	<%}
%>