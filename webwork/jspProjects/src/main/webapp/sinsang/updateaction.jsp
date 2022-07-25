<%@page import="sinsang.sinsangDao"%>
<%@page import="sinsang.sinsangDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String blood = request.getParameter("blood");
	String hp = request.getParameter("hp1")+"-"+request.getParameter("hp2")+"-"+request.getParameter("hp3");
	String birth = request.getParameter("birth");
	
	sinsangDto dto = new sinsangDto();
	
	dto.setNum(num);
	dto.setName(name);
	dto.setBlood(blood);
	dto.setHp(hp);
	dto.setBirth(birth);
	
	sinsangDao db = new sinsangDao();
	db.updatesinsang(dto);
	
	response.sendRedirect("sslist.jsp");
%>