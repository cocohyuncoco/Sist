package day0128;

public class Card {



	//인스턴스변수_개별적인 저장공간, 각각 다른값 저장
	//참조변수명.인스턴스변수명 으로 접근가능...객체생성

	String kind; //카드무늬
	int number; //카드숫자

	//클래스변수_모든 인스턴스들이 공유
	//생성없이 클래스이름.클래스변수명 으로 접근 가능
	//클래스가 로딩될때 생성, 종료될때 소멸 

	static int width; //0
	static int height; //0



}
