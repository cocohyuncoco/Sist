package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysIntSearchEx_08 {

	public static void main(String[] args) {
		/*
		 * ���ڸ� �Է��Ͽ� �� ���ڰ� ���° �ִ��� ã��
		 * 0�� �Է½� �����Ұ�!! 
		 */
		
		int[] data= {11,22,33,44,55,66,77,88,99,111,222};
		
		Scanner sc = new Scanner(System.in);
		boolean flag; //�ִ��� �������� �˷��� ����
		int su; //�Է��Ҽ�
		
		while (true) {
			System.out.println("***�˻��� ���ڸ� �Է��� �ּ���***");
			su=sc.nextInt();
			//����
			if (su==0) {
				System.out.println("�˻�����");
				break;
			}
			
				flag=false; //ã���� true�� ����;
			
			//�� ã��
		   for (int i=0;i<data.length;i++) {
			//ã�� ���ǹ�
			   if (su==data[i]) {
				flag=true;
				System.out.println((i+1)+" ��°�� �ִ� �� �Դϴ�. ����");
			   	}
			   }
			   
			   if (!flag)  //flag==false
				   System.out.println(su+"�� �����Ϳ� �����ϴ�");
				
		}
	 }

	
		

}

