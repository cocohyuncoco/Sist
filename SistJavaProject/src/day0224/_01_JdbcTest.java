package day0224;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//DB�׽�Ʈ

//url, ����, ��й�ȣ
public class _01_JdbcTest {

	
	//���÷� ����Ŭ ����
	//���� DB ���� ����Ŭ �ּ� ������
	static final String ORACLE_LOCAL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//Ŭ���� ����Ŭ ����
	//static final String ORACLE_CLOUD="jdbc:oracle:thin:@db202202172315_high?TNS_ADNIN";
	
	//sawon_oracle_sawon
	public void connectSawon() {
		
		//JDBC 3�� ��ü...������ �־����
		Connection conn=null; //�ڹٿ� ����Ŭ ����
		Statement stmt=null; //���� sql�� �ۼ��� �ִ°�		 
		ResultSet rs=null; //�ۼ��� sql�� ��ȸ�� �ִ°�
		//select �ݵ�� ResultSet ��ü�� ���� �Ѵ�
		
		String sql="select * from sawon order by num";
		
		try {
			
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
			System.out.println("����Ŭ ���� ���� ����!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("**��� ����Ʈ**");
			System.out.println("�����ȣ\t�����\t����\t�μ���\t�޿�");
			System.out.println("------------------------------------------");
			
			//�������� �о�;������� while������ �����´�
			//rs.next(); ��ü�� ���ؼ� ���̻� �����Ͱ� ���������� true �� ��ȯ
			while (rs.next()) {
				
				//db�κ��� ������ ��������
				//rs��ü�κ��� ����������
				int num=rs.getInt("num"); //db�÷���. num�� db����. db���� ���س���
				String name=rs.getString("name"); 
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����Ŭ ���� ����");
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
		
		
	}//sawon_oracle_sawon ��
	
	
	//food 
	//food+jumun
	//�ֹ���ȣ  �ֹ���   ���ĸ�   ����   ������ּ�
	public void connectionBaedal() {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select f.fno,j.name,f.food,f.price,j.addr from food f, jumun j where f.fno=j.fno";
		
		try {
			conn=DriverManager.getConnection(ORACLE_LOCAL, "hyun", "a1234");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("\t**����ǹ��� �ֹ�**");
			System.out.println("�ֹ���ȣ\t�ֹ���\t���ĸ�\t����\t������ּ�");
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
