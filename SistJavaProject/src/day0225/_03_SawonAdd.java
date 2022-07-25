package day0225;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



//★ 입력받은 데이터 DB에 추가하기 ★
public class _03_SawonAdd {

	//전역변수
	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	//인설트 할때는 꼭 테이블컬럼 순서대로 num, name, gender,
	//★ DB Insert 하는거 정말정말 중요하니까 잘보기 ★

	//DB에 테이블 추가하기
	public void InsertSawon() {

		System.out.println("**사원명추가하기**");
		System.out.println("사원명?");
		String name = sc.nextLine();

		System.out.println("부서명?");
		String buseo = sc.nextLine();

		System.out.println("성별은?(남자/여자)");
		String gender = sc.nextLine();

		System.out.println("월급여?");
		int pay = Integer.parseInt(sc.nextLine());

		//자바에서 작성한걸 db에 담으려면 Connection,Statement
		//★이 안에다 적는거 잘봐라★ 
		//오라클에서 문자 담을려면 ' ' <-안에 담았어서 이렇게 씀
		String sql="insert into sawon values (seq_sawon.nextval,'"+name+"','"+gender+"','"+buseo+"',"+pay+")";

		//insert into sawon valuse (seq_sawon.nextval, '수지','여자','홍보부',340000);
		System.out.println(sql); //콘솔로 확인. sql문 잘못썻는지 아닌지 확인가능

		//오라클에 연결
		Connection conn=db.getOracle();
		Statement stmt=null;

		try {

			stmt=conn.createStatement();
			stmt.execute(sql); //sql문 실행(insert,delete,update...execute() or excuteUpdate() 둘중하나 사용)
			//stmt.executeUpdate(sql);		
			//반환받길 원하면 이렇게 executeUpdate만 된다
			//int a = stmt.executeUpdate(sql);
			//System.out.println(a);

			System.out.println("DB에 추가되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}//DB에 테이블 추가하기 끝

	//테이블 수정 update(사원번호 입력후 이름,부서,급여, 변경가능)
	private void updateSawon() {

		System.out.println("수정할 사원번호는?"); 
		int num=Integer.parseInt(sc.nextLine());

		System.out.println("수정할 이름입력");
		String name=sc.nextLine();

		System.out.println("수정할 부서입력");
		String buseo=sc.nextLine();

		System.out.println("수정할 급여는?"); 
		int pay=Integer.parseInt(sc.nextLine());

		//sql문은 여기 있어야한다. 
		String sql="update sawon set name='"+name+"',buseo='"+buseo+"',pay="+pay+" where num="+num;

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
	}//테이블 수정 update 끝


	//DB테이블 삭제 메서드
	//삭제...사원명을 입력하면 삭제
	public void deleteSawon() {

		System.out.println("삭제할 사원명을 입력해주세요");
		String name=sc.nextLine();

		//delete from sawon where name='김선호' <-이렇게 나오게 sql문 작성
		String sql="delete from sawon where name='"+name+"'";
		//System.out.println(sql);

		Connection conn=db.getOracle();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			//stmt.execute(sql);

			//이름이 없을경우 0반환
			int n = stmt.executeUpdate(sql);

			if (n==0) {
				System.out.println(name+"님은 사원명단에 없습니다");
			}else {
				System.out.println(name+"님을 명단에서 삭제했습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}//DB테이블 삭제 메서드 끝


	//DB 테이블 조회 메서드
	public void searchName() {

		System.out.println("검색할 사원은 누구입니까?(일부도 가능)");
		String sName=sc.nextLine();

		String sql="select * from sawon where name like '%"+sName+"%'";	

		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("**검색사원명단**");
			System.out.println("사원번호\t사원명\t성별\t부서명\t월급여");
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

	}//DB 테이블 조회 메서드 끝


	//DB테이블 출력 메서드
	public void writeSawon() {

		Connection conn=db.getOracle();
		Statement stmt=null;
		ResultSet rs=null;

		String sql="select * from sawon order by num";

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			System.out.println("**전체사원명단**");
			System.out.println("사원번호\t사원명\t성별\t부서명\t월급여");
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
	}	//DB테이블 출력 메서드 끝

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		_03_SawonAdd oradb =new _03_SawonAdd();
		//oradb.InsertSawon();		
		Scanner sc = new Scanner(System.in);

		int n=0;


		while (true) {
			System.out.println("**Oracle DB 연습문제**");
			System.out.println("1.insert  2.select  3.update  4.delete  5.사원검색  9.exit");


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
				System.out.println("종료합니다");
				break; //브레이크문 안써주면 무한루프 돌아서 브레이크문부터 써준것
			}
		}













	}

}
