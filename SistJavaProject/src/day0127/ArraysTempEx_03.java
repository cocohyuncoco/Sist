package day0127;

import java.util.Arrays;

public class ArraysTempEx_03 {

	public static void main(String[] args) {
		// �Ųٷ� �����͸� �ٲپ� ���
		
		int[] arr= {5,7,3,9,12,45,76,89,10};
		
	/*	for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//�����͸� �Ųٷ� �ٲ� ����
		
		for (int i=0;i<arr.length/2;i++) //�迭�� ������ ���� ��ŭ�� �ݺ� 
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("�Ųٷ� ��� ������");
		for (int i=0;i<arr.length;i++) //�迭�� ������ ���� ��ŭ�� �ݺ� 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();*/
		
	
		//�������� ����(��øfor)
		//���� �����ʹ� 0���� ������ 2��° ����
		for (int i=0;i<arr.length-1;i++) 
		{
			//�񱳵����ʹ� ���� ���� �� ���� ������
			for (int j=i+1;j<arr.length;j++) 
			{
				//���ǹ��� ���� �ڸ��ٲ�
				if (arr[i]>arr[j]) //���ǹ��� �ٲ���� ����� ������ ������ �Ѵ�
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("�������� ��� ������");
		for (int i=0;i<arr.length;i++)  
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(); 
		
		//Arrays.sort(arr); //�迭arr�� �������� �����Ѵ�
		//System.out.println(arr.toString()); //�ּҰ� ��ȯ�ǹǷ� Arrays�̿��Ѵ�
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.s(arr)); 
		
//		System.out.println("�������� ��� ������");
//		for (int i=0;i<arr.length;i++)  
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
	}

}
