package day0204;

public class ObMethodEx_07 {

	public static void hello(int age, double height) {
		
		System.out.println("전달 순서대로 저장");
		System.out.println("제 나이는 "+age+"세");
		System.out.println("키는 "+height+"cm");
	}

	public static void good() {
		
		System.out.println("안녕 다음에 보자");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메서드 호출");
		hello(25, 160.3);
		good();
		
	
	}

}
