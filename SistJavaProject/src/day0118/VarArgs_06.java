package day0118;

public class VarArgs_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수를 주어서 /**/
		/*
		 내 이름은 임현정
		 자바점수는 88
		 오라클점수는 88
		 두 과목의 합계는 176점 입니다
		 */
		
		//1. 변수선언
		String name = args[0];
		int java = Integer.parseInt(args[1]);
		int oracle=Integer.parseInt(args[2]);
		
		//2. 계산
		int result=java+oracle;
		
		//3. 출력
		System.out.println("내 이름은 "+name+" 자바 점수는 "+java+" 오라클점수는 "+oracle+" 두 과목의 합계는 "+result+"입니다");
		System.out.println("내이름은 "+name);
		System.out.println("자바점수는 "+java);
		System.out.println("오라클점수는 "+oracle);
		System.out.println("두과목의 합계는 "+result+"입니다");
	}

}
