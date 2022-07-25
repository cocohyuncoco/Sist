package day0121;

public class ForEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//초기값이 조건이 맞지 않으면 한번도 반복안함
		for (int i=5;i<=1;i++) {
			System.out.print(i+" ");
			}
		
		//1 2 3 4 5 6 7 8 9 10		
		int i=1;
		for (;i<=10;i++) {
			System.out.println(i+" ");
			}
		System.out.print("\n빠져나온 후의 i값 "+i);

		int a=10;
		for (;a<=50;a+=5) {
			System.out.println(a+" ");
		}
		System.out.print("\n빠져나온 후의 a값 "+a);
		
		
		//가로로 Hello를 5번 출력하시오
		for (int n=5;n>=1;n--) {
			System.out.print("\nHello"+" ");
		}
		System.out.println();
	
		//1~10까지의 수 중에 짝수만 출력하기 ..for,if문 사용
		//2 4 6 8 10
		System.out.println("1~10까지 숫자중 짝수만 출력하기");
		
		for (int t=1;t<=10;t++) {
			if (t%2==0) {
				System.out.print(t+" ");	
			}
		}
		System.out.println();
	}

}
