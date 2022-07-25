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
				System.out.println("insert : DB에 추가성공");
			}else {
				System.out.println("insert : DB에 추가실패");
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
		System.out.println("<2.출력>");
		System.out.println("시퀀스\t이름\t핸드폰\t나이\t가입날짜");


		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			//여러개일 경우는 while...하나일 경우 if
			while (rs.next()) {
				//데이터를 가지고 오는방법 (컬럼명 or 인덱스번호)
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

		System.out.println("삭제할 항목의 번호를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());

		String sql="delete from mystudent where num='"+num+"'";

		try {
			stmt=conn.createStatement();

			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println(num+"을 항목에서 삭제 완료");
			}else {
				System.out.println(num+"은 항목에 없습니다");
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

		System.out.println("바꾸고 싶은 항목 번호를 입력");
		int num  = Integer.parseInt(sc.nextLine());

		System.out.println("새로운 핸드폰번호 입력");
		String hp  = sc.nextLine();

		System.out.println("새로운 나이 입력");
		int age  = Integer.parseInt(sc.nextLine());

		String sql="update mystudent set hp='"+hp+"', age="+age+" where num="+num;

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			int n = stmt.executeUpdate(sql);
			if (n==1) {
				System.out.println(num+"이 수정 되었습니다");
			}else {
				System.out.println(num+"번호의 데이터가 없습니다");
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
			System.out.println("**학생정보**");
			System.out.println("1.입력\t2.출력\t3.수정\t4.삭제\t9.종료");
			n = Integer.parseInt(sc.nextLine());

			if (n==9) {
				System.out.println("종료합니다");
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
