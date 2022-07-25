package day0224;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//DB테스트

//url, 계정, 비밀번호
public class _01_JdbcTest {

	
	//로컬로 오라클 연결
	//퀀텀 DB 들어가서 오라클 주소 가져옴
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//클라우드 오라클 연결
	//static final String ORACLE_CLOUD="jdbc:oracle:thin:@db202202172315_high?TNS_ADNIN";
	
	//sawon_oracle_sawon
	public void connectSawon() {
		
		//JDBC 3개 객체...무조건 있어야함
		Connection conn=null; //자바와 오라클 연결
		Statement stmt=null; //내가 sql문 작성해 주는것		 
		ResultSet rs=null; //작성한 sql문 조회해 주는것
		//select 반드시 ResultSet 객체를 얻어야 한다
		
		String sql="select * from sawon order by num";
		
		try {
			
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
			System.out.println("오라클 서버 연결 성공!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("**사원 리스트**");
			System.out.println("사원번호\t사원명\t성별\t부서명\t급여");
			System.out.println("------------------------------------------");
			
			//여러줄을 읽어와야함으로 while문으로 가져온다
			//rs.next(); 객체를 통해서 더이상 데이터가 없을때까지 true 값 반환
			while (rs.next()) {
				
				//db로부터 데이터 가져오기
				//rs객체로부터 가져와진다
				int num=rs.getInt("num"); //db컬럼명. num은 db네임. db에서 써준네임
				String name=rs.getString("name"); 
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 연결 실패");
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
		
		
	}//sawon_oracle_sawon 끝
	
	
	//food 
	//food+jumun
	//주문번호  주문자   음식명   가격   배달지주소
	public void connectionBaedal() {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select f.fno,j.name,f.food,f.price,j.addr from food f, jumun j where f.fno=j.fno";
		
		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("\t**배달의민족 주문**");
			System.out.println("주문번호\t주문자\t음식명\t가격\t배달지주소");
			System.out.println("----------------------------------------");
			while (rs.next()) {
				
				int fno=rs.getInt("fno"); 
				String name=rs.getString("name"); 
				String food=rs.getString("food");
				int price=rs.getInt("price");
				String addr=rs.getString("addr");
				
				System.out.println(fno+"\t"+name+"\t"+food+"\t"+price+"\t"+addr);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null)rs.close();
				if (stmt!=null)stmt.close();
				if (conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_01_JdbcTest jdbc = new _01_JdbcTest();
		//jdbc.connectSawon();
		jdbc.connectionBaedal();
		
		
		
	}

}
