package day0127;

import java.util.Iterator;

public class Arrays2chaEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2���� �迭 ������ ���ÿ� �ʱ�ȭ
		
		int[][] arr= {
					{23,44},{11,22,33},{10,20,30,40}
					};
		
		System.out.println("���హ��:"+arr.length);
		System.out.println("0������ ������:"+arr[0].length);
		System.out.println("1������ ������:"+arr[1].length);
		System.out.println("2������ ������:"+arr[2].length);
		
		//���[0][0]=23 [0][1]=44
		
		for (int i=0;i<arr.length;i++)//�� 
		{	
			for (int j=0;j<arr[i].length;j++)//�� 
			{
				System.out.printf("[%d][%d]=%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
