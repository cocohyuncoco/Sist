package day0203;

//������_��ü������ �ڵ�ȣ��Ǵ� �޼���
//�Ϲݸ޼���� ������: �������� ����
//Ŭ������� ����
//OverLoading�� ����
//������ ������ ȣ���� this()..this()�� �ݵ�� ù��;

class Apple{

	Apple(){
		System.out.println("����Ʈ ������ ȣ��");
	}

}
////////////////////////////////////////
class Banana{

	public Banana(String str) { //str �̶�� �� ���� ���ټ��ִ� ������
		// TODO Auto-generated constructor stub
		System.out.println("������ ȣ��:"+str);

	}
}
//////////////////////////////////////
class Orange{

	//������ �����ε�
	public Orange() {
		// TODO Auto-generated constructor stub
		System.out.println("������ ����Ʈ ������ ȣ��");
	}
	public Orange(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("������ �ι�° ������ ȣ��:"+str);
	}
	public Orange(int n) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("������ ����° ������ ȣ��:"+n);
	}
}
/////////////////////////////////
public class ConstEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple ap = new Apple();
		//Banana ba = new Banana(); //<- �����ִ� �����ڸ� ����� ����Ʈ �����ڴ� ��������� �������� ����
		Banana ba = new Banana("Happy");




	}

}

