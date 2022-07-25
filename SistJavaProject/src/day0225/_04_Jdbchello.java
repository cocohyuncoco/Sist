package day0225;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class _04_Jdbchello {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);


	public void insertHello() {

		System.out.println("�̸���?");
		String name = sc.nextLine();

		System.out.println("�ּҴ�?");
		String addr = sc.nextLine();

		String sql="insert into hello values (seq_hello.nextval,'"+name+"','"+addr+"',sysdate)";


		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			stmt.execute(sql);			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	public void selectHello() {
		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;

		String sql="select * from hello";

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("[DDL & DML �̿��� JDBC ����]");
			System.out.println("��ȣ\t�̸�\t�ּ�\t����");
			while (rs.next()) {

				int num=rs.getInt(1);
				String name=rs.getString(2);
				String addr=rs.getString(3);
				String sdate=rs.getString(4);

				System.out.println(num+"\t"+name+"\t"+addr+"\t"+sdate);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public void deleteHello() {

		System.out.println("������ �̸��� �Է����ּ���");
		String name=sc.nextLine();

		String sql="delete from hello where name='"+name+"'";

		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			//stmt.execute(sql);

			//�̸��� ������� 0��ȯ
			int n = stmt.executeUpdate(sql);

			if (n==0) {
				System.out.println(name+"���� ��ܿ� �����ϴ�");
			}else {
				System.out.println(name+"���� ��ܿ��� �����߽��ϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	public void updateHello() {
		
		System.out.println("������ ��� ��ȣ��?"); 
		int num=Integer.parseInt(sc.nextLine());

		System.out.println("������ �̸��Է�");
		String name=sc.nextLine();

		System.out.println("������ �ּ��Է�");
		String addr=sc.nextLine();

		System.out.println("������ ������?"); 
		String sdate=sc.nextLine();

		//sql���� ���� �־���Ѵ�. 
		String sql="update hello set name='"+name+"',addr='"+addr+"',sdate='"+sdate+"' where num="+num;

		Connection conn=db.getOracle();
		Statement stmt= null;

		try {
			stmt=conn.createStatement();

			int a=stmt.executeUpdate(sql);

			if (a==0) {
				System.out.println("������ �����Ͱ� �������� ����");
			}else {
				System.out.println("**�����Ǿ����ϴ�**");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}



	}

	public void professor() {
		
		
		Scanner sc = new Scanner(System.in);

		int n=0;

		while (true) {
			System.out.println("[DDL & DML �̿��� JDBC ����]");
			System.out.println("1.insert  2.select  3.update  4.delete  9.exit");


			n=Integer.parseInt(sc.nextLine());

			if (n==1) {
				insertHello();
			}else if (n==2) {
				selectHello();
			}else if (n==3) {
				updateHello();
			}else if (n==4) {
				deleteHello();
			}else if (n==9) {
				System.out.println("�����մϴ�");
				break; //�극��ũ�� �Ƚ��ָ� ���ѷ��� ���Ƽ� �극��ũ������ ���ذ�
			}
		}
	}
	////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_04_Jdbchello jdbc = new _04_Jdbchello();
		jdbc.professor();


	}

}
