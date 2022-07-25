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

	
	String sql="select * from student order by num";
		
	String s="[";
		
		
		try{
			pstmt=conn.prepareStatement(sql);
		   rs=pstmt.executeQuery();
		   
		   while(rs.next()){
		      String num=rs.getString("num");
		      String name=rs.getString("name");
		      String photo=rs.getString("photo");
		      String java=rs.getString("java");
		      String string=rs.getString("string");
		
		      s+="{";
		      //이건 DB를 json 형태로다가 파싱 하기 위한것		      
		      //{"num":1,"name":"김동규","photo":"../img/1.png","java":87,"string":90}
		      
		      s+="\"num\":"+num+",\"name\":\""+name+"\",\"photo\":\""+photo;
		      s+="\",\"java\":"+java+",\"string\":"+string;
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
			
