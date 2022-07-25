package day0217;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class _07_SeriaShop {

	//����Ʈ�� ������ ArrayList�� ���� ���̾���
	//Ŭ������ ��ڴ�.
	ArrayList<_07_Shop> list = new ArrayList<_07_Shop>();
	Scanner sc = new Scanner(System.in);
	
	//Ű����� �Է��ϸ� list�߰�
	public void addShop() {
		
		System.out.println("��ǰ����?");
		String sang = sc.nextLine();
		System.out.println("������?");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("�ܰ���?");
		int dan = Integer.parseInt(sc.nextLine());
		
		//shop��ü ����
		_07_Shop s = new _07_Shop(sang, su, dan);
		
		//����Ʈ�� �߰�
		list.add(s);
		
		System.out.println(list.size()+"��° ��ǰ�� �߰��Ǿ����ϴ�");
	}
	
	
	
	//list�� ���Ͽ� ����...����ȭ �̿�
	public void whiteFile() {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\sist0117\\javawork\\shop0217.txt");
			oos = new ObjectOutputStream(fos);
			
			//���Ͽ� ������Ʈ ��ä�� ����
			oos.writeObject(list); //��Ƴ��� ����Ʈ �ֱ�
			System.out.println("**���Ͽ� list ��ü�� �����Ͽ����ϴ�**");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	//���ο��� ȣ��Ǵ� �޼���
	public void process() {
		
		while (true) {
			
			System.out.println("1.Shop�����߰� 2.��ü������Ͽ� ���� 3.����");
			int n=Integer.parseInt(sc.nextLine());
			
			switch (n) {
			case 1:
				addShop();
				break;
			case 2:
				whiteFile();
				break;
			default:
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_07_SeriaShop se = new _07_SeriaShop();
		se.process();
	}

}
