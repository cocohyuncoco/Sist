package day0125;

import java.util.Scanner;

public class ForWhileReview_01 {

	
	public static void test1() {
		//for문으로 1~5까지를 더하기
		int sum = 0;

		for (int i=1;i<=5;i++) {
			sum+=i; //sum=s
		}
		System.out.println("총합계는 "+sum+" 입니다");
	}
	//------------------------------------------------------------
	public static void test2() {
		//1~10까지의 홀수의 합
		int sum=0;
		
		for (int i=1;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("총합계는 "+sum);
	}
	//------------------------------------------------------------
	public static void test3() {
		//출력은 10까지의 합은 55입니다
		int sum=0;
		int i=1;
		
		for (;i<=10;i++) {
			sum+=i;
		}
		System.out.println((i-1)+"까지의 합은 "+sum+"입니다");
	}
	//------------------------------------------------------------
	public static void test4() {
		//1~100까지의 짝수의 합
		//while(true)
		
		int i=0;
		int sum=0;
		
		while (true) {
			i++;
			if (i%2==1) 
				continue;
			sum+=i;
			if (i==100) 
				break;
		}
			System.out.println("1~"+i+"까지의 합은"+sum);
		
	}
	//------------------------------------------------------------
		public static void ScanSum_05() {
			
			/*
			 * for, continue
			 * 3번째 점수까지 입력하면 합계 출력하시오
			 * 점수가 1~100이 아니면 잘못된 점수입니다 나오게
			 * 올바른 점수만 총 3번이 되야 한다
			 * 총합계:**
			 */
			Scanner sc = new Scanner(System.in);
			int sum=0;
			int score;
			
			for (int i=1;i<=3;i++) {
				System.out.print(i+"번째 점수를 입력하시오(1~100)");
				score=sc.nextInt();
				//continue 조건: 수행을 안하게 하는 조건
				if (score<1||score>100) {
					System.out.println("잘못 입력된 점수입니다. 다시 입력하세요");
					i--;
					continue;
				}
				sum+=score;
			}
			System.out.println("=============================");
			System.out.println("총합계: "+sum);
			
}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		ScanSum_05();
		
	}

}
