package day0120;

import java.util.Scanner;

public class QuizOper_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 월 급여를 입력하여 만원,천원,백원,십원,일원 의 갯수를 구하시오
		 * 
		 * 예) 785313
		 * 만원:78
		 * 천원: 5
		 * 백원: 9
		 * 십원: 1
		 * 일원: 3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		
		System.out.print("월 급여를 입력하세요: ");
		money = sc.nextInt();
		
		System.out.println("만원: "+(money/10000));
		System.out.println("천원: "+(money%10000)/1000);
		System.out.println("백원: "+(money%1000)/100);
		System.out.println("십원: "+(money%100)/10);
		System.out.println("일원: "+(money%10));
		
		
		
	}

}
