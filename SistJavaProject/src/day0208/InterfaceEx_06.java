package day0208;

//�������̽��� ���߿����� ���̾�
interface ColorB{
	
	String INITCOLOR="while"; //��� final ����. �ֳĸ� �������̽��� ����ۿ� ����
	public void showColor(); //�߻�޼��� absreact ����. �ֳĸ� �������̽��� �߻�Ŭ�����ۿ� ����
	
}
class RedB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("�⺻����: "+INITCOLOR);
		System.out.println("����� ������ �����Դϴ�");
	}
	
}
class BlueB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("���� �������Դϴ�");
	}

}

class WhileB implements ColorB{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("�ٽ� ȭ��Ʈ�� ���ư����� ��ȹ���Դϴ�");
	}
	
}
//////////////////////

public class InterfaceEx_06 {

	public static void show(ColorB color) {
		color.showColor();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show(new RedB());
		show(new BlueB());
		show(new WhileB());
		System.out.println("-------------------");
		
		//���������
		ColorB co = null;
		
		co = new RedB();
		co.showColor();
		
		co = new BlueB();
		co.showColor();
		
		co = new WhileB();
		co.showColor();
		
		
		
		
	}

}
