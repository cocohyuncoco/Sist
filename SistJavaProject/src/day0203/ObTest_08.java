package day0203;


class Info{

	private String name;
	private String addr;
	private String age;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	//3개의 멤버변수를 한꺼번에 변경하는 메서드(이게 차이점이다. 생성자에는 void가 없다)
	public void setInfo(String name, String addr, String age)
	{
		// this.name = name;
		// this.addr = addr;
		// this.age = age;
		//
		this.setName(name);
		setAddr(addr);
		setAge(age);
	}

	//3개의 멤버변수를 한꺼번에 리턴 / void와 리턴값의 차이가 뭔지 알기 위해 하는연습
	public String getInfo()
	{
		String s = "name: "+name+"\nadrress: "+addr+"\nage: "+age;
		return s;


	}

}

//////////////////////////////////////
public class ObTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Info in1 = new Info();

		//in1.name="김태희"; <-이렇게 안됨

		in1.setName("김태희");
		in1.setAddr("서울시 강남구");
		in1.setAge("35");

		System.out.println("**값 출력**");
		System.out.println("이름: "+in1.getName());
		System.out.println("이름: "+in1.getAddr());
		System.out.println("이름: "+in1.getAge());


		System.out.println("**3개의 값 한번에 수정**");
		in1.setInfo("정지훈", "서울시 강남구", "44");

		System.out.println("**3개의 값 한번에 출력할 메서드 호출**");
		System.out.println(in1.getInfo());





	}

}
