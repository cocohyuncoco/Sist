package day0124;

import java.util.Scanner;

public class ScanCntSum_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * while(true)�� �̿��Ұ�
			 * �� Ƚ���� �Է��� ���� ���� ���Ұ�
			 * ���� 0�� �Է½� �����Ұ�!!!
			 */
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum=0; //�Է��� ��, �հ�
		int cnt=0; //����
		double avg=0;
		
		while (true) {
			System.out.println("�����Է�(����:0)");
			su=sc.nextInt();
			
			if (su==0)				
			break;
			
			sum+=su;
			cnt++;
		}
		avg=(double)sum/cnt;
		System.out.println("���Է��� ����:"+cnt);
		System.out.println("�Է��� ������ ��:"+sum);
		System.out.println("�Է��� ������ ���"+avg);
		
	}

}
