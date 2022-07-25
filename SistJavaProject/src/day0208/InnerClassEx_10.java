package day0208;

class OuterObj{//이너클래스는 아웃클래스가 있어야 쓸수있다
		
			class InnerObj{ //멤버 내부클래스 -하나의 객체로 인식-
				
				public void write() {
					System.out.println("**내부클래스의 메서드**");
				}
			}
		
	public void disp() {
		System.out.println("외부클래스의 메서드");
		System.out.println("외부에서 내부클래스 메서드 호출");
		
		//외부클래스에서 내부클래스의 객체 생성
		InnerObj io = new InnerObj(); //외부클래스에서 내부클래스 객체생성
		io.write();
	}
}
/////////////////////////////////
public class InnerClassEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//외부에서 내부클래스 가져올때 다형성으로 이렇게
		OuterObj out = new OuterObj();
		out.disp();
		System.out.println("--------------------");
		
		// 아웃클래스를 통해서가 아니면 생성못해
		//InnerObj io = new InnerObj(); //외부클래스에서 내부클래스 객체생성
		//io.write();
	
		// 내부클래스 가져올려면 이렇게 가져오기
		OuterObj.InnerObj obj = new OuterObj().new InnerObj();
		obj.write();
		
		
	}

}
