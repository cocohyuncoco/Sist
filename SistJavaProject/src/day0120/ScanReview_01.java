package day0120;

import java.util.Scanner;

public class ScanReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �̸��Է�: ��ȿ��
		 * Ű �Է�: 168.5
		 * ������ �Է�: 55.9
		 * 
		 * [�Է�����]
		 * �̸�:��ȿ��
		 * Ű&������: 168.5cm/55.9kg
		 * ǥ�ظ�����: 61.65kg
		 */
		
		Scanner sc= new Scanner(System.in);
		
		String name;
		double height, weight, st_weight;
		
		//�Է�
		System.out.print("�̸��Է�: ");
		name=sc.nextLine();
		System.out.print("Ű �Է�: ");
		height=Double.parseDouble(sc.nextLine()); //string->Double
		System.out.print("������ �Է�: ");
		weight=sc.nextDouble(); //string->Double
		
		//���
		st_weight=(height-100)*0.9;
		
		//���
		
		System.out.println("[�Է�����];");
		System.out.println("�̸�:"+name);
		System.out.println("Ű:"+height);
		System.out.println("������:"+weight+"cm");
		System.out.printf("ǥ�ظ�����:%.1fkg", st_weight);
		
		
		
		
		
		
		
		
		
		
		
	}

}
