package day0125;

import java.util.Scanner;

public class QuizOperEx_05 {
	//오늘 공부한것들 퀴즈 <6교시>
	public static void ex_01() {
		/*
		 * for문으로 10번 질문 할것
		 * 1. 21
		 * 2. -23
		 * 
		 * 
		 * 10. 88
		 * 
		 * 양수개수:4개
		 * 음수개수:6개
		 * 0이 있다면 5개 없으면 6개
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		int pcnt=0; //양수 개수
		int ncnt=0; //음수 개수
		
		for (int i=1;i<=10;i++) {
			System.out.print(i+": ");
			su=sc.nextInt();
			if (su>0) { //0보다 크면 양수
				pcnt++;
			}else if(su<0) { //0보다 작으면 음수
				ncnt++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("양수개수: "+pcnt);
		System.out.println("음수개수: "+ncnt);
	}
	
	
	
	public static void ex_02() {
		
		/*
		 * while(true)문 이용할것
		 * continue를 이용하여 1~100까지의 짝수의 합을 구하시어
		 * 1~100까지의 짝수의 합: ****
		 */
		
		int a=0;
		int sum=0;
		
		while (true) {
			a++;
			//홀수를 빼기위한 조건문
			if (a%2==1) 
				continue; //홀수면 첫줄로 이동
			sum+=a; //짝수인 경우에만 합을 구한다
			if(a==100)
				break;
		}
		System.out.print("1~100까지의 짝수의 합: "+sum);
	}
	
	public static void ex_03() {
		
		/*
		 * while(true)문을 써서 1~100까지의 3의 배수의 개수를 구하시오 (자유롭게)
		 * 3의배수 개수:33
		 */
		
		int i=0;
		int z=0;
		
		while (true) {
			i++;
			//3의 배수이면 z가 1증가 조건문
			if (i%3==0)
				z++;
			else if(i==100)
				break;
		}
		System.out.println("3의 배수개수: "+z);
	}

	
	public static void ex_04() {
		
		/*
		 * while(true)문을 이용할것
		 * 1~10까지 팩토리얼 구할것
		 * 
		 * 
		 * 8!=****
		 * 9!=****
		 * 10!=****
		 */
		
		int pac=1;
		int i=0;
		
		while (true) {
			i++;
			pac*=i;
			System.out.println(i+"!="+pac);
			if(i==10)
			break;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex_01();
		//ex_02();
		//ex_03();
		ex_04();
	}

}
