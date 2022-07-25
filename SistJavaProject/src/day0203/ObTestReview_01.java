package day0203;
class TestA{
	String name="이용기";  //<- 인스턴스 변수, new연산자 없이 사용 불가능
	static String MESSAGE="***Happy Day!!!***"; //<-상수
}
//////////////////////////////////

public class ObTestReview_01 {

	int a; // 오토변수 (자동으로 초기화되는 변수)
	static int b; //클래스변수 혹은 정적변수 (현재 오브젝트가 공통으로 사용), static은 new연산자 없이 접근, 사용 가능


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메서드 안에 있는 변수는 지역변수. 초기화 항상 해줘여함. 초기화 자동으로 안시켜줌
		//지역변수는 메서드 안에서만 쓸수있다.

		//static변수는 바로 사용 가능
		b=20;
		System.out.println("b="+b);

		// 인스턴스 변수는 인스턴스가 있어야 접근 가능
		ObTestReview_01 ob1 = new ObTestReview_01();
		ObTestReview_01 ob2 = new ObTestReview_01();

		ob1.a=10;
		ob2.a=30;

		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);

		//static변수 클래스명으로 접근
		System.out.println("정적변수b="+ObTestReview_01.b); //생략안한거
		System.out.println("정적변수b="+b); //생략한거

		//TestA
		TestA ta = new TestA();

		ta.name="곽경태";
		System.out.println("ta.name="+ta.name);
		System.out.println(TestA.MESSAGE);


		TestA.MESSAGE="안녕";
		System.out.println(TestA.MESSAGE);



	}

}

