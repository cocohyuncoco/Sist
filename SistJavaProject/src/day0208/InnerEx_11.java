package day0208;

class Outer{
	
	String name="������";
	int age = 26;
	
	//����Ŭ������ ���ó�� �����ִ�
	//member ����Ŭ���� 1
	class Inner1{
		
		//����Ŭ���������� �ܺ�Ŭ���� ������� ��밡��
		public void disp1() {
			System.out.println("**Inneer1 ���� Ŭ����**");
			System.out.println("�̸�: "+name+" ���� :"+age);
		}
		
	}
	//member ����Ŭ���� 2
	class Inner2{
		public void disp2() {
			System.out.println("**Inneer2 ���� Ŭ����**");
			System.out.println("�̸�: "+name+" ���� :"+age);
		}
	}
	
	//�ܺ�Ŭ���� �޼��� �߰�
	public void disp() {
		//�ܺ��� �޼��忡�� ����Ŭ���� ����
		Inner1 i1 = new Inner1();
		i1.disp1();
		
		Inner2 i2 = new Inner2();
		i2.disp2();

	}
}

/////////////////////////
public class InnerEx_11 {

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.disp();
		System.out.println("-----------------------------");
		
		System.out.println("���� ����Ŭ������ �޼��带 ȣ���Ϸ���?");

		Outer.Inner1 in1=new Outer().new Inner1();//���1
		in1.disp1();
		
		Outer.Inner2 in2=ou.new Inner2(); //���2
		in2.disp2();	
	}
	
}
