package day0127;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysDdi_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * �̸��Է�
		 * ����ȯ
		 * �¾ �⵵ �Է�
		 * 1997
		 * ����ȯ���� �Ҷ� �Դϴ�
		 * 
		 * Scanner
		 * name, myYear
		 */
		
		String[] ddi= {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		
		Scanner sc = new Scanner(System.in);
		String name;
		int myYear;
		
		System.out.println("**�̸��� �Է��ϼ���**");
		name=sc.nextLine();
		System.out.println("***�¾ �⵵ �Է�***");
		myYear=sc.nextInt();
		
		//���
		String myDdi = ddi[myYear%12];
		System.out.println(name+" ���� "+myDdi+"�� �Դϴ�");
			
		
		
		
		
		
		
	}

}
