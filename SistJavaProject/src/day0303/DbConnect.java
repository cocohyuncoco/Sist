package day0303;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	//url
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";

	//Connection
	//반드시 리턴 받아야한다. 매번 생성안하게
	public Connection getOracle() {

		Connection conn=null;

		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 연결실패"+e.getMessage());
		}

		return conn; //리턴을 해줘야 오류안남
	}
 
	//이름은 같아도 된다. 단, 안에있는 인자값은 달라야한다
	//close...select...완성형sql(Statement)
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {

		try {

			if (rs!=null)rs.close();
			if (stmt!=null)stmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//close...select...완성형sql(Statement)
	public void dbClose(Statement stmt, Connection conn) {


		try {

			if (stmt!=null)stmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//close...select...미완성형sql(PreparedStatement)
	public void dbClose(ResultSet rs,PreparedStatement pstmt, Connection conn) {

		try {

			if (rs!=null)rs.close();
			if (pstmt!=null)pstmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//close...select...완성형sql(PreparedStatement)
	public void dbClose(PreparedStatement pstmt, Connection conn) {

		try {

			if (pstmt!=null)pstmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


