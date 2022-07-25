package day0121;

public class WhileEx_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. while문(정확한 범위를 준 경우)
		// Java1 ~ Java5까지 출력 후 종료라고 표시할것
		int i=1;
		
		while (i<=5) 
		{
			System.out.println("Java"+i);
			i++;
		}
		System.out.println("종료");
		
		// 2.while문(명확한 범위를 모를때)
		// Hello1~Hello5 까지를 출력 후 종료라고 표시
		// 이거 많이 쓰임
		int a=1;
		while (true) {
			System.out.println("hello"+a);
			a++;
			//break문을 반드시 줄것;
			if(a>5)
			break;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
