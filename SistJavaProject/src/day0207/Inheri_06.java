package day0207;


class Sawon extends person_06{
	int age;
	
	public Sawon(String name, String buseo, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.buseo=buseo;
		this.age=age;
	}

	//�������̵�
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("����: "+this.age);
	}
	
	
	//�޼���
	public void write() {
		System.out.println(this.name+" ���� �μ��� "+this.buseo+" �μ��̸� ���̴� "+this.age+"�� �Դϴ�");
		
	}
	
}
///////////////////////////////////
public class Inheri_06 {
	
	public static void main(String[] args) {
	
		Sawon sa = new Sawon("������", "����", 25);
		sa.write();
		System.out.println();
		System.out.println("--�������̵� �޼��� ���� ���--");
		sa.display();
		
	}
}
