package day0225;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



//�� �Է¹��� ������ DB�� �߰��ϱ� ��
public class _03_SawonAdd {

	//��������
	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	//�μ�Ʈ �Ҷ��� �� ���̺��÷� ������� num, name, gender,
	//�� DB Insert �ϴ°� �������� �߿��ϴϱ� �ߺ��� ��

	//DB�� ���̺� �߰��ϱ�
	public void InsertSawon() {

		System.out.println("**������߰��ϱ�**");
		System.out.println("�����?");
		String name = sc.nextLine();

		System.out.println("�μ���?");
		String buseo = sc.nextLine();

		System.out.println("������?(����/����)");
		String gender = sc.nextLine();

		System.out.println("���޿�?");
		int pay = Integer.parseInt(sc.nextLine());

		//�ڹٿ��� �ۼ��Ѱ� db�� �������� Connection,Statement
		//���� �ȿ��� ���°� �ߺ���� 
		//����Ŭ���� ���� �������� ' ' <-�ȿ� ��Ҿ �̷��� ��
		String sql="insert into sawon values (seq_sawon.nextval,'"+name+"','"+gender+"','"+buseo+"',"+pay+")";

		//insert into sawon valuse (seq_sawon.nextval, '����','����','ȫ����',340000);
		System.out.println(sql); //�ַܼ� Ȯ��. sql�� �߸������� �ƴ��� Ȯ�ΰ���

		//����Ŭ�� ����
		Connection conn=db.getOracle();
		Statement stmt=null;

		try {

			stmt=conn.createStatement();
			stmt.execute(sql); //sql�� ����(insert,delete,update...execute() or excuteUpdate() �����ϳ� ���)
			//stmt.executeUpdate(sql);		
			//��ȯ�ޱ� ���ϸ� �̷��� executeUpdate�� �ȴ�
			//int a = stmt.executeUpdate(sql);
			//System.out.println(a);

			System.out.println("DB�� �߰��Ǿ����ϴ�");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}//DB�� ���̺� �߰��ϱ� ��

	//���̺� ���� update(�����ȣ �Է��� �̸�,�μ�,�޿�, ���氡��)
	private void updateSawon() {

		System.out.println("������ �����ȣ��?"); 
		int num=Integer.parseInt(sc.nextLine());

		System.out.println("������ �̸��Է�");
		String name=sc.nextLine();

		System.out.println("������ �μ��Է�");
		String buseo=sc.nextLine();

		System.out.println("������ �޿���?"); 
		int pay=Integer.parseInt(sc.nextLine());

		//sql���� ���� �־���Ѵ�. 
		String sql="update sawon set name='"+name+"',buseo='"+buseo+"',pay="+pay+" where num="+num;

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
	}//���̺� ���� update ��


	//DB���̺� ���� �޼���
	//����...������� �Է��ϸ� ����
	public void deleteSawon() {

		System.out.println("������ ������� �Է����ּ���");
		String name=sc.nextLine();

		//delete from sawon where name='�輱ȣ' <-�̷��� ������ sql�� �ۼ�
		String sql="delete from sawon where name='"+name+"'";
		//System.out.println(sql);

		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			//stmt.execute(sql);

			//�̸��� ������� 0��ȯ
			int n = stmt.executeUpdate(sql);

			if (n==0) {
				System.out.println(name+"���� �����ܿ� �����ϴ�");
			}else {
				System.out.println(name+"���� ��ܿ��� �����߽��ϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}//DB���̺� ���� �޼��� ��


	//DB ���̺� ��ȸ �޼���
	public void searchName() {

		System.out.println("�˻��� ����� �����Դϱ�?(�Ϻε� ����)");
		String sName=sc.nextLine();

		String sql="select * from sawon where name like '%"+sName+"%'";	

		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("**�˻�������**");
			System.out.println("�����ȣ\t�����\t����\t�μ���\t���޿�");
			while (rs.next()) {
				int num=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String buseo=rs.getString(4);
				int pay=rs.getInt(5);

				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}

	}//DB ���̺� ��ȸ �޼��� ��


	//DB���̺� ��� �޼���
	public void writeSawon() {

		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;

		String sql="select * from sawon order by num";

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("**��ü������**");
			System.out.println("�����ȣ\t�����\t����\t�μ���\t���޿�");
			while (rs.next()) {

				int num=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String buseo=rs.getString(4);
				int pay=rs.getInt(5);

				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}	//DB���̺� ��� �޼��� ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		_03_SawonAdd oradb =new _03_SawonAdd();
		//oradb.InsertSawon();		
		Scanner sc = new Scanner(System.in);

		int n=0;


		while (true) {
			System.out.println("**Oracle DB ��������**");
			System.out.println("1.insert  2.select  3.update  4.delete  5.����˻�  9.exit");


			n=Integer.parseInt(sc.nextLine());

			if (n==1) {
				oradb.InsertSawon();
			}else if (n==2) {
				oradb.writeSawon();
			}else if (n==3) {
				oradb.updateSawon();
			}else if (n==4) {
				oradb.deleteSawon();
			}else if (n==5) {
				oradb.searchName();
			}else if (n==9) {
				System.out.println("�����մϴ�");
				break; //�극��ũ�� �Ƚ��ָ� ���ѷ��� ���Ƽ� �극��ũ������ ���ذ�
			}
		}













	}

}
