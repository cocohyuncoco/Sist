package mymem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import mysql.db.DbConnet;

public class MymemDao {

	DbConnet db = new DbConnet();
	
	//데이터추가
	public void insertMymem(MymemDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt =null;
		
		String sql = "insert into mymem values(null,?,?,?,?,?,now())";
	
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getHp());
			pstmt.setString(5, dto.getEmail());
				
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}	//데이터추가 끝
	
	//전체출력
	public Vector<MymemDto> getAllDatas() {
		Vector<MymemDto> list = new Vector<MymemDto>();
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql="select * from mymem order by num desc";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				MymemDto dto = new MymemDto();
				
				dto.setNum(rs.getString("num"));				
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setEmail(rs.getString("email"));
				dto.setGaip(rs.getString("gaip"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
				
		return list;
	}//전체출력 끝
	
	//수정을 위한 하나 데이터 불러오기
	public MymemDto getData(String num) {
		
		MymemDto dto = new MymemDto();
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql="select * from mymem where num="+num;
		
		try {
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				//dto.setNum(rs.getString("num"));
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setEmail(rs.getString("email"));
				//dto.setGaip(rs.getString("gaip"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		return dto;
	}//수정을 위한 하나 데이터 불러오기 끝
	
	//수정
	public void mymemUpdate(MymemDto dto) {
		
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		String sql="update mymem set id=?,pass=?,name=?,hp=?,email=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getHp());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getNum());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}	//수정 끝
	
	
	//삭제
	public void mymemDelete(String num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="delete from mymem where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}	//삭제 끝
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
