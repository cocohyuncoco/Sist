package day0124;

import java.util.Iterator;
import java.util.Scanner;

public class QuizWhileTrueGugu_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while(true)
		 * 1. 0�̶�� �Է½� ����
		 * 2. ���� 2~9�ܱ����� �Է��Ұ� (continue�̿�)
		 * 3. ���
		 * 
		 * ���� �Է��Ͻÿ� (����:0):5
		 * [5��]
		 * 5X1=5
		 * 
		 * 5X9=45
		 * ���� �Է��Ͻÿ� (����:0):7
		 * [7��]
		 * 7X1=1
		 * 
		 * 7X9=63
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dan; //�Է��� ��
		
		while (true) {
			System.out.print("���� �Է��Ͻÿ�(����:0):");
			dan=sc.nextInt();
			//��������
			if (dan==0) {
				System.out.print("���α׷��� �����մϴ�");
				break;
			}
			//�߸��Է��� ���
			if (dan<2||dan>=9) {
				System.out.print("2~9������ ���ڷ� �Է��ϼ���");
				continue;
			}
			
			//���������
			System.out.println("["+dan+"��]");
			for (int i=1;i<=9;i++) 
			{
				System.out.println(dan+"X"+i+"="+dan*i);
			}
			System.out.println();
		}
		
		
	}

}
