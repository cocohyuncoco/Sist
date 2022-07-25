package day0207;

import day0207.Employee_04;

//자식클래스(sub)
public class Manager_04 extends Employee_04 {

	String depart;
	
	//부모생성자 상속받은 명시적생성자 완성
	public Manager_04(String n, int s, String d) {
		
		
		super(n, s); //부모생성자 호출(첫줄)
		this.depart=d; //내꺼 인스턴스변수 초기화
	}
	
	
	//부모의 메서드를 상속받는걸 오버라이딩..주소 그냥 쓰기도 하지만 미완의 메서드를 완성할 목적으로 쓴다
	// ctrl+스페이스 누르고 부모클래스거 클릭
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+","+this.depart;
	}

		
	
	
}
