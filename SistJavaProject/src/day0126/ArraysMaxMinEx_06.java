package day0126;

import java.util.Iterator;

public class ArraysMaxMinEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {5,45,87,123,56,77,99,545};
		System.out.println("data���� "+data.length);
		
		int max=data[0]; //�迭������ ù�����͸� ������ �ִ밪�� ����
		int min=data[0];
		
		//�ι�° ������ ���� ������ max�� ��
		for (int i=0;i<data.length;i++) {
			if (max<data[i]) 
				max=data[i];
			if (min>data[i]) 
				min=data[i];
		}
		System.out.println("data �ִ밪 "+max);
		System.out.println("data �ּҰ� "+min);
		
	}

}
