package day0119;

import java.util.Scanner;

public class ScannerTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner Ŭ������ ���ڿ��̳� ���� ��� Ű����� �Է¹����� �� �� ����
		
		//1. import
		Scanner sc=new Scanner(System.in);
		
		//2. ��������
		String name;
		int age;
		String city;
		
		//3. �Է¿� ���� ��� ���̵幮, Ű���� �Է�
		System.out.print("�̸��� �Է��� ������==>");
		name=sc.nextLine(); //������ ���ڷ� �о�´� (�����밡��)
		
		System.out.print("����� ���̴� ���?==>");
		//age=sc.nextlnt(); //�������·� �д°� String-->int
		//���� �Է��� ���ʹ����� �� ���Ͱ� Ű������ ���۷� ����Ǿ �������� ������
		//���� �о������ ���� �߻�
		//���� ���ڿ� �б����� ���͸� �о ���ָ�ȴ�...sc.nextLine();
		age=Integer.parseInt(sc.nextLine());
		
		System.out.print("��� ������?==>");
		city=sc.nextLine();
		//���
		System.out.println("------------");
		System.out.println("���� �̸���"+name+"�Դϴ�");
		System.out.println("���� ���̴�"+age+"�Դϴ�");
		System.out.println("���� "+city+" ������ ��ƿ�");
		
	
	
	
	}

}
