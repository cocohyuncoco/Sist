package day0124;


import java.util.Scanner;

public class QuizForContinue_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 총 5개의 점수를 입력받아서 합계를 구한다(반복문에서 입력하기)
		 * 만약 1~100이 아닐경우 다시 입력받으시오 (continue사용)..반복문에서 잘못입력 빼기
		 * for문 안에 if문
		 * 1번점수: 88
		 * 2번점수: -77
		 * 잘못입력했어요
		 * 2번점수:99
		 * 
		 * 
		 * 5번점수:55
		 * 총점:****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int score; //입력할점수
		
		for (int i=1;i<=5;i++) {
			System.out.print(i+"번 점수");
			score=sc.nextInt();
			//조건문
			if (score<1||score>100) {
				System.out.println("잘못 입력했어요");
				i--;
				continue; //i++로 이동
			}
			sum+=score;
		}
		System.out.println("총점:"+sum);
		
	}

}
