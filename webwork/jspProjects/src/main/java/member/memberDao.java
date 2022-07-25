package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import mysql.db.DbConnet;


public class memberDao {
	
	DbConnet db = new DbConnet();
	
	//insert
	public void memberInsert(memberDto dto) {
	
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="insert into member values(null,?,?,now())";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getHp());
						
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//select
	public Vector<memberDto> getAlldatas() {
		Vector<memberDto> list = new Vector<memberDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql ="select * from member order by num asc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				memberDto dto = new memberDto();
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setSdate(rs.getTimestamp("sdate"));
				
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
	
	
	//삭제
	public void memberDelete(String num) {
		Connection conn = db.getConnection();
		Statement stmt = null;
		
		String sql ="delete from member where num="+num; //이러면 바인딩 안해줘도됨
		
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	
	//수정하려는 하나의 데이터 필요
	public memberDto getData(String num) {
		//memberDto -> (넘버부터 날짜까지 하나) 다 갖고잇는거
		//그걸 100까지 묶어논게 백터고 어레이리스트고 
		//memberDto() 는 하나의 데이터만 있음
		
		memberDto dto = new memberDto();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql ="select * from member where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num); //★바인딩
			
			rs = pstmt.executeQuery();	
			
			if (rs.next()) {//하나의 데이터엔 if문
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setSdate(rs.getTimestamp("sdate"));		
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return dto;
	}
	
	//수정
	
	public void memberUpdate(memberDto dto) {//인자값으로 dto를 통채로 보낸다. 전부다 고치기 때문에
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="update member set name=?,hp=? where num=?";
		//name, hp를 고치는데 조건을 준다 몇번?
		
		try {
			pstmt=conn.prepareStatement(sql);
			//여기서 sql를 넘기고 인셉션 처리
			
			//바인딩..dto로 부터 받아온다
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getHp());
			pstmt.setString(3, dto.getNum());
			
			//실행
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
