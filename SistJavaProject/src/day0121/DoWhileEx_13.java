package day0121;

public class DoWhileEx_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;		
		System.out.println("while문 결과");
		
		//조건이 참일동안 반복
		//조건이 먼저 옴
		
		while (i<5) {
			System.out.println(i++); //출력후 증가
		}
		
		System.out.println("do~while문 결과");
		
		i=1;
		//조건이 후에 나온다
		do {
			System.out.println(i++);
		} while (i<5);
		System.out.println("종료");
		
		
		
		
	}

}
