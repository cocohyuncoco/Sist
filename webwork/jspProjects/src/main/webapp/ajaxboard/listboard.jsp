<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ajaxboard.AjaxBoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ajaxboard.AjaxBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	//DB로부터 모든 데이터를 조회하여 json 형태로 반환
	AjaxBoardDao db = new AjaxBoardDao();
	ArrayList<AjaxBoardDto> list = db.getAllDatas();
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	
	//json 생성 - for-each문으로 DB로부터 데이터를 받아 json에 담기
	
	JSONArray arr=new JSONArray();
	      
	for(AjaxBoardDto dto:list){
	   JSONObject ob=new JSONObject();
	   ob.put("num", dto.getNum());
	   ob.put("writer", dto.getWriter());
	   ob.put("subject", dto.getSubject());
	   ob.put("content", dto.getContent());
	   ob.put("avata", dto.getAvata());
	   ob.put("writeday", sdf.format(dto.getWriteday()));
	   
	   arr.add(ob);
	   //JSON 데이터 반환
	}

%>

<%=arr.toString() %>