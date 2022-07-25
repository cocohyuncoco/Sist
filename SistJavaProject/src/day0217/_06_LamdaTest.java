package day0217;

//람다표현식은 인터페이스를 사용하는 익명내부클래스의 다른 표현식
//단 하나의 추상메서드만 가지고 있는경우만 가능 (그래서 잘 안씀)

interface Orange{
	
	public void write();
		//public void play(); 람다표현식으로 구현할경우 추상메서드 하나만
		
	
}
///////////////////////////
public class _06_LamdaTest {

	//익명내부클래스
	public void abstMethod1() {
		
		Orange or = new Orange() {
			
			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("나는 익명내부 오렌지입니다");
			}
		};
		or.write();
	}
	
	//람다식 표현법, 람다식으로 오버라이드하기
	public void abstMethod2() {
		
		Orange or =()->System.out.println("나는 람다의 오렌지");
		or.write();
		
		System.out.println("**안에 여러줄 코드일경우**");
		
		Orange or2=()->{
			System.out.println("나는 여러줄");
			System.out.println("람다 오렌지");
		};
		or2.write();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_06_LamdaTest ex = new _06_LamdaTest();
		ex.abstMethod1();
		System.out.println("------------------------------");
		ex.abstMethod2();
	}

}
