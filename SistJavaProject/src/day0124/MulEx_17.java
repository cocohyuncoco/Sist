package day0124;

import java.util.Iterator;
import java.util.Scanner;

public class MulEx_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("�� ���� �Է��ϼ���");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int result=1;
		//x�� y���̶�� ���� x�� y�� Ƚ����ŭ ���ϴ� ���̴�
		
		for (int i=1;i<=y;i++)
		{
			result*=x;
		}
		System.out.print(x+"��"+y+"���� "+result+"�Դϴ�");
	}

}
