package day0124;

import java.util.Iterator;

public class ForGuguBreak_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2~9�ܱ��� ����ϵ� 2*4=8...9*4=36
		//���� 4������ ��µǰ� �Ͻÿ�...breck�� �̿��Ͻÿ�
		
		for (int dan=2;dan<=9;dan++)
		{
			for (int j=1;j<=9;j++) 
			{
				if (j==5) 
					break; //���� ����� �ݺ��� ����������
					System.out.println(dan+"X"+j+"="+dan*j);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
