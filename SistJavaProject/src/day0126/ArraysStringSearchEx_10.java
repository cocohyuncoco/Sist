package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysStringSearchEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �̸��� �Է��ؼ� �� �̸��� ���° �ִ���
		 * �� �̸��� ���ٰ� ���
		 * ���̶�� �Է� �ϸ� �˻��� �����մϴ� ��� ���
		 * 
		 * ��ĳ��, ����Ʈ�繮, ����
		 */
		
		String[] data= {"���ؿ�","������","������","�����","���ƶ�","�̿��","�̰��","����ȣ","������"};
		String name;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("**�̸��� �Է��ϼ���**");
			name = sc.nextLine();
		
			if (name.equals("��")) { 				
				System.out.println("�˻��� �����մϴ�");
				break;
			}
			flag = false;
			
			for (int i=0;i<data.length;i++) {
				if (name.equals(data[i])) {
					flag=true;
					System.out.println((i+1)+"��°�� �ֽ��ϴ�");
					}
				}
			
			if (!flag) {
				System.out.println(name+"���� �����Ϳ� �����ϴ�");}
				
		}
		
	
	}

}
