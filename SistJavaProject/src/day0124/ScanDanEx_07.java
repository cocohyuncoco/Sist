package day0124;


import java.util.Scanner;

public class ScanDanEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ �� ���ϴ� �ܸ� ����Ұ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.println("���ϴ� ��������?");
		dan=sc.nextInt();
		
		//���ǹ�(������ ������ �� ��� ��� ��밡��)
		//��: 2~9�� ������ ���Ͻÿ�.. ������ ����� ��
		
		if (dan<2||dan>9) {
			System.out.println("������ �ƴ� �����Դϴ� �����մϴ�");
			return; //�Լ�����
		}
		System.out.println("***"+dan+"��***");
		for (int i =1;i<=9;i++) {
			System.out.printf("%dX%d=%d\n",dan,i,dan*i);
			
		}
		
	}

}
