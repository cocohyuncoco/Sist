package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysScanEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭�� ������ŭ �Է��� ����غ���
		//�Է��� ��½� �Է��� ������ ���� ���غ���
		
		Scanner sc = new Scanner(System.in);
	
		int[] data=new int[5];
		int sum=0;
		
		//�� �Է�
		for (int i=0;i<data.length;i++) {
			System.out.print((i+1)+"��°��: ");
			data[i]=sc.nextInt();
			sum+=data[i]; //�Էµ� ���ڸ�ŭ sum�� ����
		}
		
		//�� ���
		System.out.println("�Է°� Ȯ��");
		for (int i=0;i<data.length;i++) {
			System.out.println(i+"--->"+data[i]);
		}
		
		System.out.println("���հ�: "+sum);	
		
	}
}
