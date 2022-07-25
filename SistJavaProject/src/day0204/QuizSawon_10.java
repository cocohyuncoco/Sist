package day0204;

import java.util.Scanner;

class Sawon{
	
	private static String empName; //회사명
	private String name; //사원명
	private int pay; //급여
	private int sudang; //수당
	
	public static String getEmpName() {
		return empName;
	}
	public static void setEmpName(String empName) {
		Sawon.empName = empName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
		
	//총수령액

		public int getNetPay() {
			int m=pay+sudang;
			return m;
		}
}
//////////////////////////////////
	public class QuizSawon_10 {

	public static void writeSawon(Sawon s) {
		
		System.out.println(s.getName()+"\t"+s.getPay()+"\t"+s.getSudang()+
				"\t"+s.getNetPay());
	}
	
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inwon;
		String empName;
		Sawon[]sawon;
		String name;
		int pay,sudang;
		
		
		System.out.println("회사이름입력");
		empName=sc.nextLine();
		
		//회사이름 static멤버 변수에 저장
		Sawon.setEmpName(empName);
		
		//총사원수
		System.out.println("총 사원수 입력");
		inwon = Integer.parseInt(sc.nextLine());
		
		//inwon수 만큼 SaWon배열 할당
		sawon = new Sawon[inwon];
		
		//입력
		for (int i=0;i<inwon;i++) {
			sawon[i]=new Sawon(); //객체생성
			System.out.println("사원명입력");
			name=sc.nextLine();
			
			System.out.println("월급여입력");
			pay = Integer.parseInt(sc.nextLine());
			
			System.out.println("수당입력");
			sudang = Integer.parseInt(sc.nextLine());
			
			//사원객체에 값 저장하기
			sawon[i].setName(name);
			sawon[i].setPay(pay);
			sawon[i].setSudang(sudang);
		}
		
		//출력
		System.out.println("회사명: "+Sawon.getEmpName());
		System.out.println("사원명\t기본급\t수당\t실수령");
		
		for (Sawon s:sawon) {
			writeSawon(s);
			
		}
		
		
		
	}

}
