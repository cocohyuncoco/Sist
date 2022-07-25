package day0207;

/*
 * abstract클래스는 new로 선언하지 못하기 때문에
 * 인스턴스 변수는 소용이없다
 *
 * abstract클래스는 new로 생성못함
 * abstract메서드는 abstract클래스 에서만 존재가능
 * abstract클래스는 일반메서드와 추상메서드 둘 다 포함 가능
 */


abstract public class Fruit_09 {

	//상수선언
	public static final String MESSAGE="오늘은 상속 배우는날~";
	
	//일반메서드
	public void showTitle() {
		System.out.println("우리는 추상클래스를 배웁니다");
	}
	
	//추상메서드
	//미완의 메서드 (선언부만 있고 몸통이 없다)
	//abstract를 붙여야 추상메서드가 된다
	//추상메서드가 단 하나라도 존재하면 그 클래스는 추상클래스가 된다
	//클래스 앞에도 abstract를 붙여야한다
	//추상클래스에 상수쓰기 가능
	//오버라이딩이 목적임으로 몸통없이 선언만한다
	
	abstract public void showMessage();
	

	
	
}
