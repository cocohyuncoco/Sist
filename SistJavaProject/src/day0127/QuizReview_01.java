package day0127;

import java.util.Iterator;
import java.util.Scanner;

public class QuizReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��ĳ�ʷ� ���ڸ� �Է¹޾Ƽ� �迭�� ����� �ִ��� ���
		 * ������� ���ٰ� ���..0�� �Է½� ����
		 * ��)
		 * �Է°�:11
		 * 11�� 2��°�� �־��
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {6,11,45,66,78,23,88,77,100};
		int num, cnt=0;
		boolean flag;
		
		
		while (true) 
		{	cnt++;
			System.out.print("**�Է°�"+cnt+":");
			num=sc.nextInt();
			//0�Ͻ� ����
			if (num==0) 
			{
				System.out.println("**����**");
				break; //while���� ���������� ����
			}
			flag=false; //�ݺ��� �ȿ��� ã���� true�� ����
			//�迭 ������ŭ �ݺ��ؼ� �Է��� ���� ã��
			for (int i=0;i<arr.length;i++)
			{
				if (num==arr[i]) 
				{ 
					flag=true;
					System.out.println("\t"+num+"�� "+(i+1)+"��°�� �־��");
				}
			}
			if (!flag) {//�迭�� ���°�� flag�� ������ false�̴� 
				flag=false;
				System.out.println("\t"+num+"�� �����");
				}
		}//while�� ��
		
			
		
			
			
			
		
		
		
		
		
	}

}
