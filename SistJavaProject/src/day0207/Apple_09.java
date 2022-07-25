package day0207;

public class Apple_09 extends Fruit_09 {

	//추상클래스를 상속받으면 무조건 에러가뜬다
	//추상클래스 안에는 미완의 메서드가 있기때문에
	//무조건 오버라이딩을 다 받아야 에러가 안난다
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println(Fruit_09.MESSAGE); //제목
		System.out.println("사과는 아침에 좋은과일 입니다"); //메세지완성
		
	}

	
	
}
