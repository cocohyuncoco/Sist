package day0210;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class _07_ShopArrayListQuiz {

	//Ŭ������ ������ �������� �����͸� ������ �������� Ŭ����
	List<Shop> list = new Vector<Shop>();
	
	//�������Է�
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		String sang;
		int su, dan;
		
		System.out.println("��ǰ��?");
		sang = sc.nextLine();
		System.out.println("������?");
		dan = sc.nextInt();
		System.out.println("������?");
		su = sc.nextInt();
		
		
		Shop shop = new Shop();
		shop.setSang(sang);
		shop.setDan(dan);
		shop.setSu(su);
		
		list.add(shop);
		
		System.out.println("�����ǰ�԰�:"+list.size()+"��"); 
	}
	
	//���������
	public void jego() {
		System.out.println("No.\t��ǰ��\t����\t����\t�Ѿ�");
		
		
		for (int i=0;i<list.size();i++) {
			Shop s = list.get(i); //����Ʈ�� ������ ��ġ���ִ� ��Ұ� ������
			System.out.println(i+1+"\t"+s.getSang()+"\t"+s.getDan()+"\t"+s.getSu()+"\t"+s.getTot());
			//System.out.println(i+1+s.getSang()+s.getDan()+s.getSu()+s.getTot());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_07_ShopArrayListQuiz sl = new _07_ShopArrayListQuiz();
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("-----------------------");	
		while (true) {
			System.out.println("1.��ǰ�԰� 2.��ǰ���  9.����");
			n=Integer.parseInt(sc.nextLine());
			
			if (n==1) {
				sl.inputData();
			}else if (n==2) {
				sl.jego();
			}else {
				System.out.println("�����մϴ�");
				break;
			}
			
		}

		
		
	}

}
