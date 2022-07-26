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

		System.out.println("학생명은?");
		String name = sc.nextLine();

		System.out.println("자바 점수는?");
		int java = Integer.parseInt(sc.nextLine());

		System.out.println("오라클 점수는?");
		int oracle = Integer.parseInt(sc.nextLine());

		//Connection, Prepare
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		//일부만 insert..이런경우에 | 시퀀스, 이름, 자바, 오라클
		String sql="insert into sungjuk (num,name,java,oracle) values (seq_test.nextval,?,?,?)";


		try {
			pstmt = conn.prepareStatement(sql);

			//바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);

			//?바인딩 후 실행★ | 바인딩만 해놓고 실행안하는사람 많음
			pstmt.execute();
			System.out.println("**추가됨**");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}


	}


	//삭제 ...num 입력받아서 해당데이터 삭제됨..5번학생이 없으면 -5번학생은 존재하지않음-
	public void deleteSungjuk() {

		System.out.println("삭제할 번호 입력");
		int num = Integer.parseInt(sc.nextLine());

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String sql="delete from sungjuk where num=?";

		try {
			pstmt=conn.prepareStatement(sql);

			//바인딩
			pstmt.setInt(1, num);

			//실행
			int n = pstmt.executeUpdate();
			if (n==0) {
				System.out.println(num+"번 학생은 존재하지 않습니다");
			}else {
				System.out.println(num+"번 학생정보 삭제완료");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}


	//수정
	public void updateSungjuk() {

		System.out.println("수정할 번호 입력");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 자바 점수는?");
		int java = Integer.parseInt(sc.nextLine());
				
		System.out.println("수정할 오라클 점수는?");
		int oracle = Integer.parseInt(sc.nextLine());
				
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		String sql="update sungjuk set java=?,oracle=? where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setInt(1, java);
			pstmt.setInt(2, oracle);
			pstmt.setInt(3, num);
			
			//실행
			int n = pstmt.executeUpdate();
			if (n==1) {
				System.out.println("**수정 완료**");
			}else {
				System.out.println("학생이 존재하지 않습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
				
		
	}

	//출력
	public void whileSungjuk() {

		//계산메서드 호출
		this.caclTotAvg();
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from sungjuk order by num";
		System.out.println("**학생 성적출력**");
		System.out.println();
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균");
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
	
	//총점과 평균만 다시 계산하는 메서드
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
			System.out.println("1.학생성적추가 2.학생정보삭제 3.학생정보수정 4.학생정보출력 9.종료");
			
			int num = Integer.parseInt(sc.nextLine());
			
			if (num==9) {
				System.out.println("프로그램 종료");
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
