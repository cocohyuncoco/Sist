package day0127;

import java.util.Iterator;

public class Arrays2cha_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 */
		
		int[][] arr;
		arr=new int[2][3]; //2��3���� �Ҵ�
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=5;
		arr[1][1]=15;
		arr[1][2]=25;
		
		System.out.println("���� ����:"+arr.length);
		System.out.println("0���� �� ����: "+arr[0].length);
		System.out.println("1���� �� ����: "+arr[1].length);
		
		System.out.println("**2���� �迭 ������ ���**");
		for (int i=0;i<arr.length;i++) //�� 
		{
			for (int j=0;j<arr[i].length;j++) //�� 
			{
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("**������**");
		arr[0][1]=55;
		arr[1][0]=77;
		arr[1][2]=99;
		for (int i=0;i<arr.length;i++) //�� 
		{
			for (int j=0;j<arr[i].length;j++) //�� 
			{
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

}
