package day0121;



public class ForEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// I love Java...3까지 반복하려면?
		// 조건문이 true일경우 {} 를 수행한다
		// 증감 후 조건이 false일 경우 {} 빠져나간다
		
		for (int num = 1; num<=3; num++) {
			System.out.println("I love Java"+num);			
		}

		//0 1 2 3 4
		for (int z=0 ; z<=4; z++) {
			System.out.print(z+" ");			
		}

		System.out.println();
		//세로로 Hello 1~10
		// for안에서 선언한 변수는 밖에서 쓸수없다.
		
		int i;
		for (i=1;i<=10;i++) {
			System.out.println("hello"+i);
		}
		System.out.println("for문 빠져나옴"+i);
		
		int x=1;
		for (;x<=10;x++) {
			System.out.println("hi"+x);
		}
		System.out.println("for문 빠져나옴");
		
		
		
		
		
		
		
	}

}
