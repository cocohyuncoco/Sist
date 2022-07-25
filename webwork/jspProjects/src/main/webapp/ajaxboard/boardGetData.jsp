<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.util.Enumeration"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8" 
    pageEncoding="UTF-8"%>
	<data>
	<%
		//dao선언
		AjaxBoardDao dao = new AjaxBoardDao();
		
		//num읽기
		String num = request.getParameter("num");
			
		//getData 호출한 dto받기
		AjaxBoardDto dto = dao.getData(num);
		
		%>
		<num><%=dto.getNum() %></num>
		<writer><%=dto.getWriter() %></writer>
		<subject><%=dto.getSubject() %></subject>
		<content><%=dto.getContent() %></content>
		<avata><%=dto.getAvata() %></avata>
		
		
    </data>
