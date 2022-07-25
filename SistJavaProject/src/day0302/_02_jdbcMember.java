package day0302;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//0302_JDBCMember 숙제


public class _02_jdbcMember {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertMember() {

		System.out.print("이름->");
		String name = sc.nextLine();

		System.out.print("부서->");
		String buseo = sc.nextLine();

		System.out.print("직급->");
		String position = sc.nextLine();

		System.out.print("성별->");
		String gender = sc.nextLine();

		System.out.print("월급여->");
		int pay = Integer.parseInt(sc.nextLine());

		System.out.print("보너스->");
		int bonus = Integer.parseInt(sc.nextLine());
		
		
		String sql="insert into mymember values (seq_mem.nextval, '"+name+"', '"+buseo+"', '"+position+"', '"+gender+"', '"+pay+"', '"+bonus+"')";
		//System.out.println(sql);

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println("DB 추가 완료");
			}else {
				System.out.println("DB 추가 실패");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}

	public void deleteMember() {

		System.out.print("삭제할 사원번호->");
		int sno = Integer.parseInt(sc.nextLine());

		String sql = "delete from mymember where sno='"+sno+"'";

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println(sno+"을 DB에서 삭제 완료");
			}else {
				System.out.println(sno+"은 DB에 없습니다");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}

	}

	public void updateMember() {

		System.out.print("수정할 사원번호->");
		int sno = Integer.parseInt(sc.nextLine());

		System.out.print("새로운 부서->");
		String buseo = sc.nextLine();

		System.out.print("새로운 직위->");
		String position = sc.nextLine();

		System.out.print("새로운 급여->");
		String pay = sc.nextLine();

		System.out.print("새로운 보너스->");
		String bonus = sc.nextLine();

		String sql="update mymember set buseo='"+buseo+"',position='"+position+"',pay='"+pay+"',bonus='"+bonus+"' where sno="+sno;

		Connection conn = db.getOracle();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);

			if (n==1) {
				System.out.println("DB 수정 완료");
			}else {
				System.out.println("DB 수정 실패 : 데이터가 없습니다");
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
			
			System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스");
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
		
		System.out.print("찾을 이름(일부도 가능)->");
		String sname = sc.nextLine();
		
		String sql="select sno, name, buseo, position, gender, To_char(pay, 'L999,999,999'), To_char(bonus, 'L999,999,999') from mymember where name like '%"+sname+"%'";
		//String sql="select * from mymember where name like '%"+sname+"%'";
		
		Connection conn = db.getOracle();
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스");
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
			System.out.println("1.사원정보입력 \t 2.전체사원출력 \t 3.사원삭제 \t 4.사원수정 \t 5.이름검색 \t 9.시스템종료");
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
				System.out.println("--종료합니다--");
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
