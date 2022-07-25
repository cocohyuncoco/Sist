package day0121;

import java.util.Scanner;

public class SwitchEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("input: 1");
			break;
		case 2:
			System.out.println("input: 2");
			break;
		case 3:
			System.out.println("input: 3");
			break;
		default:
			System.out.println("not: 1,2,3");
			break;
		}
		
		// switch 문을 통해서 홀수인지, 짝수인지
		
		switch (num%2) {
		case 0:
			System.out.println(num+"은 짝수");
			break;
		case 1:
			System.out.println(num+"은 홀수");
			break;
		default:
			break;
		}
		
		//if문 일때의 조건문
		if(num%2==0) {
			System.out.println(num+"은 짝수");}
		else {
			System.out.println(num+"은 홀수");}
		
		
	}

}
