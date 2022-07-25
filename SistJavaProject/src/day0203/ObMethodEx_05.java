package day0203;

class MyInfo{

	private String name;
	private int age;
	public static final String ADDR="Seoul";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	//출력메서드
	public void write() {
		System.out.println("이름:"+this.name+",나이:"+this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	//사용자지정 set수정 메서드
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
///////////////////////////////////////
public class ObMethodEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInfo my = new MyInfo();
		//my.name; //접근 불가능

		//값변경
		my.setName("유재석");
		my.setAge(34);

		System.out.println("이름1: "+my.getName());
		System.out.println("나이1: "+my.getAge());


		//생성2
		MyInfo my2= new MyInfo();
		my2.setData("하하", 37);
		my2.write();

		//1번학생

		my.write();

	}

}
