package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import data.dto.AnswerDto;
import mysql.db.DbConnect;

public class AnswerDao {

	DbConnect db = new DbConnect();
	
	//insert 
	public void insertAnswer(AnswerDto dto) {
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="insert into answer (num,myid,content,writeday) values (?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getNum());
			pstmt.setString(2, dto.getMyid());
			pstmt.setString(3, dto.getContent());
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
	
	//전체출력__파라미터 값 넣은이유 : 부모 원글에 대한 num값. 부모값 알아야 댓글담
	public List<AnswerDto> getAllAnswer(String num) {
		
		List<AnswerDto> list = new Vector<AnswerDto>();
	
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from answer where num=? order by idx";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				AnswerDto dto = new AnswerDto();
				
				dto.setIdx(rs.getString("idx"));
				dto.setNum(rs.getString("num"));
				dto.setMyid(rs.getString("myid"));
				dto.setContent(rs.getString("content"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
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
	//원글(num) 말고 내가쓴거(idx) 지울거기때문에 파라미터값에 idx
	public void deleteAnswer(String idx) {
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql="delete from answer where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	
	
	
	
}
