package day0124;

import java.util.Scanner;

public class WhileTrueScan_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 합계를 구할 숫자를 입력하시오
		 * 10
		 * 1~10까지의 합:55
		 * 
		 * while(true)이용할것!!
		 */
		
		Scanner sc = new Scanner(System.in);
		int su; //입력할 수
		int i=0;
		int sum=0;
		
		System.out.println("합계를 구할 숫자를 입력하시오");
		su = sc.nextInt();
		
		while (true) {
			i++;//증가할 수
			sum+=i;
			//break문 없을시 무한루프
			if (i==su) {
				break;
			}
			System.out.println("1~"+su+"까지의 합:"+sum);
		}
		
		
	}

}
