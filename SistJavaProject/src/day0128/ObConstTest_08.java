package day0128;


class obConstAA{

	String name;
	String addr;

	public obConstAA(String name) {
		this(name, "�����"); //�����ڿ��� �ٸ� �����ε� �����ڸ� ȣ���ϴ°��
							//�ݵ�� ������ ù���ο��� ���
	}

	//������(�����ִ�)
	public obConstAA(String name, String addr) {
		this.name=name; //�ν��Ͻ� �ڱ��ڽ��� this����. �̸��� �����Ҷ� �ݵ�� ǥ��
		this.addr=addr;
	}

	//get�޼���
	public String getName() {
		return name;

	}
	public String getAddr() {
		return addr;

	}

}
/////////////////////////////
public class ObConstTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		obConstAA ob1 = new obConstAA("ȫ�浿");
		obConstAA ob2 = new obConstAA("��⿭", "��⵵ ���ν�");
		
		System.out.println("�̸��� "+ob1.getName()+"�̸� �ּҴ� "+ob1.getAddr()+" �Դϴ�");
		System.out.println("�̸��� "+ob2.getName()+"�̸� �ּҴ� "+ob2.getAddr()+" �Դϴ�");



	}

}

