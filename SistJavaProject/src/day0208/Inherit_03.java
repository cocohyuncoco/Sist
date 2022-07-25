package day0208;

class Work{
	
	public void process() {
		System.out.println("알바 구하는중..");
	}
}
//////////////////
class Clean extends Work{
	@Override
	public void process() {
		System.out.println("**청소 알바중입니다**");
	}
}

class Food extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**요리 만드는 알바중입니다**");
	}
}

class Beadal extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("**배달 알바중입니다**");
	}
}
/////////////////
public class Inherit_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다형성 출력
		//부모클래스로 선언 시 누가 생성되었냐에 따라 자식클래스의 오버라이드 메서드가 호출된다
		//하나의 변수로 호출햇는데 누가 생성햇느냐에 따라서 기능(메서드)이 달라져
		//그걸 다형성 이라고한다
		
		Work w =null;
		
		w=new Clean();
		w.process();
		System.out.println("--------------");
		
		w=new Food();
		w.process();
		System.out.println("--------------");
		
		w=new Beadal();
		w.process();
		
		
		
		
		
		
		
	}

}
