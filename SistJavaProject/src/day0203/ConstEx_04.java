package day0203;


class Person{

	String name;
	int age;

	public Person() { //����Ʈ
		this("�̼���",5); //4��° �����ڸ� ȣ��, ��ȣ ���� ���ڰ��� �ִ°� ������ ȣ��
	}
	public Person(String name) {
		//this.name = name;
		this(name,5);
	}
	public Person(int age) {
		this("ȫ�浿",age);
	}

	public Person(String name, int age) { //�����δ� �̷��� ����. ������
		this.name = name;
		this.age = age;
		System.out.println("ȣ��");
	}

	public void write() {
		System.out.println("�̸�: "+name+"\t����:"+age);
	}

}
//////////////////////////////////


public class ConstEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("���缮",50);
		Person p3 = new Person(22);
		Person p4 = new Person("��ȣ��",57);


		p1.write();
		p2.write();
		p3.write();
		p4.write();





	}

}
