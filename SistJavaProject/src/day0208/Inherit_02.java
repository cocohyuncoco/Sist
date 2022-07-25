package day0208;

//다형성 안되는경우로 만들어보는 연습
class Color{
	public void hello() {
		// TODO Auto-generated constructor stub
		System.out.println("안녕~~오늘 페인트 칠 해봅시다");
	}
}
//////////////////////////////////////
class Red extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("나는 모든문을 빨강으로 칠할게");
	}
}
class Blue extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("나는 모든벽을 파랑으로 칠할게");
	}
}
class Green extends Color{
	public void process() {
		// TODO Auto-generated constructor stub
		System.out.println("나는 모든방을 초록으로 칠할게");
	}
}
/////////////////////////////////
public class Inherit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**1. Red로 선언 Red로 생성**");
		Red r1 = new Red();
		r1.hello();
		r1.process();
		System.out.println("----------------------");
		
		System.out.println("**2. Blue로 선언 Blue로 생성**");
		Blue r2 = new Blue();
		r2.hello();
		r2.process();
		System.out.println("----------------------");
		
		System.out.println("**3. Green로 선언 Green로 생성**");
		Green r3 = new Green();
		r3.hello();
		r3.process();
		System.out.println("----------------------");
		
		
		//다형성이 될지 안될지 하는 테스트
		System.out.println("4. Color로 선언하고 Red로 생성");
	
		//오버라이딩 안받고 만들면 다형성처리 할때
		//자식한테만 있는 메서드는 못가져온다
		
		Color c1 = new Red(); //다형성 형식 / 부모로 호출하고 자식으로 생성
		c1.hello();
		//c1.process();
		
		/*
		 * 부모로 선언하고 자식으로 생성하는것 -> 다형성
		 * -부모가 가지고있는 메소드 호출OK
		 * -메서드 오버라이딩 된 경우 호출OK
		 * -부모한텐 없고 자식만 갖고있는 메서드는 호출NO (지금이 바로 그 경우) 
		 */
		
		
		
	}

}
