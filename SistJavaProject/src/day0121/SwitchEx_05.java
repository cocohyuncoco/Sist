package day0121;

import java.util.Scanner;

public class SwitchEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("input: 1");
			break;
		case 2:
			System.out.println("input: 2");
			break;
		case 3:
			System.out.println("input: 3");
			break;
		default:
			System.out.println("not: 1,2,3");
			break;
		}
		
		// switch ���� ���ؼ� Ȧ������, ¦������
		
		switch (num%2) {
		case 0:
			System.out.println(num+"�� ¦��");
			break;
		case 1:
			System.out.println(num+"�� Ȧ��");
			break;
		default:
			break;
		}
		
		//if�� �϶��� ���ǹ�
		if(num%2==0) {
			System.out.println(num+"�� ¦��");}
		else {
			System.out.println(num+"�� Ȧ��");}
		
		
	}

}
