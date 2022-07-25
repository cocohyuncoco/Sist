package day0207;


class Sawon extends person_06{
	int age;
	
	public Sawon(String name, String buseo, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.buseo=buseo;
		this.age=age;
	}

	//오버라이딩
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("나이: "+this.age);
	}
	
	
	//메서드
	public void write() {
		System.out.println(this.name+" 님의 부서는 "+this.buseo+" 부서이며 나이는 "+this.age+"세 입니다");
		
	}
	
}
///////////////////////////////////
public class Inheri_06 {
	
	public static void main(String[] args) {
	
		Sawon sa = new Sawon("임현정", "개발", 25);
		sa.write();
		System.out.println();
		System.out.println("--오버라이드 메서드 통한 출력--");
		sa.display();
		
	}
}
