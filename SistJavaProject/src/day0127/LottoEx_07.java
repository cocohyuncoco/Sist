package day0127;



public class LottoEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ȱ��� �� �� ������ ���ٷ��� �ߺ�üũ
		//i���� �۰� 
		//�񱳸� �Ѵٴ°� �� ��ø�Լ��� ���ٴ°Ŵ�
		
		//�ζǸ� ����غ���. �ߺ��� ��ȣ ������ϰ� �������� ���ĵǾ� �־�� �Ѵ�
		int[] lotto=new int[6];
		
		//�����Ǽ��� �ζǺ����� �߻����Ѽ� �־��ش� (1~47)
		
		for (int i=0;i<lotto.length;i++) 
		{
			lotto[i]=(int)(Math.random()*45)+1; //1~45���� ������
			//System.out.println("������:"+lotto[i]);

			//�ߺ�ó�� 
			//�ߺ�����: ���� index(i)�� (0~i-1) ���ؼ� �ߺ��� ���� ����� i--
			for (int j=0;j<i;j++) 
			{
				//System.out.println(lotto[i]+"=="+lotto[j]);
				//���ǹ�
				if (lotto[i]==lotto[j]) 
				{
					//System.out.println("�ߺ�");
					i--; //���������� �ٽ� ���� ���ϱ� ���ؼ�
					break; //i++�� �̵�
				}
			}
		}
		//�������� ����
		//Arrays.sort(lotto);
		for (int i=0;i<lotto.length-1;i++) 
		{
			for (int j=i+1;j<lotto.length;j++) 
			{
				if (lotto[i]>lotto[j]) 
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
			}
			
		}
		
		
		//���
		for (int i=0;i<lotto.length;i++) 
		{
			//System.out.printf("%5d",lotto[i]);
			System.out.print(lotto[i]+"\t");
			
		}
		

	}

}
