package team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mysql.db.DbConnet;

public class TeamDao {
	
	//db커넥트 생성 메서드 이용해서 매번 계정연결 안해도됨
	DbConnet db = new DbConnet();
	
	//insert
	public void teamInsert(TeamDto dto) {
		//void는 리턴없다
		
		//insert 는 db테이블 순서대로 넣어야한다
		//물음표? 3개는 바인딩 시켜줘야한다
		String sql="insert into team (name,driver,addr,writeday) values(?,?,?,now())";
		
		Connection conn= db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩3개
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getDriver());
			pstmt.setString(3, dto.getAddr());
			
			//실행
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//select_조회문
	public ArrayList<TeamDto> getAllDatas(){
		//하나의 데이터는 업데이트할때 2번이 있습니까? 조건문 if
		//얘네들은 while문으로
		
		ArrayList<TeamDto> list = new ArrayList<TeamDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt =null;		
		ResultSet rs = null; //조회문에만 rs이 필요하다
		
		String sql ="select * from team order by num";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			while (rs.next()) {
				TeamDto dto = new TeamDto();
				
				dto.setNum(rs.getString("num")); //db테이블 컬럼명으로 하거나 열번호로 하거나//컬럼명으로 써주는게 더좋음
				dto.setName(rs.getString("name"));
				dto.setDriver(rs.getString("driver"));
				dto.setAddr(rs.getString("addr"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
				//list에 추가
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
	public void teamDelete(String num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="delete from team where num=?";
		
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
