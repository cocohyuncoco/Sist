package day0125;

import java.util.Iterator;
import java.util.Scanner;

public class ForWhileReview_02 {

	
	public static void scanfactorialEx_01() {
		//���ڸ� �Է� �� ���丮�� ���� ����ϱ�
		//5�Է½� 5!=120
		
		Scanner sc = new Scanner(System.in);
		int su; //�Է��� ��
		int result=1;//���丮�� ��� ��
		
		System.out.println("���丮�� ���� ���� �Է�");
		su=sc.nextInt();
		
		for (int i=1;i<=su;i++) {
			result*=i;
		}
		System.out.println(su+"!="+result);
	}
	//------------------------------------------------------------
	public static void scanStringTextEx_02() {
		//String class���� equals,startswith ���
		//�̸��Է�(����=��) �̸��� �ݺ��ؼ� �Է��� ������� �˾ƺ� ��
		//�达�� �������?
		
		Scanner sc = new Scanner(System.in);
		String name; //�Է��� �̸�
		int cnt=0;
		
		while (true) {
			System.out.println("�̸��Է� (����=��)");
			name=sc.nextLine();
			//break��
			if (name.equals("��")) 
				break;
			//���� 
			if (name.startsWith("��")) 
				cnt++;
			
		}
		//���
		System.out.println("�达 ���� ���� ����� �� "+cnt+"�� �Դϴ�");
}
	//------------------------------------------------------------
	public static void scanWhileTrueEx_03() {
		/*
		 * �հ踦 ���� ���ڸ� �Է��Ͻÿ�
		 * 100
		 * 1~100������ ���� 5050�Դϴ�
		 * while(true)�� �̿��Ұ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int su; //�Է��� ��
		int i=0; //�ݺ���
		int sum=0; //�հ�
		System.out.println("�հ踦 ���� ���ڸ� �Է��Ͻÿ�");
		su = sc.nextInt();
		
		while (true) {
			i++;
			sum+=i;
			if (i==su) 
				break;
		}
		System.out.println("�հ��"+sum+"�Դϴ�");
		
		
	
}
	//------------------------------------------------------------
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanfactorialEx_01();
		//scanStringTextEx_02();
		scanWhileTrueEx_03();
	}

}
