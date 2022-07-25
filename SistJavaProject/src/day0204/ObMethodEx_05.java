package day0204;

public class ObMethodEx_05 {

	//메서드 오버로딩
	public static int sum(int a, int b) {
		
		System.out.println("1번째 함수 호출");
		return a+b;
	}
	
	public static double sum(int a, double b) {
		
		System.out.println("2번째 함수 호출");
		return a+b;
	}
	
	public static double sum(double b, int a) {
		
		System.out.println("3번째 함수 호출");
		return a+b;
	}	
	
	public static double sum(double a, double b) {
		
		System.out.println("4번째 함수 호출");
		return a+b;
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인자 타입에 따라서 자동으로 중복함수가 호출됨
		System.out.println(sum(3, 7));
		System.out.println(sum(4, 6.5));
		System.out.println(sum(7.7, 6));
		System.out.println(sum(7.7, 2.2));
		
		
	}

}
