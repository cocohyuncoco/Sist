<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="memo.memoDto"%>
<%@page import="java.util.List"%>
<%@page import="memo.memoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	memoDao dao = new memoDao();
	
	//전체목록 가져오기
	List<memoDto> list = dao.getAllDatas();
	
	JSONArray arr = new JSONArray(); //json의 멤버값들을 배열형태로 둔것
	
	//arr에 먼저 size부터 보내보기
	
	// 얘넨 닫아주세요. 그냥 해본거니까요.
	// JSONObject size = new JSONObject();
	//size.put("size",list.size());
	
	//arr.add(size); 
	
	//{"num":"1","writer":"angel","avatar":"..\/img\/7.png","writeday":"2022-04-04 15:29","content":"ajax게시판 만들기 참 쉽죠?ㅎㅎ"}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	for(memoDto dto:list){
		
		JSONObject ob = new JSONObject();
		
		ob.put("num",dto.getNum());
		ob.put("writer",dto.getWriter());
		ob.put("content",dto.getContent());
		ob.put("avatar",dto.getAvatar());
		ob.put("writeday",sdf.format(dto.getWriteday()));
		
		//arr에 추가
		arr.add(ob);
	}
	
%>

	<%=arr.toString()%>





