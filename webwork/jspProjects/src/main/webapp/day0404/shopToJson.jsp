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
	
	String sql ="select * from shop order by num";
	
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
			String sangpum = rs.getString("sangpum");
			String color = rs.getString("color");
			String price = rs.getString("price");
			String imagename = rs.getString("imagename");
			
			//json 생성
			JSONObject ob = new JSONObject();
			
			//데이타 넣기
			ob.put("num",num);
			ob.put("sangpum",sangpum);
			ob.put("color",color);
			ob.put("price",price);
			ob.put("imagename",imagename);
			
			//array 에 추가
			arr.add(ob);
			
		}%>
		
		<%=arr.toString()%>
		
	<%}catch(SQLException e){
		
		
	}finally{
		db.dbClose(rs, stmt, conn);
		
	}%>
	
	
