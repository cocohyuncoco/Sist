package day0121;

import java.util.Scanner;

public class IfScanReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�μ��� �Է��ؼ� max ���� ���ϰ� �μ��� ù��° �ι�°�� �� ũ�� ���� ���
		//���׿�����
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,max;
		
		System.out.println("-----�� ���� �Է��ϼ���-----");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("�Է��� �� ��: "+x+","+y);
		System.out.println("�μ� �� ����: "+(x+y)+"�Դϴ�");
		//max..if..����
		//�� ���� �� ū ���� 66 �Դϴ�
		
		if(x>y)
			max=x;
		else 
			max=y;
	
		System.out.println("�� ���� �� ū ���� "+max+"�Դϴ�");	
		
		max = x>y?x:y;
		
		System.out.println("�� ���� �� ū���� "+max+"�Դϴ�");
		System.out.println("ù��° ���� �� "+(x>y?"ũ��":"�۴�"));

		
		
		
		
	}

}
