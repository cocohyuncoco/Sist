package day0302;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//0302_JDBCMember ����


public class _02_jdbcMember {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertMember() {

		System.out.print("�̸�->");
		String name = sc.nextLine();

		System.out.print("�μ�->");
		String buseo = sc.nextLine();

		System.out.print("����->");
		String position = sc.nextLine();

		System.out.print("����->");
		String gender = sc.nextLine();

		System.out.print("���޿�->");
		int pay = Integer.parseInt(sc.nextLine());

		System.out.print("���ʽ�->");
		int bonus = Integer.parseInt(sc.nextLine());
		
		
		String sql="insert into mymember values (seq_mem.nextval, '"+name+"', '"+buseo+"', '"+position+"', '"+gender+"', '"+pay+"', '"+bonus+"')";
		//System.out.println(sql);

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println("DB �߰� �Ϸ�");
			}else {
				System.out.println("DB �߰� ����");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}

	public void deleteMember() {

		System.out.print("������ �����ȣ->");
		int sno = Integer.parseInt(sc.nextLine());

		String sql = "delete from mymember where sno='"+sno+"'";

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println(sno+"�� DB���� ���� �Ϸ�");
			}else {
				System.out.println(sno+"�� DB�� �����ϴ�");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}

	public void updateMember() {

		System.out.print("������ �����ȣ->");
		int sno = Integer.parseInt(sc.nextLine());

		System.out.print("���ο� �μ�->");
		String buseo = sc.nextLine();

		System.out.print("���ο� ����->");
		String position = sc.nextLine();

		System.out.print("���ο� �޿�->");
		String pay = sc.nextLine();

		System.out.print("���ο� ���ʽ�->");
		String bonus = sc.nextLine();

		String sql="update mymember set buseo='"+buseo+"',position='"+position+"',pay='"+pay+"',bonus='"+bonus+"' where sno="+sno;

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println("DB ���� �Ϸ�");
			}else {
				System.out.println("DB ���� ���� : �����Ͱ� �����ϴ�");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}

	public void writeMember() {

		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;

		
		String sql="select sno, name, buseo, position, gender, To_char(pay, 'L999,999,999'), To_char(bonus, 'L999,999,999') from mymember";
		//String sql="select * from mymember where pay To_char(pay, 'L999,999,999')";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("�����ȣ\t�����\t�μ�\t����\t����\t���޿�\t���ʽ�");
			while (rs.next()) {

				int sno = rs.getInt(1);
				String name = rs.getString(2);
				String buseo = rs.getString(3);
				String position = rs.getString(4); 
				String gender = rs.getString(5);
				String pay = rs.getString(6);
				String bonus = rs.getString(7);

				System.out.println(sno+"\t"+name+"\t"+buseo+"\t"+position+"\t"+gender+"\t"+pay+"\t"+bonus);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public void serchName() {
		
		System.out.print("ã�� �̸�(�Ϻε� ����)->");
		String sname = sc.nextLine();
		
		String sql="select sno, name, buseo, position, gender, To_char(pay, 'L999,999,999'), To_char(bonus, 'L999,999,999') from mymember where name like '%"+sname+"%'";
		//String sql="select * from mymember where name like '%"+sname+"%'";
		
		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("�����ȣ\t�����\t�μ�\t����\t����\t���޿�\t���ʽ�");
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int sno = rs.getInt(1);
				String name = rs.getString(2);
				String buseo = rs.getString(3);
				String position = rs.getString(4); 
				String gender = rs.getString(5);
				String pay = rs.getString(6);
				String bonus = rs.getString(7);

				System.out.println(sno+"\t"+name+"\t"+buseo+"\t"+position+"\t"+gender+"\t"+pay+"\t"+bonus);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}


	public void process() {
			
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
				
		while (true) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.��������Է� \t 2.��ü������ \t 3.������� \t 4.������� \t 5.�̸��˻� \t 9.�ý�������");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==1) {
				insertMember();
			}else if (n==2) {
				writeMember();
			}else if (n==3) {
				deleteMember();
			}else if (n==4) {
				updateMember();
			}else if (n==5) {
				serchName();
			}else if (n==9) {
				System.out.println("--�����մϴ�--");
				break;
			}
		}
	}
	//////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_02_jdbcMember jdbc = new _02_jdbcMember();
		 jdbc.process();
	}

}
