package day0225;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//�̿��� SQL�� ����
public class _05_PrepareSales {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);
	
	
	
	public void insertSangpum() {
		
		Connection conn=db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.println("1.���� 2.���� �� ��1?");
		int type =Integer.parseInt(sc.nextLine());
		
		System.out.println("��ǰ����?");
		String sangpum = sc.nextLine();
		
		System.out.println("������?");
		int su =Integer.parseInt(sc.nextLine());
		
		System.out.println("�ܰ���?");
		int dan =Integer.parseInt(sc.nextLine());
		
		//�̿��� SQL�� �ۼ�
		//prepareStatement ��ü�� �̿��� SQL���� �ۼ��Ҽ��ִ�. ������ ? ó�� �ؼ�.
		String sql="insert into sales values(seq1.nextval,?,?,?,?,sysdate)";
		
 
		try {
			
			pstmt=conn.prepareStatement(sql);
			//?������� ������ ���ε� �����ش�
						
			pstmt.setString(1, type==1?"����":"����");
			pstmt.setString(2, sangpum);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);
			
			int n = pstmt.executeUpdate();
			
			if (n==1) {
				System.out.println("��ǰ�߰� ����");
			}else{
				System.out.println("��ǰ�߰� ����");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//���
	public void writeSangpum() {
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from sales order by num asc";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("������\tŸ��\t��ǰ��\t����\t�ܰ�\t�԰���");
			System.out.println("------------------------------------------");
			
			while (rs.next()) {
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("type")+"\t"
						+rs.getString("sangpum")+"\t"
						+rs.getInt("su")+"\t"
						+rs.getInt("dan")+"\t"
						+rs.getDate("ipgo"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
}
	
	//����
	public void deleteSangpum() {
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.println("������ ��ȣ��?");
		int deletenum = Integer.parseInt(sc.nextLine());
		
		String sql="delete from sales where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			//? ���ε�..��������
			pstmt.setInt(1, deletenum);
			int n = pstmt.executeUpdate();
			
			if (n==1) {
				System.out.println("**��������**");
			}else {
				System.out.println("**��������**");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);			
		}
		
	}
	
	//����...������ �Է� �� ������ ������ �����Ҽ��ְ�...
	public void updateSangpum() {
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.println("������ ��ȣ��?");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("**������ ������ �Է�**");
		System.out.println("1.����\t2.���� �� 1");
		int type = Integer.parseInt(sc.nextLine());
				
		System.out.println("������ ��ǰ����?");
		String sang = sc.nextLine();
		
		System.out.println("������ ������?");
		int su = Integer.parseInt(sc.nextLine());
		
		System.out.println("������ �ܰ���?");
		int dan = Integer.parseInt(sc.nextLine());
		
		String sql="update sales set type=?,sangpum=?,su=?,dan=? where num=?";
	
		try {
			pstmt=conn.prepareStatement(sql);
			
			//5�� ? ������� 
			pstmt.setString(1, type==1?"����":"����");
			pstmt.setString(2, sang);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);
			pstmt.setInt(5, num);
			
			int n = pstmt.executeUpdate();
			
			if (n==1) {
				System.out.println("**��ǰ���� ����**");
			}else {
				System.out.println("**��ǰ���� ����**");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			System.out.println("update����"+e.getMessage());
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_05_PrepareSales pr = new _05_PrepareSales();
		//pr.insertSangpum();
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("**���ø޴�**");
			System.out.println("1.�߰�\t2.����\t3.����\t4.��ü���\t9.����");
			System.out.print("���ù�ȣ :");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==9) {
				System.out.println("***���α׷� ����***");
				break;
			}
			
			switch (n) {
			case 1:
				pr.insertSangpum();
				break;
			case 2:
				pr.deleteSangpum();
				break;
			case 3:
				pr.updateSangpum();
				break;
			case 4:
				pr.writeSangpum();
				break;
			default:
				break;
			}
		}
		
	}

}
