package day0120;

import java.util.Scanner;

public class QuizOper_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �� �޿��� �Է��Ͽ� ����,õ��,���,�ʿ�,�Ͽ� �� ������ ���Ͻÿ�
		 * 
		 * ��) 785313
		 * ����:78
		 * õ��: 5
		 * ���: 9
		 * �ʿ�: 1
		 * �Ͽ�: 3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		
		System.out.print("�� �޿��� �Է��ϼ���: ");
		money = sc.nextInt();
		
		System.out.println("����: "+(money/10000));
		System.out.println("õ��: "+(money%10000)/1000);
		System.out.println("���: "+(money%1000)/100);
		System.out.println("�ʿ�: "+(money%100)/10);
		System.out.println("�Ͽ�: "+(money%10));
		
		
		
	}

}
