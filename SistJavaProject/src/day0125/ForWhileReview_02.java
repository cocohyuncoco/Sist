package day0125;

import java.util.Iterator;
import java.util.Scanner;

public class ForWhileReview_02 {

	
	public static void scanfactorialEx_01() {
		//숫자를 입력 시 팩토리얼 값을 출력하기
		//5입력시 5!=120
		
		Scanner sc = new Scanner(System.in);
		int su; //입력할 수
		int result=1;//팩토리얼 결과 값
		
		System.out.println("팩토리얼 구할 숫자 입력");
		su=sc.nextInt();
		
		for (int i=1;i<=su;i++) {
			result*=i;
		}
		System.out.println(su+"!="+result);
	}
	//------------------------------------------------------------
	public static void scanStringTextEx_02() {
		//String class에서 equals,startswith 사용
		//이름입력(종료=끝) 이름을 반복해서 입력후 몇명인지 알아볼 것
		//김씨가 몇명인지?
		
		Scanner sc = new Scanner(System.in);
		String name; //입력할 이름
		int cnt=0;
		
		while (true) {
			System.out.println("이름입력 (종료=끝)");
			name=sc.nextLine();
			//break문
			if (name.equals("끝")) 
				break;
			//조건 
			if (name.startsWith("김")) 
				cnt++;
			
		}
		//출력
		System.out.println("김씨 성을 가진 사람은 총 "+cnt+"명 입니다");
}
	//------------------------------------------------------------
	public static void scanWhileTrueEx_03() {
		/*
		 * 합계를 구할 숫자를 입력하시오
		 * 100
		 * 1~100까지의 합은 5050입니다
		 * while(true)문 이용할것
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int su; //입력할 수
		int i=0; //반복문
		int sum=0; //합계
		System.out.println("합계를 구할 숫자를 입력하시오");
		su = sc.nextInt();
		
		while (true) {
			i++;
			sum+=i;
			if (i==su) 
				break;
		}
		System.out.println("합계는"+sum+"입니다");
		
		
	
}
	//------------------------------------------------------------
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanfactorialEx_01();
		//scanStringTextEx_02();
		scanWhileTrueEx_03();
	}

}
