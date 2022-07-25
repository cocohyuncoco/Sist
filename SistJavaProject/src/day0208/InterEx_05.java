package day0208;

//인터페이스 공부
//인터페이스는 다중구현이 가능하다

interface interA{
	
	//무조건 다 미완의 메서드를 가지고있고
	
	public void draw();
	public void write();
	
}
///////////////////////////
interface interB extends interA{
	public void play();
}
///////////////////////////
class InterImpl implements interA,interB{//다중구현 가능 (다중상속은 안됌)

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("축구를 합니다");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("그림을 그려요");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("영어글쓰기중");
	}
	
}
///////////////////////////
public class InterEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterImpl in = new InterImpl();
		in.draw();
		in.play();
		in.write();
		
		System.out.println("**다형성 출력**");
		
		interA inA =new InterImpl();
		inA.draw();
		inA.write();
		
		interB inB =new InterImpl();
		inB.play();
		
	}

}
