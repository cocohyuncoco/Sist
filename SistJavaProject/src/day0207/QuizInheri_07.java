package day0207;
/*
 * �ܰ�:1000��
	��ǰ��:����
	����:5��
	
	�ܰ�:1200��
	��ǰ��:������
	����:4��

 */

class Shop{
	
	private String sangpum;
	private int su;
	
	//����Ʈ ������
	public Shop() {
		//sangpum="Ű��";
		//su=20;
		//���1
		
		this("Ű��", 20); //���2
	}
	
	//����� ������
	public Shop(String sangpum, int su) {
		// TODO Auto-generated constructor stub
		this.sangpum=sangpum;
		this.su=su;
	}
	
	//��¸޼���
	public void writeShop() {
		System.out.println("��ǰ��: "+this.sangpum+"\n����: "+this.su+" ��");
	}
	
}
//////////////
class My extends Shop{
	private int price;
	
	public My() {
		// TODO Auto-generated constructor stub
		//����Ʈ�����ڴ� super�� �����������ϱ� �ҷ�������
		price=2000;
		
	}
	
	//��ӹ����� ����� ������ �ϼ�
	public My(String sangpum, int su, int price) {
		// TODO Auto-generated constructor stub
		super(sangpum, su);
		this.price=price;
	}
	
	
	//�޼��� �������̵��ؼ� �ϼ�
	@Override
	public void writeShop() {
		// TODO Auto-generated method stub
		System.out.println("�ܰ�: "+this.price+" ��");
		super.writeShop();
		
	}
	
}
///////////////
public class QuizInheri_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My my1 = new My("����", 5, 1000);
		my1.writeShop();
		System.out.println("---------------------");
		
		My my2 = new My("������", 4, 1200);
		my2.writeShop();
		System.out.println("---------------------");
		
		My my3 = new My();
		my3.writeShop();
		System.out.println("---------------------");
			
	}

}
