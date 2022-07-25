<%@page import="data.dao.MemberDao"%>
<%@page import="data.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	
	request.setCharacterEncoding("utf-8");

	String num = request.getParameter("num");	
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String addr = request.getParameter("addr");
	String email = request.getParameter("email1")+"@"+request.getParameter("email2");
	
	MemberDto dto = new MemberDto();
	
	dto.setNum(num);
	dto.setName(name);
	dto.setHp(hp);
	dto.setAddr(addr);
	dto.setEmail(email);
	
	MemberDao dao = new MemberDao();
	dao.updatemember(dto);
	
	response.sendRedirect("../index.jsp?main=member/memberlist.jsp");
	
%>