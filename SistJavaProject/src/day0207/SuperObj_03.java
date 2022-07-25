package day0207;
	

	// 부모클래스가 다른 패키지에 있을때 protected, public 변수는 접근가능
	// 같은패키지인 경우에는 private 빼고 전부 접근가능
	
public class SuperObj_03 {
	protected String name;
	protected int age;
	
	public SuperObj_03(String name, int age) { //인자있는생성자
		this.name = name;
		this.age = age;
	}
	
	

}
