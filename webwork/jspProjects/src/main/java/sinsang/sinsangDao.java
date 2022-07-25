package sinsang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import mysql.db.DbConnet;

public class sinsangDao {

		DbConnet db = new DbConnet();
		
		//추가
		public void insertSinsang(sinsangDto dto) {
			
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			
			String sql="insert into sinsang values(null,?,?,?,?)";
			
			try {
				pstmt=conn.prepareStatement(sql);
				
				//4개값 바인딩
				pstmt.setString(1, dto.getName());
				pstmt.setString(2, dto.getBlood());
				pstmt.setString(3, dto.getHp());
				pstmt.setString(4, dto.getBirth());
				
				pstmt.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(pstmt, conn);
			}
		}//추가 끝
		
		//전체출력
		public Vector<sinsangDto> getAllDatas() {
			Vector<sinsangDto> list = new Vector<sinsangDto>();
			Connection conn = db.getConnection();
			Statement stmt = null;
			ResultSet rs = null;
			
			String sql="select * from sinsang order by num desc";
			
			try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
				while (rs.next()) {
					sinsangDto dto = new sinsangDto();
					
					dto.setNum(rs.getString("num"));
					dto.setName(rs.getString("name"));
					dto.setBlood(rs.getString("blood"));
					dto.setHp(rs.getString("hp"));
					dto.setBirth(rs.getString("birth"));
					
					list.add(dto);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);;
			}
			
			return list;
		};	//전체출력 끝
	
		//삭제 메서드
		public void deletesinsang(String num) {
			
			Connection conn = db.getConnection();
			Statement stmt = null;
			
			String sql="delete from sinsang where num="+num;
			
			try {
				stmt=conn.createStatement();
				//여긴 바인딩 해줄게 없어서. 바로 실행
				stmt.execute(sql);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(stmt, conn);
			}
		};//삭제 메서드 끝
		
		//수정하려는 데이터 하나만 선택
		public sinsangDto getData(String num) {
			
			sinsangDto dto = new sinsangDto();
			Connection conn = db.getConnection();
			Statement stmt = null;
			ResultSet rs = null;
			
			String sql ="select * from sinsang where num="+num;
			
			try {
				stmt=conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					dto.setNum(rs.getString("num"));
					dto.setName(rs.getString("name"));
					dto.setBlood(rs.getString("blood"));
					dto.setHp(rs.getString("hp"));
					dto.setBirth(rs.getString("birth"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, stmt, conn);
			}
			
			return dto;		
			
		};	//수정하려는 데이터 하나만 선택 끝
		
		
		//최종수정
		public void updatesinsang(sinsangDto dto) {
			
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			
			String sql="update sinsang set name=?,blood=?,hp=?,birth=? where num=?";
			
			try {
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, dto.getName());
				pstmt.setString(2, dto.getBlood());
				pstmt.setString(3, dto.getHp());
				pstmt.setString(4, dto.getBirth());
				pstmt.setString(5, dto.getNum());
				
				pstmt.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(pstmt, conn);
			}
		}; //최종수정 끝
		
		
}
