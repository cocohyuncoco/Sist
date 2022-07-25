package day0225;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_ReviewJdbc {
	
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void writeShop() {

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select c.idx, s.num,s.sangpum,s.color,c.cnt,c.guipday from shop s, cart1 c where s.num=c.num";
		
		try {
			conn =DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("**구매 리스트**");
			System.out.println("주문번호\t상품번호\t상품명\t색상\t구입갯수\t구입일자");
			System.out.println("-----------------------------------------------------------");
			
			while (rs.next()) {
				
				int idx = rs.getInt(1);
				int num = rs.getInt(2);
				String sangpum = rs.getString(3);
				String color = rs.getString(4);
				int cnt = rs.getInt(5);
				String guipday = rs.getString(6);
				
				System.out.println(idx+"\t"+num+"\t"+sangpum+"\t"+color+"\t"+cnt+"\t"+guipday);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_01_ReviewJdbc re = new _01_ReviewJdbc();
		re.writeShop();
	}

}
