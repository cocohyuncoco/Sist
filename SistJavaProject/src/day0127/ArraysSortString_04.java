package day0127;

import java.util.Iterator;

public class ArraysSortString_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data= {"������","������","�̰��","�̿��","����ȯ","������","�����"};
		
		System.out.println("**���� �� ���**");
		
		for (int i=0;i<data.length;i++) 
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		//System.out.println("a"+compareTo("b")); -1
		//������ 0, i>j �����ȯ i<j ������ȯ
		
		
		//�������� ���
		//���ص�����: 0���� ������ 2��°����
		for (int i=0;i<data.length-1;i++) 
		{	
			//���ϴ� �����ʹ� ���� ���������� ������
			for (int j=i+1;j<data.length;j++) 
			{
				//������ �ٲ� ���ǹ�
				if (data[i].compareTo(data[j])>0) 
				{
					String temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println("**���� �� ���**");
		
		for (int i=0;i<data.length;i++) 
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		
	}

}
