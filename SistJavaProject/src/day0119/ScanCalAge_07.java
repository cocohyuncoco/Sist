package day0119;

import java.util.Calendar;
import java.util.Scanner;


public class ScanCalAge_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Q. Sanner, Calenadar�� import�޾� �ϼ��Ͻÿ�
		 * Ű����� �Է¹޴°� name,myYear
		 * ����� �䷸�� ���ּ���
		 * ����⵵: 2022��
		 * ����� �̸���? ȫ�浿
		 * �¾ �⵵��? 1997
		 * ---------------------
		 * ȫ�浿���� 1997�� ���̸� 26�� �Դϴ�		
		 */
		
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		
		int curYear=cal.get(cal.YEAR); //����⵵
		
		String name;
		int myYear;
		int age;
		
		System.out.println("����⵵: "+curYear);
		
		System.out.println("����� �̸���?");
		name=sc.nextLine(); //�̸��� ���ڿ��� �о�´�
		
		System.out.println("�¾ �⵵��?");
		myYear=sc.nextInt(); //�̸��� ���ڿ��� �о�´�
		
		//���̰��
		age=curYear-myYear+1;
		
		System.out.println("----------------");
		System.out.println(name+" ���� "+myYear+" �� ���̸� "+age+" �� �Դϴ�");
		
		
	}

}
