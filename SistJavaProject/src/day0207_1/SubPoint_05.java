package day0207_1;

import day0207.SuperPoint_05;

public class SubPoint_05 extends SuperPoint_05{
	
	//부모클래스에 디폴트생성자 잇으니 오류안남
	
	String message;
	
	public SubPoint_05() {
		super(); //디폴트면 슈퍼가 안보여도 숨어있다. 그래서 오류안나
	}
	
	public SubPoint_05(int x, int y, String msg) {
		super(x,y);
		this.message=msg;
	}
	
	//오버라이딩
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
		System.out.println("메세지: "+message);
	}
}
