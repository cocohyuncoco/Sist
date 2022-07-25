package day0204;

public class ObMethodStart_06 {

	public static void good(int age) {
		
		System.out.println("안녕 좋은아침");
		System.out.println("나의 나이는 "+age+"세 입니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("자바시작!!");
		good(22);
		good(33);
		hello("임현정");
		System.out.println("자바 끝");

	}
	
	//밑에 다 만들어도 호출 됨
	public static void hello(String name) {
		
		System.out.println("반가워~~");
		System.out.println("나의 이름은 "+name+" 이야 ㅎ");
		
	}
	

}
