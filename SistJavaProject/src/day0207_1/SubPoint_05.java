package day0207_1;

import day0207.SuperPoint_05;

public class SubPoint_05 extends SuperPoint_05{
	
	//�θ�Ŭ������ ����Ʈ������ ������ �����ȳ�
	
	String message;
	
	public SubPoint_05() {
		super(); //����Ʈ�� ���۰� �Ⱥ����� �����ִ�. �׷��� �����ȳ�
	}
	
	public SubPoint_05(int x, int y, String msg) {
		super(x,y);
		this.message=msg;
	}
	
	//�������̵�
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
		System.out.println("�޼���: "+message);
	}
}
