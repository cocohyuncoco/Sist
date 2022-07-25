package day0121;

import java.util.Scanner;

public class IfScanReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//두수를 입력해서 max 값을 구하고 두수중 첫번째 두번째가 더 크다 란걸 출력
		//삼항연산자
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,max;
		
		System.out.println("-----두 수를 입력하세요-----");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("입력한 두 수: "+x+","+y);
		System.out.println("두수 의 합은: "+(x+y)+"입니다");
		//max..if..삼항
		//두 수중 더 큰 값은 66 입니다
		
		if(x>y)
			max=x;
		else 
			max=y;
	
		System.out.println("두 수중 더 큰 값은 "+max+"입니다");	
		
		max = x>y?x:y;
		
		System.out.println("두 수중 더 큰값은 "+max+"입니다");
		System.out.println("첫번째 수가 더 "+(x>y?"크다":"작다"));

		
		
		
		
	}

}
