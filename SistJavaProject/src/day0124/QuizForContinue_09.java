package day0124;


import java.util.Scanner;

public class QuizForContinue_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �� 5���� ������ �Է¹޾Ƽ� �հ踦 ���Ѵ�(�ݺ������� �Է��ϱ�)
		 * ���� 1~100�� �ƴҰ�� �ٽ� �Է¹����ÿ� (continue���)..�ݺ������� �߸��Է� ����
		 * for�� �ȿ� if��
		 * 1������: 88
		 * 2������: -77
		 * �߸��Է��߾��
		 * 2������:99
		 * 
		 * 
		 * 5������:55
		 * ����:****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int score; //�Է�������
		
		for (int i=1;i<=5;i++) {
			System.out.print(i+"�� ����");
			score=sc.nextInt();
			//���ǹ�
			if (score<1||score>100) {
				System.out.println("�߸� �Է��߾��");
				i--;
				continue; //i++�� �̵�
			}
			sum+=score;
		}
		System.out.println("����:"+sum);
		
	}

}
