package day0207_1;

import day0207.SuperObj_03; //��ӹ����� ������ ����Ʈ

// super3���� �ڽ�

public class SubObj_03 extends SuperObj_03{
	//Ŭ������ �ڽ�Ŭ���� extends �θ�Ŭ���� �� �´�
	
	//�θ�� �̸�, ���̸� �������ְ�
	private String addr; // ���� �ּҸ� �������־�
	
	//�θ𲨸� ��ӹ����� ���� �̸�,����,�ּҰ� �ִ� 
	//�θ𺸴� �� ū �ְ� �Ǵ°ž�
	
	//���⼭ �������� �ڽ��� ����������ڷ� �����
	public SubObj_03(String name, int age, String addr) { 
	
		//�θ� ������ ȣ��
		super(name, age); //�̰� �ȸ���� ����������. �ڹݵ�� ù�ٿ� ����Ѵ�.��
		this.addr = addr;
	}
	
	public void whileData() {//��¸޼���
		
		//�θ� ��ӹ޾����� �׶����ʹ� ������
		//�׷��ϱ� this�� ȣ���Ҽ��־�
		System.out.println("�̸�: "+this.name);
		System.out.println("����: "+this.age);
		System.out.println("�ּ�: "+this.addr);
		
	}
	
	
}
