package day0124;



public class ForBreakLoop_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ݺ��� �տ� �̸��� ������ break,continue ��� ��������μ�
		//�� �̻��� �ݺ����� �ǳʶٰų� ����°� ����!!
		
		loop1:for (int i=2;i<=9;i++) 
		{
			for (int j=1;j<=9;j++) 
			{
				if (j==5) 
					break loop1; //name�� �����μ� �հ��� �ݺ����� �����������ִ�.
				 System.out.println(i+"*"+j+"="+i*j);
			}
			 System.out.println();
		}//loop1�� ��
			
		
	}

}
