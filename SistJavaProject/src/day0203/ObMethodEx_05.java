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

	//��¸޼���
	public void write() {
		System.out.println("�̸�:"+this.name+",����:"+this.age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	//��������� set���� �޼���
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
		//my.name; //���� �Ұ���

		//������
		my.setName("���缮");
		my.setAge(34);

		System.out.println("�̸�1: "+my.getName());
		System.out.println("����1: "+my.getAge());


		//����2
		MyInfo my2= new MyInfo();
		my2.setData("����", 37);
		my2.write();

		//1���л�

		my.write();

	}

}
