package day0225;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_ExSawonGroup {

	DbConnect db = new DbConnect();
	
	public void writeSawonGroup() {
		
		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select buseo,count(buseo) count, round(avg(pay),0) avgpay,max(pay) maxpay, min(pay) minpay from sawon group by buseo";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//제목출력
			System.out.println("부서명\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("------------------------------------");
			
			//데이터출력
			while (rs.next()) {
				
				/* 열번호로 불러와보기
				String buseo=rs.getString(1);
				int count=rs.getInt(2);
				int avgpay=rs.getInt(3);
				int maxpay=rs.getInt(4);
				int minpay=rs.getInt(5); */
				
				//alias(별명) 준걸로 불러오기
				String buseo=rs.getString(1);
				int count=rs.getInt("count");
				int avgpay=rs.getInt("avgpay");
				int maxpay=rs.getInt("maxpay");
				int minpay=rs.getInt("minpay");
				
				//테이블 출력
				System.out.println(buseo+"\t"+count+"\t"+avgpay+"\t"+maxpay+"\t"+minpay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_02_ExSawonGroup sawon = new _02_ExSawonGroup();
		sawon.writeSawonGroup();
	}

}
