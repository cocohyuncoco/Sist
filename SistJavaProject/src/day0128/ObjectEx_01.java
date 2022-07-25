package day0128;

public class ObjectEx_01 {


	//인스턴스 변수
	//객체생성 후 각각 다른값을 가질수있다
	String name; //null로 초기화

	//여러객체가 같은 값을 가져야할 경우 static주로 선언
	//객체생성없이 접근 가능하다...클래스명.변수
	//final 쓰면 절대 바꿀수없다
	static final String MESSAGE="Happy Day!!";
	//상수는 올 대문자로 쓴다
	//static 은 주로 상수 선언할때 쓴다

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("static 멤버변수는 new로 생성없이 호출가능하다");
		System.out.println(MESSAGE);//같은 클래스 내에선 클래스명 생략가능

		//MESSAGE="Nice!"; //오류 -final

		//인스턴스 변수는 객체생성없이 멤버 접근 불가능
		ObjectEx_01 kd = new ObjectEx_01();

		kd.name = "홍길동";
		System.out.println(kd.name);

		ObjectEx_01 ar = new ObjectEx_01();
		ar.name="조아라";

		System.out.println(ar.name);
		
		// MESSAGE ="흥"; <- final 때문에 메인메서드에서 값을 못바꿔줌. 에러
 		System.out.println("다같이 사용하는 메세지: "+MESSAGE);




	}

}
