package day0207_1;

import day0207.SuperObj_03; //상속받으면 나오는 인포트

// super3번의 자식

public class SubObj_03 extends SuperObj_03{
	//클래스에 자식클래스 extends 부모클래스 가 온다
	
	//부모는 이름, 나이를 가지고있고
	private String addr; // 나는 주소를 가지고있어
	
	//부모꺼를 상속받으면 나는 이름,나이,주소가 있는 
	//부모보다 더 큰 애가 되는거야
	
	//여기서 생성자인 자식을 명시적생성자로 만든다
	public SubObj_03(String name, int age, String addr) { 
	
		//부모 생성자 호출
		super(name, age); //이걸 안만들면 에러가난다. ★반드시 첫줄에 써야한다.★
		this.addr = addr;
	}
	
	public void whileData() {//출력메서드
		
		//부모꺼 상속받았으면 그때부터는 내꺼야
		//그러니까 this로 호출할수있어
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.addr);
		
	}
	
	
}
