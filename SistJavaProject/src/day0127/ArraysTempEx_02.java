package day0127;

import java.util.Iterator;

public class ArraysTempEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서바꾸기
		
	/*	int a=10, b=20;
		System.out.print("a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.print("a="+a+",b="+b); */
		
		//배열을 이용해서 교환출력
		
		int[] a= {6,9,3};
		
		for (int n:a) 
		{
			System.out.println(n);
		}	
		System.out.println("0번과 2번을 교환 후 출력");
		
		int temp=a[0];
		a[0]=a[2];
		a[2]=temp;

		for (int n:a) 
		{
			System.out.println(n);
		}
		
		
		

	}

}
