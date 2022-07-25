<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mysql.db.DbConnet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DbConnet db = new DbConnet();
	Connection conn = db.getConnection();
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql ="select * from friend order by num";
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	try{
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		//json 오브젝트 생성 
		//걔네들의 배열 형태가 json array
		//선언해놓고 json에 담은다음에 마지막에 추가
		
		JSONArray arr = new JSONArray(); //json 객체가 들어가는 배열 //JSONObject
		
		while(rs.next()){
			String num = rs.getString("num");
			String name = rs.getString("name");
			String hp = rs.getString("hp");
			String addr = rs.getString("addr");
			//String gaip = rs.getString("gaip");
			String gaip = sdf.format(rs.getTimestamp("gaip"));
			
			//json 생성
			JSONObject ob = new JSONObject();
			
			//데이타 넣기
			ob.put("num",num);
			ob.put("name",name);
			ob.put("hp",hp);
			ob.put("addr",addr);
			ob.put("gaip",gaip);
			
			//array 에 추가
			arr.add(ob);
			
		}%>
		
		<%=arr.toString()%>
		
	<%}catch(SQLException e){
		
		
	}finally{
		db.dbClose(rs, stmt, conn);
		
	}%>
	
	
