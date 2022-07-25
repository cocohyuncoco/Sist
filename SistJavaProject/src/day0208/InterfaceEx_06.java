package day0208;

//인터페이스는 나중에가서 많이씀
interface ColorB{
	
	String INITCOLOR="while"; //상수 final 생략. 왜냐면 인터페이스엔 상수밖에 없어
	public void showColor(); //추상메서드 absreact 생략. 왜냐면 인터페이스엔 추상클래스밖에 없어
	
}
class RedB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("기본색상: "+INITCOLOR);
		System.out.println("레드로 도색할 예정입니다");
	}
	
}
class BlueB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("블루로 도색중입니다");
	}

}

class WhileB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("다시 화이트로 돌아갈려고 계획중입니다");
	}
	
}
//////////////////////

public class InterfaceEx_06 {

	public static void show(ColorB color) {
		color.showColor();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(new RedB());
		show(new BlueB());
		show(new WhileB());
		System.out.println("-------------------");
		
		//다형성출력
		ColorB co = null;
		
		co = new RedB();
		co.showColor();
		
		co = new BlueB();
		co.showColor();
		
		co = new WhileB();
		co.showColor();
		
		
		
		
	}

}
