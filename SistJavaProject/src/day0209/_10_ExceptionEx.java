package day0209;

import java.util.Random;
import java.util.Scanner;

public class _10_ExceptionEx {

	public static void process() {
		Scanner sc = new Scanner(System.in);
		int su1,su2;
		
		System.out.println("�μ��� �Է��ϼ���");
		su1=sc.nextInt();
		su2=sc.nextInt();
		System.out.println("su1/su2="+su1/su2);
		
	}
	
	
	public static void process2() {
		
		//�����߻� random(), random
		
		//���1
		//int rnd=(int)(Math.random()*10)+1;
		//System.out.println("�߻��� ������ "+rnd+" �Դϴ�");
		
		//���2 RandomŬ����		
//		Random r = null;// ���� �ϰ� �������� Random r=new Random();
//		int rnd2 = r.nextInt(10)+1; //0~9���� �����߻� /+1�ϸ� 1~10���� �����߻�
//		System.out.println("RandomŬ������ �߻��� ������ "+rnd2+" �Դϴ�");
		
		Random r = new Random();// ���� �ϰ� �������� Random r=new Random();
		int rnd2 = r.nextInt(10)+1; //0~9���� �����߻� /+1�ϸ� 1~10���� �����߻�
		System.out.println("RandomŬ������ �߻��� ������ "+rnd2+" �Դϴ�");
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		System.out.println();
		
		try {
			process2();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("���ο��� ����ó����:"+e.getMessage());
		}
	
		System.out.println("��������");
	}
	
}
