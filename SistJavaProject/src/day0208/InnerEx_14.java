package day0208;

class server1{
	
	int a=10;
	static int b=20;
	
	static class Client1{//내부클래스
		//내부클래스에서 static 선언하고 싶으면 내부클래스 타입을 static으로 주면된다
		int c=30;
		static int d=40; 
		
		public void while2() {
			//System.out.println("외부일반변수 a="+a); //접근안된다
			System.out.println("static 클래스 내부에서는 외부클래스 a=<일반>변수 접근안됨");
			System.out.println("외부static변수 b="+b);
			System.out.println("내부일반변수 c="+c);
			System.out.println("내부static변수 d="+d);
			
			System.out.println("외부클래스 <static>변수는 접근가능");
		}
	}
}
public class InnerEx_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static내부클래스 불러오는 방법은 조금 틀리다
		server1.Client1 c1 = new server1.Client1();
		c1.while2();
	}

}
