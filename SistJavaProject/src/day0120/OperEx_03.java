package day0120;

import java.util.Scanner;

public class OperEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ���� �Է� �� ��������� ����
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("�� ���� �Է��� �ּ���");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("���ϱ�:"+(x+y));
		System.out.println("����:"+(x-y));
		System.out.println("���ϱ�:"+(x*y));
		System.out.println("������:"+((double)x/y));
		System.out.println("������:"+(x%y));
	}

}
