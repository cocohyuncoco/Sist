package day0204;


import java.util.Scanner;

class Sist{
	
	static String school = "쌍용고등학교";
	private String name;
	private int java, oracle;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
	
	//총점
	public int total() {
		return java+oracle;
	}
	
	//평균
	public double average() {
		return total()/2.0;
	}
	
	//장학생여부
	public String pung() {
		if (average()>=90) {
			return "장학생";
		}else if(average()>=80) {
			return "합격";
		}else {
			return "불합격";
		}
	}
	
}

////////////////////////////////////////
public class QuizWeekStu {
	
	public static void write(Sist s) {
		System.out.println(s.getName()+"\t"+s.getJava()+"\t"+s.getOracle()+
				"\t"+s.total()+"\t"+s.average()+"\t"+s.pung());
	}
	
	
///////////////////MAIN/////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int inwon;
		Sist[] sist;
		String name;
		int java, oracle;
		
		//인원수 입력받기
		System.out.println("학생인원");
		inwon = Integer.parseInt(sc.nextLine());
		
		//인원수 배열에 저장
		sist = new Sist[inwon];
		
		//인원 데이터 입력
		for (int i=0;i<inwon;i++) {
			//객체생성
			sist[i]=new Sist();
			//입력받기
			System.out.println(i+"번 학생이름");
			name = sc.nextLine();
			System.out.println("자바점수 와 오라클점수");
			java = Integer.parseInt(sc.nextLine());
			oracle = Integer.parseInt(sc.nextLine());
			System.out.println();
			//값 객체에 저장
			sist[i].setName(name);
			sist[i].setJava(java);
			sist[i].setOracle(oracle);
			
		}
		
		System.out.println("**결과출력**");
		System.out.println("학교명:"+Sist.school);
		System.out.println("학생명\tJAVA\tORACLE\t총점\t평균\t평가");
		System.out.println("============================================");
		
		for (Sist s:sist) {
			write(s);
			
		}
			
	
	}

}
