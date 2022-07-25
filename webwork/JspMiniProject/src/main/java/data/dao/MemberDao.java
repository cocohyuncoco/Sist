package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.mysql.cj.xdevapi.PreparableStatement;

import data.dto.MemberDto;
import mysql.db.DbConnect;

public class MemberDao {

	DbConnect db = new DbConnect();
	
	//아이디체크
	public boolean isIdCheck(String id) {
		
		boolean b = false;
		
		Connection conn=db.getConnection();
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;	
		 
		String sql="select * from member where id=?";
		
		 try {
	         pstmt=conn.prepareStatement(sql);
	         
	         pstmt.setString(1, id);
	         
	         rs=pstmt.executeQuery();
	         
	         if(rs.next())
	            b=true;
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         db.dbClose(rs, pstmt, conn);
	      }
	      return b;
	   }
	//id에 따른 name변환
	public String getName(String id) {
		
		String name="";
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		
		String sql="select * from member where id=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if (rs.next())
				name=rs.getString("name");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return name;
	}

	//insert
	public void insertMember(MemberDto dto) {
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="insert into member values(null,?,?,?,?,?,?,now())";
	
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPass());
			pstmt.setString(4, dto.getHp());
			pstmt.setString(5, dto.getAddr());
			pstmt.setString(6, dto.getEmail());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//전체출력
	public List<MemberDto> getAllMembers() {
		
		List<MemberDto> list = new Vector<MemberDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from member order by id";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				MemberDto dto = new MemberDto();
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setHp(rs.getString("hp"));
				dto.setAddr(rs.getString("addr"));
				dto.setEmail(rs.getString("email"));			
				dto.setGaipday(rs.getTimestamp("gaipday"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
	
	//비밀번호 체크...num과 pass를 비교
	public boolean ispassEqual(String num, String pass)
	   {
	      boolean flag=false;
	      
	      Connection conn=db.getConnection();
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      
	      String sql="select * from member where num=? and pass=?";
	      
	      try {
	         pstmt=conn.prepareStatement(sql);
	         
	         pstmt.setString(1, num);
	         pstmt.setString(2, pass);
	         
	         rs=pstmt.executeQuery();
	         
	         if(rs.next())
	        	 flag=true;
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         db.dbClose(rs, pstmt, conn);
	      }
	      return flag;
	   }
	   
	//삭제
	public void deleteMember(String num)  {
	      Connection conn=db.getConnection();
	      PreparedStatement pstmt=null;
	      
	      String sql="delete from member where num=?";
	      
	      try {
	         pstmt=conn.prepareStatement(sql);
	         
	         pstmt.setString(1, num);
	         
	         pstmt.execute();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         db.dbClose(pstmt, conn);
	      }
	   }
	
	//회원 dto 반환
	public MemberDto getMember(String num) {
		
		MemberDto dto = new MemberDto();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from member where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setHp(rs.getString("hp"));
				dto.setAddr(rs.getString("addr"));
				dto.setEmail(rs.getString("email"));			
				dto.setGaipday(rs.getTimestamp("gaipday"));			
			}					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
		return dto;		
	}
	

	//수정
	public void updatemember(MemberDto dto) {
		
		Connection conn =db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="update member set name=?,hp=?,addr=?,email=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getHp());
			pstmt.setString(3, dto.getAddr());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getNum());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}

	//id를 통해 name값얻는 메서드 (로그인)
	public String memberName(String id) {
		
		String name="";
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		String sql="select * from member where id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
					
			if (rs.next()) {
				name = rs.getString("name");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return name;				
	}
	
	//id에 맞는 비번인지 확인 메서드
	public boolean isIdPass (String id, String pass) {
		
		boolean b = false;
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		
		String sql="select * from member where id=? and pass=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				//비번이 맞는 데이터 잇음 true로 변경
				b = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return b;
	}
	
	//장바구니 담을때 멤버테이블에 num을 넣어야하는데 세션에 id가 있음으로 id를 통해서 num을 얻는메소드를 추가한다
	public String getNum(String id) {
		
		String num = "";
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select num from member where id=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				num = rs.getString("num");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return num;
	}
	
}
