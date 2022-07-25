package day0302;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class _01_JdbcMystudent {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	//insert
	public void insertStudent() {

		String name,hp,sql; 
		int num, age;

		System.out.print("your name?");
		name =sc.nextLine();

		System.out.print("your HP?");
		hp =sc.nextLine();

		System.out.print("your age?");
		age = Integer.parseInt(sc.nextLine());

		sql="insert into mystudent values (seq1.nextval,'"+name+"','"+hp+"',"+age+",sysdate)";
		System.out.println(sql);

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt=conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println("insert : DB�� �߰�����");
			}else {
				System.out.println("insert : DB�� �߰�����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}


	//write
	public void writeStudent() {

		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;

		String sql="select * from mystudent";

		System.out.println("-------------------------------------------");
		System.out.println("<2.���>");
		System.out.println("������\t�̸�\t�ڵ���\t����\t���Գ�¥");


		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			//�������� ���� while...�ϳ��� ��� if
			while (rs.next()) {
				//�����͸� ������ ���¹�� (�÷��� or �ε�����ȣ)
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				Date sdate = rs.getDate(5);

				System.out.println(num+"\t"+name+"\t"+hp+"\t"+age+"\t"+sdate);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}

	}
	
	
	//delete
	public void deleteStudent() {

		Connection conn = db.getOracle();
		Statement stmt = null;

		System.out.println("������ �׸��� ��ȣ�� �Է����ּ���");
		int num = Integer.parseInt(sc.nextLine());

		String sql="delete from mystudent where num='"+num+"'";

		try {
			stmt=conn.createStatement();

			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println(num+"�� �׸񿡼� ���� �Ϸ�");
			}else {
				System.out.println(num+"�� �׸� �����ϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
}
	
	
	//update
	public void updateStudent() {

		System.out.println("�ٲٰ� ���� �׸� ��ȣ�� �Է�");
		int num  = Integer.parseInt(sc.nextLine());

		System.out.println("���ο� �ڵ�����ȣ �Է�");
		String hp  = sc.nextLine();

		System.out.println("���ο� ���� �Է�");
		int age  = Integer.parseInt(sc.nextLine());

		String sql="update mystudent set hp='"+hp+"', age="+age+" where num="+num;

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			int n = stmt.executeUpdate(sql);
			if (n==1) {
				System.out.println(num+"�� ���� �Ǿ����ϴ�");
			}else {
				System.out.println(num+"��ȣ�� �����Ͱ� �����ϴ�");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	
///////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_01_JdbcMystudent jdbc = new _01_JdbcMystudent();
		Scanner sc = new Scanner(System.in);
		
		int n;

		//while, swich
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("**�л�����**");
			System.out.println("1.�Է�\t2.���\t3.����\t4.����\t9.����");
			n = Integer.parseInt(sc.nextLine());

			if (n==9) {
				System.out.println("�����մϴ�");
				break;
			}
			
			switch (n) {
			case 1:
				jdbc.insertStudent();
				break;
			case 2:
				jdbc.writeStudent();
				break;
			case 3:
				jdbc.updateStudent();
				break;
			case 4:
				jdbc.deleteStudent();
				break;
			default:
				break;
			}
			
		}




	}

}
