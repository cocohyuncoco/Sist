package day0128;


class NumbConst{

	int num;

	//���ھ��� ������
	public NumbConst() { //���߿� ����Ұ���
		//num=10;
		System.out.println("������ȣ��");
	}

	//�����ִ� ������
	public NumbConst(int num) { //���� ���ڸ��־� ����Ұ���
		this.num=num; //���۷��� ���� this�� ���̴°� ����. ���� �̸��� ������ ������ �ٿ����ϰ�
		System.out.println(num+"���� ���ڷ� �������ִ� ������ȣ��");
	}
	//Ŭ������ ������ ��� �����ϴ�. �޼���� �ٸ���.

	//�޼���
	public int getNumber() {
		num=50;
		return num; //����(��ȯ)���� ������ ������ ����
	}


}
public class ConstEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����Ʈ������ ����(��ü����)
		NumbConst num1 = new NumbConst(); //����Ʈ ������
		System.out.println(num1.num);

		//���� num�� ���� ��ü ����. ���� ������ ���ÿ� ����
		NumbConst num2= new NumbConst(30);
		System.out.println(num2.num);

		//�޼��� ȣ�� 
		NumbConst num3= new NumbConst();
		System.out.println(num3.getNumber());



	}

}