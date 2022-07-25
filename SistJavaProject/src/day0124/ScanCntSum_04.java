package day0124;

import java.util.Scanner;

public class ScanCntSum_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * while(true)을 이용할것
			 * 총 횟수와 입력한 값의 합을 구할것
			 * 숫자 0을 입력시 종료할것!!!
			 */
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum=0; //입력할 수, 합계
		int cnt=0; //갯수
		double avg=0;
		
		while (true) {
			System.out.println("숫자입력(종료:0)");
			su=sc.nextInt();
			
			if (su==0)				
			break;
			
			sum+=su;
			cnt++;
		}
		avg=(double)sum/cnt;
		System.out.println("총입력한 갯수:"+cnt);
		System.out.println("입력한 숫자의 값:"+sum);
		System.out.println("입력한 숫자의 평균"+avg);
		
	}

}
