package idx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import mysql.db.DbConnet;

public class idxDao {

	DbConnet db = new DbConnet();
	
	//id를 통해 name값 을얻는다 (필수는 아님)_그치만 로그인했을때 name값 얻는게 은근 많음
	public String getName(String id) { //이 id에 맞는 name값 찾아
		
		String name="";

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from idx where id=?";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
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
	
	
	//id에 맞는 pass인지를 확인해주는 메서드
	public boolean isLogin(String id, String pass) {
		
		boolean flag=false;
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; //조회 해야하니까 rs도
		
		String sql="select * from idx where id=? and pass=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				//비밀번호가 맞는 데이터가 있으면 true로 하겠다.
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return flag;
	}
	
}
