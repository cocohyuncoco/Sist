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

		System.out.println("이름은?");
		String name = sc.nextLine();

		System.out.println("주소는?");
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

			System.out.println("[DDL & DML 이용한 JDBC 문제]");
			System.out.println("번호\t이름\t주소\t생일");
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

		System.out.println("삭제할 이름을 입력해주세요");
		String name=sc.nextLine();

		String sql="delete from hello where name='"+name+"'";

		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			//stmt.execute(sql);

			//이름이 없을경우 0반환
			int n = stmt.executeUpdate(sql);

			if (n==0) {
				System.out.println(name+"님은 명단에 없습니다");
			}else {
				System.out.println(name+"님을 명단에서 삭제했습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}

	public void updateHello() {
		
		System.out.println("수정할 사람 번호는?"); 
		int num=Integer.parseInt(sc.nextLine());

		System.out.println("수정할 이름입력");
		String name=sc.nextLine();

		System.out.println("수정할 주소입력");
		String addr=sc.nextLine();

		System.out.println("수정할 생일은?"); 
		String sdate=sc.nextLine();

		//sql문은 여기 있어야한다. 
		String sql="update hello set name='"+name+"',addr='"+addr+"',sdate='"+sdate+"' where num="+num;

		Connection conn=db.getOracle();
		Statement stmt= null;

		try {
			stmt=conn.createStatement();

			int a=stmt.executeUpdate(sql);

			if (a==0) {
				System.out.println("수정할 데이터가 존재하지 않음");
			}else {
				System.out.println("**수정되었습니다**");
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
			System.out.println("[DDL & DML 이용한 JDBC 문제]");
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
				System.out.println("종료합니다");
				break; //브레이크문 안써주면 무한루프 돌아서 브레이크문부터 써준것
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
