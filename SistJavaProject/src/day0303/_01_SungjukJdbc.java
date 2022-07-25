package day0303;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class _01_SungjukJdbc {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertSungjuk() {

		System.out.println("�л�����?");
		String name = sc.nextLine();

		System.out.println("�ڹ� ������?");
		int java = Integer.parseInt(sc.nextLine());

		System.out.println("����Ŭ ������?");
		int oracle = Integer.parseInt(sc.nextLine());

		//Connection, Prepare
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		//�Ϻθ� insert..�̷���쿡 | ������, �̸�, �ڹ�, ����Ŭ
		String sql="insert into sungjuk (num,name,java,oracle) values (seq_test.nextval,?,?,?)";


		try {
			pstmt = conn.prepareStatement(sql);

			//���ε�
			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);

			//?���ε� �� ����� | ���ε��� �س��� ������ϴ»�� ����
			pstmt.execute();
			System.out.println("**�߰���**");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}


	}


	//���� ...num �Է¹޾Ƽ� �ش絥���� ������..5���л��� ������ -5���л��� ������������-
	public void deleteSungjuk() {

		System.out.println("������ ��ȣ �Է�");
		int num = Integer.parseInt(sc.nextLine());

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String sql="delete from sungjuk where num=?";

		try {
			pstmt=conn.prepareStatement(sql);

			//���ε�
			pstmt.setInt(1, num);

			//����
			int n = pstmt.executeUpdate();
			if (n==0) {
				System.out.println(num+"�� �л��� �������� �ʽ��ϴ�");
			}else {
				System.out.println(num+"�� �л����� �����Ϸ�");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}


	//����
	public void updateSungjuk() {

		System.out.println("������ ��ȣ �Է�");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("������ �ڹ� ������?");
		int java = Integer.parseInt(sc.nextLine());
				
		System.out.println("������ ����Ŭ ������?");
		int oracle = Integer.parseInt(sc.nextLine());
				
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		String sql="update sungjuk set java=?,oracle=? where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//���ε�
			pstmt.setInt(1, java);
			pstmt.setInt(2, oracle);
			pstmt.setInt(3, num);
			
			//����
			int n = pstmt.executeUpdate();
			if (n==1) {
				System.out.println("**���� �Ϸ�**");
			}else {
				System.out.println("�л��� �������� �ʽ��ϴ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
				
		
	}

	//���
	public void whileSungjuk() {

		//���޼��� ȣ��
		this.caclTotAvg();
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from sungjuk order by num";
		System.out.println("**�л� �������**");
		System.out.println();
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\t����\t���");
		System.out.println("--------------------------------------------");
		
		try {
			pstmt = conn.prepareStatement(sql);		
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getInt("java")+"\t"
						+rs.getInt("oracle")+"\t"
						+rs.getInt("total")+"\t"
						+rs.getDouble("average"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
			
		}
				
		
	}
	
	//������ ��ո� �ٽ� ����ϴ� �޼���
	public void caclTotAvg() {
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		//sql...update...total,average
		String sql="update sungjuk set total=java+oracle, average=(java+oracle)/2";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//process
	public void process() {

		while (true) {
			System.out.println("1.�л������߰� 2.�л��������� 3.�л��������� 4.�л�������� 9.����");
			
			int num = Integer.parseInt(sc.nextLine());
			
			if (num==9) {
				System.out.println("���α׷� ����");
				break;
			}
			
			switch (num) {
			case 1:
				this.insertSungjuk();
				break;
			case 2:
				this.deleteSungjuk();
				break;
			case 3:
				this.updateSungjuk();
				break;
			case 4:
				this.whileSungjuk();
				break;
			default:
			
				break;
			}
			
		}
			
		
	}
	/////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_01_SungjukJdbc su = new _01_SungjukJdbc();
		su.process();
	}
}
