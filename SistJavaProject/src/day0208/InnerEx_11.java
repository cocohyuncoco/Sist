package day0208;

class Outer{
	
	String name="김종민";
	int age = 26;
	
	//내부클래스는 멤버처럼 쓸수있다
	//member 내부클래스 1
	class Inner1{
		
		//내부클래스에서는 외부클래스 멤버변수 사용가능
		public void disp1() {
			System.out.println("**Inneer1 내부 클래스**");
			System.out.println("이름: "+name+" 나이 :"+age);
		}
		
	}
	//member 내부클래스 2
	class Inner2{
		public void disp2() {
			System.out.println("**Inneer2 내부 클래스**");
			System.out.println("이름: "+name+" 나이 :"+age);
		}
	}
	
	//외부클래스 메서드 추가
	public void disp() {
		//외부의 메서드에서 내부클래스 선언
		Inner1 i1 = new Inner1();
		i1.disp1();
		
		Inner2 i2 = new Inner2();
		i2.disp2();

	}
}

/////////////////////////
public class InnerEx_11 {

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.disp();
		System.out.println("-----------------------------");
		
		System.out.println("직접 내부클래스의 메서드를 호출하려면?");

		Outer.Inner1 in1=new Outer().new Inner1();//방법1
		in1.disp1();
		
		Outer.Inner2 in2=ou.new Inner2(); //방법2
		in2.disp2();	
	}
	
}
