package day0124;

import java.util.Scanner;

public class ScanForSum_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� n�� �Է¹����� 1���� n������ �հ豸�ϱ� (for��)
		//1���� 100������ ���� 5050 �Դϴ�
		
		Scanner sc = new Scanner(System.in);
		
		int n; //�Է��� ��
		int sum=0; //�հ�
		
		System.out.println("�հ踦 ���� ���� �Է�");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			sum+=i;
			System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�");
		}
	}

}
