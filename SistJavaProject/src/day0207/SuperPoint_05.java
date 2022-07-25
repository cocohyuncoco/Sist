package day0207;



public class SuperPoint_05 {

	protected int x; //퍼블릭보단 약간 보수적이라 생각해
	protected int y;
	
	//디폴트생성자
	public SuperPoint_05() {
		System.out.println("super-디폴트생성자 호출");
	}
	
	//명시적생성자
	public SuperPoint_05(int x, int y) {
		System.out.println("super-명시적생성자 호출");
		this.x=x;
		this.y=y;
	}
	
	public void write() { //출력메서드
		System.out.println("x좌표: "+x+","+" y좌표: "+y);
	}
	
}
