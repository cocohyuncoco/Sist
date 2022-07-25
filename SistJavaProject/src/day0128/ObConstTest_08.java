package day0128;


class obConstAA{

	String name;
	String addr;

	public obConstAA(String name) {
		this(name, "서울시"); //생성자에서 다른 오버로딩 생성자를 호출하는경우
							//반드시 생성자 첫라인에서 사용
	}

	//생성자(인자있는)
	public obConstAA(String name, String addr) {
		this.name=name; //인스턴스 자기자신을 this라함. 이름이 동일할땐 반드시 표시
		this.addr=addr;
	}

	//get메서드
	public String getName() {
		return name;

	}
	public String getAddr() {
		return addr;

	}

}
/////////////////////////////
public class ObConstTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		obConstAA ob1 = new obConstAA("홍길동");
		obConstAA ob2 = new obConstAA("김기열", "경기도 용인시");
		
		System.out.println("이름은 "+ob1.getName()+"이며 주소는 "+ob1.getAddr()+" 입니다");
		System.out.println("이름은 "+ob2.getName()+"이며 주소는 "+ob2.getAddr()+" 입니다");



	}

}

