package day0124;

public class ForSumEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� 100������ �����߿��� ¦���� �հ� Ȧ���� ���� ���� ����Ͻÿ�
		//¦���� ��:**
		//Ȧ���� ��:**
		
		int esum=0; //¦�� ���� ���� ����
		int osum=0; //Ȧ�� ���� ���� ����
		
		for (int i=1;i<=100;i++) {
			if (i%2==0) 
				esum+=i;
			else
				osum+=i;
		}
		System.out.println("¦���� ��:"+esum);
		System.out.print("Ȧ���� ��:"+osum);
	}

}
