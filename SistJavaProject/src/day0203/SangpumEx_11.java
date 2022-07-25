package day0203;

import java.util.Iterator;

class Shop{
	
	
	private String sangpum;
	private int price;
	private String color;
	
	//����������� (����3��)
	
	public Shop(String sangpum, int price, String color) 
	{
		this.sangpum = sangpum;
		this.price = price;
		this.color = color;
	}
	
	//����޼���(showTitle)
	public static void showTitle() 
	{
		System.out.println("��ǰ��\t�ܰ�\t����");
		System.out.println("---------------------");
	}
	
	
	//��� (showSangpum)
	public void showSangpum() 
	{
		System.out.println(this.sangpum+"\t"+this.price+"��\t"+ this.color);
	}
	
}
///////////////////////////////
public class SangpumEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5���� �����ҰŶ�� �ּҸ� �Ҵ�
		Shop [] sh = new Shop[5]; 
		
		//5���� shop �迭�� ������ ���ؼ� ����
		// sh[0].showSangpum(); <- ���� �������������� NullpointException �߻�
		
		sh[0] = new Shop("������13",950000,"ȭ��Ʈ");
		sh[1] = new Shop("����������",1200000,"��ũ");
		sh[2] = new Shop("������11",750000,"��");
		sh[3] = new Shop("�ƺ�",2100000,"��Ż�׷���");
		sh[4] = new Shop("������13",2000000,"�׷���");
		
		//���
		Shop.showTitle();
		
		
//		for (Shop s:sh) {
//			s.showSangpum();
//			System.out.println("---------------------");
//		}
//		
		
		for (int i=0;i<sh.length;i++) {
			Shop s = sh[i];
			s.showSangpum();
			
		}
		
		
	}

}
