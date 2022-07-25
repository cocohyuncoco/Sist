package day0207;

/* 부모클래스(super클래스) */
public class Employee_04 {

	String name;
	int salaty;
	
	public Employee_04(String name, int salaty) {
		this.name=name;
		this.salaty=salaty;
		
	}
	
	public String getEmployee() {
	 	return name+","+salaty;
	 	//문자+숫자 여도 문자로 반환
	}
	
	
	
}
