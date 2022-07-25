package day0120;

public class IfTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		
		//한줄이면 블럭괄호 필요없음
//		
//		if(n>5) {
//			System.out.println("n은 5보다 크다");
//			}//if문 끝
//			System.out.println("조건이 안맞는다. 프로그램종료");
//		
//		if(n%2==0) {
//			System.out.println(n+"은 짝수다");
//		}else {
//			System.out.println(n+"은 홀수다");
//		}
		
		
		//학점 구하기 - if문 이용한 알고리즘 문제
		// if~else if를 통해서 학점구하기
		// 학점 종류 A,B,C,D,F 
		
//		char grade = 'A';
		int score = 100;
//		
//		if(score>=90)
//			grade='A';
//			else if(score>=80) 
//				grade='B';
//			else if(score>=70) 
//				grade='C';
//			else if(score>=60) 
//				grade='D';
//			else
//				grade='F';
//	
		
		// 삼항연산자 이용하여 학점 구하기
		String grade;
		
		grade=score>=90?"A":
				score>=80?"B":
					score>=70?"C":
						score>=60?"D":"F";
				
		//최종출력
		System.out.print("내 학점은 "+grade+"입니다");
		
	}
}
