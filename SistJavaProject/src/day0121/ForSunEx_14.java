package day0121;

import java.util.Iterator;

public class ForSunEx_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ݺ����� �̿��ؼ� ������ �հ豸�ϱ�
		// 
		int sum=0;
		
		for (int i =1;i<=10;i++) {
			sum+=i; // sum=sum+i;
		}
		System.out.println("1���� 10������ ���� "+sum+"�Դϴ�");
		
		System.out.println("while������ 1~10������ �� ���ϱ�");
		
		int i=1;
		int tot=0; //�հ踦 ���� ����
		
		while (i<=10) {
			tot=tot+1; //�հ躯���� i�� ������Ų��
			//tot+=i;
			i++;
		}
		System.out.println("while������ 1~10������ ����"+tot+"�Դϴ�");

		
		// 1����10������ Ȧ���� ���ϱ�
		
		System.out.println("for������ 1~10������ Ȧ�� �� ���ϱ�");
		
		int total=0;
		for (int n=1;n<=10;n+=2) {
			total+=n;
		}
		System.out.println("�� �հ�� "+total+"�Դϴ�");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
