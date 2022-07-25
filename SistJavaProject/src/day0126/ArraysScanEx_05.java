package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysScanEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열의 범위만큼 입력후 출력해보자
		//입력후 출력시 입력한 숫자의 합을 구해보자
		
		Scanner sc = new Scanner(System.in);
	
		int[] data=new int[5];
		int sum=0;
		
		//값 입력
		for (int i=0;i<data.length;i++) {
			System.out.print((i+1)+"번째값: ");
			data[i]=sc.nextInt();
			sum+=data[i]; //입력된 숫자만큼 sum에 누적
		}
		
		//값 출력
		System.out.println("입력값 확인");
		for (int i=0;i<data.length;i++) {
			System.out.println(i+"--->"+data[i]);
		}
		
		System.out.println("총합계: "+sum);	
		
	}
}
