<%@page import="data.dto.MemberDto"%>
<%@page import="data.dao.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String hp = request.getParameter("hp");
	String addr = request.getParameter("addr");
	String email = request.getParameter("email1")+"@"+request.getParameter("email2");

	MemberDto dto = new MemberDto();
	
	dto.setName(name);
	dto.setId(id);
	dto.setPass(pass);
	dto.setHp(hp);
	dto.setAddr(addr);
	dto.setEmail(email);
	
	MemberDao dao = new MemberDao();
	
	dao.insertMember(dto);
	
	//gaipsuccess.jsp 로 이동
	response.sendRedirect("../index.jsp?main=member/gaipsuccess.jsp?id="+id);
	
%>