package day0119;

import java.util.Scanner;

public class ScanScoreTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �л���-> ȫ�浿
		 * ����, ����, ���� ������ ���ʷ� �Է��Ͻÿ�
		 * 88
		 * 100
		 * 55
		 * =================
		 * �л���:ȫ�浿
		 * ����:88��
		 * ����:100��
		 * ����:55��
		 * ���:81.00��
		 * 
		 *  ����: name, kor, mat, eng, tot, avg
		 */	
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int kor, mat, eng;
		int tot;
		double avg;
		
		System.out.print("�л���==>");
		name=sc.nextLine();
		System.out.print("����,����,���� ������ ���ʷ� �Է��Ͻÿ�");
		kor=sc.nextInt();
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		
		avg=tot/3.0;
		
		System.out.println("==============");
		System.out.println("�л���: "+name);
		System.out.println("���� :"+kor+"��");
		System.out.println("���� :"+mat+"��");
		System.out.println("���� :"+eng+"��");
		System.out.printf("���:%.2f",avg);
		
		
	}

}
