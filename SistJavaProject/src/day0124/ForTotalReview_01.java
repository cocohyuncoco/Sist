package day0124;

import java.util.Iterator;

public class ForTotalReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100���� �հ豸�ϱ�
		
		int total =0;
		
		for (int n=1;n<=100;n++) {
			total+=n;
		}
		System.out.println("�� �հ��"+total+"�Դϴ�");
		
		//���������� ��� ������ ����� �ϰ��� �Ҷ��� ����
		//1~10 ������ ��
		
		int sum=0;
		int i=1;
		
		for (;i<=100;i++) {
			sum+=i;	}
		System.out.println("�� �հ��"+sum+"�Դϴ�");
	}

}
