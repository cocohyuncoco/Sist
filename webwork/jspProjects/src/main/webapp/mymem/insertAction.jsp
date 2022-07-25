<%@page import="mymem.MymemDao"%>
<%@page import="mymem.MymemDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	String hp = request.getParameter("hp1")+"-"+request.getParameter("hp2")+"-"+request.getParameter("hp3");
	String email = request.getParameter("email1")+"@"+request.getParameter("email2");
	
	
	MymemDto dto = new MymemDto();
	dto.setId(id);
	dto.setPass(pass);
	dto.setName(name);
	dto.setHp(hp);
	dto.setEmail(email);
	
	MymemDao dao = new MymemDao();
	
	dao.insertMymem(dto);
	
	response.sendRedirect("mymemList.jsp");
%>