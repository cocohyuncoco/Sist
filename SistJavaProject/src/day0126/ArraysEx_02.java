package day0126;



public class ArraysEx_02 {

	public static void main(String[] args) {
		
		//�迭����
		//�迭�� �� Ŭ���� ���ֿ� ������
		//�⺻�� �迭�� ��ü�� �ν�
		
		//int[] arr=new int[3]; <-�̷��� ���̾���. �޸��Ҵ�ȴ�
		//int arr []=new int[3]; //�Ҵ縸 �ϴ��� ���� ���� �ʴ��� 0���� �ʱ�ȭ�ȴ�. 
		//����� ���ÿ� �ʱⰪ�� �ֱ⵵ �Ѵ�
		
		int [] arr,arr2; //<-�迭 �ΰ� ����
		arr=new int[3];
		arr2=new int[5];
		
		//�迭�� �� �ֱ�
		arr[0]=10;
		arr[1]=5;
		arr[2]=20;
		
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		
		System.out.println("arr �迭�� ����:"+arr.length);
		
		//��½� �ݺ����� �̿��ؼ� �ϰ������� ���(�迭�� �ݺ����� ������ ����������)
		
		System.out.println("***for������ �ϰ����***");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("***for~each������ �ϰ����***");
		for (int a:arr) { //for~each(�����ڷ����� ����������:�迭��) �������� = ��ü�Һ��� �� ��
			System.out.println(a);
		}
		
		System.out.println("***for������ �ϰ����2***");
		for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		System.out.println("***for~each������ �ϰ����2***");
		for (int b:arr2) { //for~each(�����ڷ����� ����������:�迭��) �������� = ��ü�Һ��� �� ��
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
