package day0125;

import java.util.Scanner;

public class RandomSumatch_04 {

	public static void main(String[] args) {
		
		//여러회차에 걸쳐서 난수(랜덤값) 알아맞추기
		//1: 77
		// 77보다 작습니다
		//2: 66
		//맞아요~정답은 66입니다..프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		int rnd = (int)(Math.random()*100)+1; //1~100까지 난수발생 / 1~100까지 중에서 뭐뭐를 구해라 할때 이거 써서 구해야한다 
		//  rnd가 나타난 순간 rnd 값은 이미 나와있는거다. 우리는 그걸 맞출뿐
		int su; //입력할 값
		int cnt=0; //횟수를 구하는 변수
		
		System.out.println("난수를 맞춰보세요");
		while (true) {//범위를 모르는건 전부 while(true)문 쓴다
			cnt++;
			System.out.print(cnt+"회: ");
			su=sc.nextInt();
			
			if(cnt==5)
				break;
				
			if (su>rnd) {
				System.out.println(su+"보다 작습니다");
			}else if(su<rnd) {
				System.out.println(su+"보다 큽니다");
			}else {
				System.out.println("맞아요 정답은 "+rnd+" 입니다");
				break;
			}
			
		}System.out.println("프로그램 종료");
		
		
		
	}//main끝
}//class끝
