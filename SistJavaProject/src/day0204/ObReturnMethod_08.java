package day0204;

public class ObReturnMethod_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("두수의 합: "+add(10, 20));
		System.out.println("수의 제곱: "+square(4.5));
		divide(6, 2);
		divide(3, 0);
		divide(4, 2);
		
	}
	
	public static int add(int num1, int num2) {
		
		int result = num1+num2;
		return result;	
	}

	public static double square(double num) {
		return num*num; //리턴을 바로 해도 된다. 추천하진 않지만
	}
	
	public static void divide(int num1, int num2) {
		
		if (num2==0) { // 자바에서는 0으로 나눌땐 숫자가 나올수없고 오류가난다.
			System.out.println("0으로는 나눌수 없습니다");
			return; //메서드의 종류
		}
		
		System.out.println("나눗셈 결과: "+num1/num2);
		
		
		
	}
	
	
	
	
	

}
