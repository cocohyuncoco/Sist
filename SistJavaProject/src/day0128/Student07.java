package day0128;

public class Student07 {

	private String name; //null
	private int age; //0
	//������(����� ������)
	public Student07(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//����Ʈ ������
	public Student07() {

	}
	//setter�޼���
	//�ν��Ͻ� ������ ����� �����͸� ������ �������� ��� -set������
	//������̹Ƿ� ������� ���� void

	public void setName(String name) {
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	//getter �޼���
	//�ν��Ͻ� ������ ����� �����͸� ��ȸ�� �������� ��� _get������
	//������ ��¸���,ȣ�ⵥ���͸� �Ѱ��ִ� �����Ͱ� �����Ƿ� ���� ����()
	//���������� �����ֹǷ� 'retrun�����' ���� ����
	//����Ÿ�Ե� ����� Ÿ������ �����Ѵ�

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}




}

