package day0204;


import java.util.Scanner;


class Emp{
	
	private String name; //직원명
	private int pay; //급여
	private int famsu; //가족수
	private int timesu; //초과시간
	
	
	//private은 기본적으로 캡슐화
	//각각의 setter, getter
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
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	
	//초과시간수당 리턴 메서드
	
	public int getTimeSudang() {
		
		int n=0;
		
		if (timesu>=5) {
			n=150000;
		}else {
			n=timesu*30000;
		}
		return n;
	}
	
	//가족수당 리턴 메서드
	public int getFamilySudang() {
		
		int s=0;
		
		if (famsu>=4) {
			s=200000;
		}else {
			s = famsu*5; 
		}
		return s;		
	}
	
	//총급여 리턴 메서드
	public int getTotalPay() {

		int tp =pay+getFamilySudang()+getTimeSudang();
		return tp;		
	}
	
	//제목
	public static void showTitle() {
		
		System.out.println("[쌍용전자 직원 급여현황]");
		System.out.println();
		System.out.println("사원명\t급여\t가족수\t초과시간\t가족수당\t시간수당\t총급여");
		System.out.println("--------------------------------------------");
	}

}

////////////////////////////////////
public class ScanArrayNewSalery_09 {

	
	//출력
	public static void writeEmp(Emp[] emp) {
		//제목부터 출력
		Emp.showTitle();
		
		for (Emp e:emp) {//포이치 문
			System.out.println(e.getName()+"\t"+e.getPay()+"\t"+e.getFamsu()+
					"\t"+e.getTimesu()+"\t"+e.getFamilySudang()+"\t"+e.getTimeSudang()
					+"\t"+e.getTotalPay());
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inwon; //인원수
		
		Emp[] emp; //생성해주기 위한 클래스
		
		System.out.println("입력할 직원수는?");
		inwon = Integer.parseInt(sc.nextLine());
		
		//배열할당
		emp=new Emp[inwon];
		
		//인원수만큼 데이타 입력
		for (int i=0;i<inwon;i++) {
			//emp생성
			emp[i]=new Emp();
			
			System.out.println("이름은?");
			String name=sc.nextLine();
			
			System.out.println("급여는?");
			int pay = Integer.parseInt(sc.nextLine());
			
			System.out.println("가족수는?");
			int fs = Integer.parseInt(sc.nextLine());
			
			System.out.println("초과근무 시간은?");
			int ts = Integer.parseInt(sc.nextLine());
			
			//setter로 emp클래스에 데이터 넣기. 지금은 null값
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamsu(fs);
			emp[i].setTimesu(ts);
			
		}
		
		//출력 
		writeEmp(emp);
		
		
		
	}

}
