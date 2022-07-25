package day0124;

import java.util.Iterator;
import java.util.Scanner;

public class QuizWhileTrueGugu_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while(true)
		 * 1. 0이라고 입력시 종료
		 * 2. 단은 2~9단까지만 입력할것 (continue이용)
		 * 3. 출력
		 * 
		 * 단을 입력하시오 (종료:0):5
		 * [5단]
		 * 5X1=5
		 * 
		 * 5X9=45
		 * 단을 입력하시오 (종료:0):7
		 * [7단]
		 * 7X1=1
		 * 
		 * 7X9=63
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dan; //입력할 단
		
		while (true) {
			System.out.print("단을 입력하시오(종료:0):");
			dan=sc.nextInt();
			//종료조건
			if (dan==0) {
				System.out.print("프로그램을 종료합니다");
				break;
			}
			//잘못입력한 경우
			if (dan<2||dan>=9) {
				System.out.print("2~9사이의 숫자로 입력하세요");
				continue;
			}
			
			//구구단출력
			System.out.println("["+dan+"단]");
			for (int i=1;i<=9;i++) 
			{
				System.out.println(dan+"X"+i+"="+dan*i);
			}
			System.out.println();
		}
		
		
	}

}
