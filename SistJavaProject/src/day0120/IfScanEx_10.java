package day0120;

import java.util.Scanner;

public class IfScanEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int score; //�Է��� ����
		String msg; //���ǿ� ���� �����
		
		System.out.println("������ �Է��ϼ���");
		score = sc.nextInt();
		
		msg=score>=90?"��ǰ�� 100����":score>=80?"��ǰ��50����":"���� ��ȸ��...�����";
//		System.out.println("����= "+score);
//		System.out.println(msg);
		
		
		String grade;
		//����
		if(score>=90) 
			grade="A";
		 else if(score>=80)
		 	 grade="B";
		 else if(score>=70)
		     grade="C";
		 else if(score>=60)
		     grade="D";
		  else
		 	grade="F";
		 
		System.out.println("����= "+score);
		System.out.println("�򰡸޽���: "+msg);
		System.out.println("����: "+grade);
		
		
		
		
		
	}

}
