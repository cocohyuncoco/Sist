package ajaxboard;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import memo.memoDto;
import mysql.db.DbConnet;

public class AjaxBoardDao {

	DbConnet db = new DbConnet();
	
	//insert메서드
	public void insertboard(AjaxBoardDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql ="insert into ajaxboard values(null,?,?,?,?,now())";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getAvata());
			
			//실행
			pstmt.execute();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	   //select - 전체조회
	   public ArrayList<AjaxBoardDto> getAllDatas() {
	      
	      ArrayList<AjaxBoardDto> list=new ArrayList<AjaxBoardDto>();
	      
	      Connection conn=db.getConnection();
	      PreparedStatement psmt=null;
	      ResultSet rs=null;
	      
	      //최신글을 제일 위에
	      String sql="select * from ajaxboard order by num desc";
	      
	      try {
	         psmt=conn.prepareStatement(sql);
	         rs=psmt.executeQuery();
	         
	         while(rs.next()) {
	            
	            AjaxBoardDto dto=new AjaxBoardDto();
	            //rs로부터 얻은 DB 데이터를 DTO에 보내기
	            dto.setNum(rs.getString("num"));
	            dto.setWriter(rs.getString("writer"));
	            dto.setSubject(rs.getString("subject"));
	            dto.setContent(rs.getString("content"));
	            dto.setAvata(rs.getString("avata"));
	            dto.setWriteday(rs.getTimestamp("writeday"));
	            
	            //DTO 꾸러미인 list에 추가
	            list.add(dto);
	            
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         db.dbClose(rs, psmt, conn);
	      }
	      
	      // 모든 DB 데이터를 DTO 리스트 형식으로 반환
	      return list;
	   }


	   //데이터 수정하기 1. 저장된 값 불러오기
	   //num을 인자로 받아서 해당 dto 반환
	   public AjaxBoardDto getData(String num) {
		  
		  AjaxBoardDto dto=new AjaxBoardDto();
		  
	      Connection conn=db.getConnection();
	      PreparedStatement psmt=null;
	      ResultSet rs=null;
	      
	      String sql="select * from ajaxboard where num=?";
	      	      
	      
	      try {
	    	  psmt=conn.prepareStatement(sql);
	         
	         //바인딩
	    	  psmt.setString(1, num);
	         
	         rs=psmt.executeQuery();
	         
	         if(rs.next()) {
	            dto.setNum(rs.getString("num"));
	            dto.setWriter(rs.getString("writer"));
	            dto.setSubject(rs.getString("subject"));
	            dto.setContent(rs.getString("content"));
	            dto.setAvata(rs.getString("avata"));
	            dto.setWriteday(rs.getTimestamp("writeday"));
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         db.dbClose(rs, psmt, conn);
	      }
	      return dto;
	   }
	   
	   
	   //DB 업데이트
	   public void AjaxboardUpdate(AjaxBoardDto dto) {
		   
		   Connection conn = db.getConnection();
		   PreparedStatement pstmt = null;
		   
		   String sql ="update ajaxboard set writer=?,subject=?,content=?,avata=? where num=?";
		   
		   try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getAvata());
			pstmt.setString(5, dto.getNum());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	  
	//삭제 메서드
	public void deleteboard(String num) {
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			
			String sql="delete from ajaxboard where num=?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, num);
				
				pstmt.execute();			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(pstmt, conn);
			}
			
		}
	
}
