package day0126;

import java.util.Iterator;

public class ArraysEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����� ���ÿ� �ʱⰪ �������ټ� �ִ� {}�� �Ѵ�
		
		int[] arr= {5,7,84,88,9,43,6,88};

		System.out.println("���� :"+arr.length);
		
		System.out.println("arr_#1");
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("arr_#2");
		for (int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("======================");
		//��� 1
		int[]arr1=new int[5]; //0���� �ʱ�ȭ
		arr1[1]=10;
		arr1[4]=40;
		for (int n:arr1) {
			System.out.println(n);
		}
		
		//��� 2
		int[] arr2= {44,77,99,55,99,44,100,1};
		System.out.println("------------------");
		System.out.println(arr2.length);
		System.out.println("------------------");
		for (int i=4;i<arr2.length;i++) {
			System.out.println(arr2[i]);		
			
		}
		System.out.println("------------------");
		for (int n:arr2) {
			System.out.printf("%5d",n);		
		}
		System.out.println();
		
		//���ڿ��迭
		String[] str1=new String[5];
		//str1�� ���ڿ� �ֱ�
		str1[0]="���";
		str1[2]="�ĸ�����";
		
		
		
		//���#1_str1
		for (int i=0;i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		//���#2_str1
		for (String s1:str1) {
			System.out.print(s1+" ");
		}
		
		
		
		//���#1_str2
		System.out.println();
		String[] str2= {"����","���","�ʷ�","�Ķ�"};
		for (int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}
		
		System.out.println();
		//���#2_str2
		for (String s2:str2) {
			System.out.print(s2+" ");
		}
		
		
		
		
		
		
		
		
	}

}
