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
	//�ݵ�� ���� �޾ƾ��Ѵ�. �Ź� �������ϰ�
	public Connection getOracle() {

		Connection conn=null;

		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����Ŭ �������"+e.getMessage());
		}

		return conn; //������ ����� �����ȳ�
	}
 
	//�̸��� ���Ƶ� �ȴ�. ��, �ȿ��ִ� ���ڰ��� �޶���Ѵ�
	//close...select...�ϼ���sql(Statement)
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {

		try {

			if (rs!=null)rs.close();
			if (stmt!=null)stmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//close...select...�ϼ���sql(Statement)
	public void dbClose(Statement stmt, Connection conn) {


		try {

			if (stmt!=null)stmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//close...select...�̿ϼ���sql(PreparedStatement)
	public void dbClose(ResultSet rs,PreparedStatement pstmt, Connection conn) {

		try {

			if (rs!=null)rs.close();
			if (pstmt!=null)pstmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//close...select...�ϼ���sql(PreparedStatement)
	public void dbClose(PreparedStatement pstmt, Connection conn) {

		try {

			if (pstmt!=null)pstmt.close();
			if (conn!=null)conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


