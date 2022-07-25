package day0121;

import java.util.Scanner;

public class ifMax_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Q. 3수를 입력하여 더 큰 수를 출력하시오
		 * if문 or 삼항연산자 이용하여 결과 출력 할것
		 * 3개의 수 :10 20 30
		 * max=30 이라고 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z,max;
		
		System.out.println("3가지 수를 입력해주세요");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("==if문==");
		if(x>y&&x>z)
			max=x;
		else if(y>x&&y>z)
			max=y;
		else
			max=z;
		
		System.out.println("max= "+max);
		
		
		System.out.println("==삼항연산자==");
		
		max = x>y&&x>z?x:y>x&&y>z?y:z; //조건식? 참일때의 값:거짓일때의 값
				
		System.out.println("max= "+max);
		
		}

}
