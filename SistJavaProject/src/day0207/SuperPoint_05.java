package day0207;



public class SuperPoint_05 {

	protected int x; //�ۺ����� �ణ �������̶� ������
	protected int y;
	
	//����Ʈ������
	public SuperPoint_05() {
		System.out.println("super-����Ʈ������ ȣ��");
	}
	
	//�����������
	public SuperPoint_05(int x, int y) {
		System.out.println("super-����������� ȣ��");
		this.x=x;
		this.y=y;
	}
	
	public void write() { //��¸޼���
		System.out.println("x��ǥ: "+x+","+" y��ǥ: "+y);
	}
	
}
