package day0203_01;

public class TestP {

	private TestP() { //private은 이런 제약이 있구나를 테스트 해보자
		System.out.println("디폴트생성자");
	}

	public static TestP getInstance() { 
		return new TestP();
	}

	public void writMessage() { 
		System.out.println("안녕하세요..");
		System.out.println("일반 메서드 입니다");




	}



}
