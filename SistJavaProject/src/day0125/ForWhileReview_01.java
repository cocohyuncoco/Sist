package day0125;

import java.util.Scanner;

public class ForWhileReview_01 {

	
	public static void test1() {
		//for������ 1~5������ ���ϱ�
		int sum = 0;

		for (int i=1;i<=5;i++) {
			sum+=i; //sum=s
		}
		System.out.println("���հ�� "+sum+" �Դϴ�");
	}
	//------------------------------------------------------------
	public static void test2() {
		//1~10������ Ȧ���� ��
		int sum=0;
		
		for (int i=1;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("���հ�� "+sum);
	}
	//------------------------------------------------------------
	public static void test3() {
		//����� 10������ ���� 55�Դϴ�
		int sum=0;
		int i=1;
		
		for (;i<=10;i++) {
			sum+=i;
		}
		System.out.println((i-1)+"������ ���� "+sum+"�Դϴ�");
	}
	//------------------------------------------------------------
	public static void test4() {
		//1~100������ ¦���� ��
		//while(true)
		
		int i=0;
		int sum=0;
		
		while (true) {
			i++;
			if (i%2==1) 
				continue;
			sum+=i;
			if (i==100) 
				break;
		}
			System.out.println("1~"+i+"������ ����"+sum);
		
	}
	//------------------------------------------------------------
		public static void ScanSum_05() {
			
			/*
			 * for, continue
			 * 3��° �������� �Է��ϸ� �հ� ����Ͻÿ�
			 * ������ 1~100�� �ƴϸ� �߸��� �����Դϴ� ������
			 * �ùٸ� ������ �� 3���� �Ǿ� �Ѵ�
			 * ���հ�:**
			 */
			Scanner sc = new Scanner(System.in);
			int sum=0;
			int score;
			
			for (int i=1;i<=3;i++) {
				System.out.print(i+"��° ������ �Է��Ͻÿ�(1~100)");
				score=sc.nextInt();
				//continue ����: ������ ���ϰ� �ϴ� ����
				if (score<1||score>100) {
					System.out.println("�߸� �Էµ� �����Դϴ�. �ٽ� �Է��ϼ���");
					i--;
					continue;
				}
				sum+=score;
			}
			System.out.println("=============================");
			System.out.println("���հ�: "+sum);
			
}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		ScanSum_05();
		
	}

}
