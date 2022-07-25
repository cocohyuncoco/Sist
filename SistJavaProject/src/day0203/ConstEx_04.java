package day0203;


class Person{

	String name;
	int age;

	public Person() { //디폴트
		this("이수연",5); //4번째 생성자를 호출, 괄호 열고 인자값이 있는건 생성자 호출
	}
	public Person(String name) {
		//this.name = name;
		this(name,5);
	}
	public Person(int age) {
		this("홍길동",age);
	}

	public Person(String name, int age) { //실제로는 이렇게 쓴다. 생성자
		this.name = name;
		this.age = age;
		System.out.println("호출");
	}

	public void write() {
		System.out.println("이름: "+name+"\t나이:"+age);
	}

}
//////////////////////////////////


public class ConstEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("유재석",50);
		Person p3 = new Person(22);
		Person p4 = new Person("강호동",57);


		p1.write();
		p2.write();
		p3.write();
		p4.write();





	}

}
