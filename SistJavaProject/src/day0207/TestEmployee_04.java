package day0207;
/*
 * 클래스를 객체생성할때는 자동으로 부모->자식 순이다
 * 그래야 자식이 부모의 멤버를 사용할수있다
 * 
 */
public class TestEmployee_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager_04 man = new Manager_04("최지우", 1500000, "경영기획부");
		
		System.out.print(man.getEmployee());
		
		
	}

}
