package day0121;

import java.util.Iterator;

public class ForSunEx_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문을 이용해서 숫자의 합계구하기
		// 
		int sum=0;
		
		for (int i =1;i<=10;i++) {
			sum+=i; // sum=sum+i;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다");
		
		System.out.println("while문으로 1~10까지의 합 구하기");
		
		int i=1;
		int tot=0; //합계를 담을 변수
		
		while (i<=10) {
			tot=tot+1; //합계변수에 i를 누적시킨다
			//tot+=i;
			i++;
		}
		System.out.println("while문으로 1~10까지의 합은"+tot+"입니다");

		
		// 1부터10까지의 홀수합 구하기
		
		System.out.println("for문으로 1~10까지의 홀수 합 구하기");
		
		int total=0;
		for (int n=1;n<=10;n+=2) {
			total+=n;
		}
		System.out.println("총 합계는 "+total+"입니다");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
