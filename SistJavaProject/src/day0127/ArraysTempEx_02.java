package day0127;

import java.util.Iterator;

public class ArraysTempEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����ٲٱ�
		
	/*	int a=10, b=20;
		System.out.print("a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.print("a="+a+",b="+b); */
		
		//�迭�� �̿��ؼ� ��ȯ���
		
		int[] a= {6,9,3};
		
		for (int n:a) 
		{
			System.out.println(n);
		}	
		System.out.println("0���� 2���� ��ȯ �� ���");
		
		int temp=a[0];
		a[0]=a[2];
		a[2]=temp;

		for (int n:a) 
		{
			System.out.println(n);
		}
		
		
		

	}

}
