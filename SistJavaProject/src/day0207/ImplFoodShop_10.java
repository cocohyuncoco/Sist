package day0207;


/*
 * <extends �� implements ����>
 * Ŭ������ Ŭ������ extends
 * Ŭ������ �������̽��� implements (Ŭ���������� �������̽��� �����Ѵ� �ϴ±���)
 * �������̽��� �������̽��� extends (���� �������̽��� ����Ѵ� �ϴ±���)
 */

//�������̽��� �����ϴ� Ŭ������ ���� 

class Fooda implements FoodShop_10{
		//�����Ѵ�. �ϼ��Ѵ� �� �ǹ̷� implements�� ���δ�
		//�ϼ��ؾ� �Ǵϱ� �̱����� �޼��尡 �������̴�. �̰͵� �������̵� �ؾ���
		
	
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
		//SHOPNAME="���ﵷ�"; //�������̽� �ȿ� �ִ°� ������ final�̶� �����ļ� ������
		//�������̽� �ȿ� �ִ°� ������ �߻�޼���
		
		System.out.println(SHOPNAME);
		System.out.println("������ �ֹ��մϴ�");
	}

	@Override
	public void beadal() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		System.out.println("������ ����մϴ�");
	}
	
}
////////////////////////////////

public class ImplFoodShop_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���#1
		Fooda fa = new Fooda();
		fa.order();
		fa.beadal();
		System.out.println("------------------------");
		
		//���#2 ������
		FoodShop_10 fs = new Fooda();
		fs.order();
		fs.beadal();
		System.out.println("------------------------");
	
		
	}

}
