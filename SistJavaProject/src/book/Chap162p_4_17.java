package book;

import java.util.Scanner;

public class Chap162p_4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		int su;
		System.out.println("�ݺ��ϰ� ���� ���ڸ�ŭ �Է�");
		su=sc.nextInt();
		
		for (int i=0;i<su;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
