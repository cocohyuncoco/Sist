package day0124;



public class ContinueEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12457810 �� continue ���� �����ؼ� ����� ������
		//break���� �������� �ݺ����� ����� �ʴ´� ����
		//continue ������ ������ ������� �ʴ���
		
		for (int i=1;i<=10;i++) 
			{if (i%3==0) 
				continue; //i++�� �̵�
				System.out.print(i+" ");
			}
			
			System.out.println();
			
			//continue �̿��Ұ�!!
			//Ȧ����:1
			//Ȧ����:3
			//Ȧ����:5
			//Ȧ����:7
			//Ȧ����:9
			for (int i=1;i<=10;i++) 
				{
				if (i%2==0) //¦���� �ǹ�
					continue; //�ݺ��� ���� �̵�..i++
					System.out.println("Ȧ����: "+i);
					
				}
		
	}
}


