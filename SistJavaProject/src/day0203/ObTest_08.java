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

	//3���� ��������� �Ѳ����� �����ϴ� �޼���(�̰� �������̴�. �����ڿ��� void�� ����)
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

	//3���� ��������� �Ѳ����� ���� / void�� ���ϰ��� ���̰� ���� �˱� ���� �ϴ¿���
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

		//in1.name="������"; <-�̷��� �ȵ�

		in1.setName("������");
		in1.setAddr("����� ������");
		in1.setAge("35");

		System.out.println("**�� ���**");
		System.out.println("�̸�: "+in1.getName());
		System.out.println("�̸�: "+in1.getAddr());
		System.out.println("�̸�: "+in1.getAge());


		System.out.println("**3���� �� �ѹ��� ����**");
		in1.setInfo("������", "����� ������", "44");

		System.out.println("**3���� �� �ѹ��� ����� �޼��� ȣ��**");
		System.out.println(in1.getInfo());





	}

}
