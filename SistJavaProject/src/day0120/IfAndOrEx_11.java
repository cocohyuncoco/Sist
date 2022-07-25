package day0120;

import java.util.Scanner;

public class IfAndOrEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q. 평균 점수가 60점 이상이거나 각각 점수가 40점 일때 합격ㄴ
		Scanner sc = new Scanner(System.in);
		
		String name;
		int oracle,java,eng;
		
		
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("3과목의 점수를 순서대로 입력하세요");
		oracle=sc.nextInt();
		java=sc.nextInt();
		eng=sc.nextInt();
		
		//계산
		double avg=(oracle+java+eng)/3.0;
		
		System.out.println("***시험결과 입니다***");
		System.out.println("오라클, 자바, 자바영어 점수= "+oracle+","+java+","+eng);
		System.out.println("평균 점수는 "+avg+"점");
		System.out.println("**합격조건은 평균이 60점 이상이고\n각 과목이 모두 40점 이상이면 합격***");
		System.out.println("=======================================");

		//if조건문
		if(avg>=60&&oracle>=40&&java>=40&&eng>=40) {
			System.out.print(name+" 님은 합격 입니다");
		}else {
			System.out.print("불합격");}
			
		
	}

}
