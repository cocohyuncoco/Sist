package day0124;

import java.util.Scanner;

public class ScanForSum_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 n을 입력받으면 1부터 n까지의 합계구하기 (for문)
		//1부터 100까지의 합은 5050 입니다
		
		Scanner sc = new Scanner(System.in);
		
		int n; //입력할 수
		int sum=0; //합계
		
		System.out.println("합계를 구할 숫자 입력");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			sum+=i;
			System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
		}
	}

}
