package day0121;

import java.util.Scanner;

public class ifMax_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Q. 3���� �Է��Ͽ� �� ū ���� ����Ͻÿ�
		 * if�� or ���׿����� �̿��Ͽ� ��� ��� �Ұ�
		 * 3���� �� :10 20 30
		 * max=30 �̶�� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z,max;
		
		System.out.println("3���� ���� �Է����ּ���");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("==if��==");
		if(x>y&&x>z)
			max=x;
		else if(y>x&&y>z)
			max=y;
		else
			max=z;
		
		System.out.println("max= "+max);
		
		
		System.out.println("==���׿�����==");
		
		max = x>y&&x>z?x:y>x&&y>z?y:z; //���ǽ�? ���϶��� ��:�����϶��� ��
				
		System.out.println("max= "+max);
		
		}

}
