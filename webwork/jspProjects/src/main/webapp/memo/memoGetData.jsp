<?xml version="1.0" encoding="UTF-8"?>
<%@page import="memo.memoDto"%>
<%@page import="memo.memoDao"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8" 
    pageEncoding="UTF-8"%>
	<data>
		<%
			//dao선언
			memoDao dao = new memoDao();
		
			//num읽기
			String num = request.getParameter("num");
			
			//getData 호출한 dto받기
			memoDto dto = dao.getData(num);
		
		%>
		<num><%=dto.getNum() %></num>
		<writer><%=dto.getWriter() %></writer>
		<content><%=dto.getContent() %></content>
		<avatar><%=dto.getAvatar() %></avatar>
		
		
    </data>