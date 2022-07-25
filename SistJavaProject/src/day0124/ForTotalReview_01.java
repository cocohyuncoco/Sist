package day0124;

import java.util.Iterator;

public class ForTotalReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지 합계구하기
		
		int total =0;
		
		for (int n=1;n<=100;n++) {
			total+=n;
		}
		System.out.println("총 합계는"+total+"입니다");
		
		//지역변수를 벗어난 곳에서 출력을 하고자 할때의 범위
		//1~10 까지의 합
		
		int sum=0;
		int i=1;
		
		for (;i<=100;i++) {
			sum+=i;	}
		System.out.println("총 합계는"+sum+"입니다");
	}

}
