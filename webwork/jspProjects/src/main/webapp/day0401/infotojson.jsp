<%@page import="mysql.db.DbConnet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//db와 연결
	DbConnet db = new DbConnet();

	Connection conn=db.getConnection();
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String sql="select * from info2 order by num";
	
	String s="[";
	
	
	try{
		pstmt=conn.prepareStatement(sql);
	   rs=pstmt.executeQuery();
	   
	   while(rs.next()){
	      String num=rs.getString("num");
	      String name=rs.getString("name");
	      String hp=rs.getString("hp");
	      String age=rs.getString("age");
	      String photo=rs.getString("photo");
	
	      s+="{";
	      // "num":num  "name":"name" 의 형태를 만들기 위해 이크케이프 문자 \ 사용
	      
	      //{"num":1,"name":"인형1","hp":"010-2222-3333","age":21,"photo":"../img/1.png"},
	      
	      s+="\"num\":"+num+",\"name\":\""+name+"\",\"hp\":\""+hp;
	      s+="\",\"age\":"+age+",\"photo\":\""+photo+"\"";
	      s+="},";
	   }
	   //마지막 컴마제거
	   s=s.substring(0,s.length()-1);
	}catch(SQLException e){
	   
	} finally{
	   db.dbClose(rs, pstmt, conn);
	}
	
	s+="]";
	
	
	%>
	
	<%=s %>
	
	
	
	
	
	
