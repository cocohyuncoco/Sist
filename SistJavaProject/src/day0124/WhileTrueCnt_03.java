package day0124;

public class WhileTrueCnt_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1~100������ �����߿��� 3�� ����� �� ��� �ִ��� ������ ���Ͻÿ�
		 * while(true)�� ���Ұ�
		 * 
		 * 3�� �������:33��
		 */
		
		int n=0; //�ݺ������� ��
		int cnt=0; //����
		
		while (true) {
			n++; 
			//3�� ����̸� cnt���� 1����
			if (n%3==0) 
				cnt++;
				//break��..n�� 100�̸� while�� ����
				if (n==100) 
					break;
			System.out.println("3�� �������:"+cnt+"��");
		}
	}

}
