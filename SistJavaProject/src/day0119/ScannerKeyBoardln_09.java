package day0119;

import java.util.Scanner;

public class ScannerKeyBoardln_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ***�̸��� �Է��ϼ���***
		 * ������
		 * ***�ڵ��� ��ȣ�� �Է��ϼ���***
		 * 010-777-9999
		 * ***�ּҸ� �Է��ϼ���***
		 * ����� ��õ�� ��
		 * =======================
		 * [�Է°��]
		 * �̸�:ȫ�浿
		 * �ڵ���:010-777-9999
		 * �ּ�:����� ��õ�� ��
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String name,hp,addr;
		
		System.out.println("***�̸��� �Է��ϼ���***");
		name=sc.nextLine();		;
		System.out.println("***�ڵ��� ��ȣ�� �Է��ϼ���***");
		hp=sc.nextLine();		
		System.out.println("***�ּҸ� �Է��ϼ���***");
		addr=sc.nextLine();		;
		
		System.out.print("=================");
		System.out.println("\t[�Է°��]");
		System.out.println("\t�̸�: "+name);
		System.out.println("\t�ڵ���: "+hp);
		System.out.println("\t�ּ�: "+addr);	
		
	}
	

}
