package day0120;

public class IfTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		
		//�����̸� ����ȣ �ʿ����
//		
//		if(n>5) {
//			System.out.println("n�� 5���� ũ��");
//			}//if�� ��
//			System.out.println("������ �ȸ´´�. ���α׷�����");
//		
//		if(n%2==0) {
//			System.out.println(n+"�� ¦����");
//		}else {
//			System.out.println(n+"�� Ȧ����");
//		}
		
		
		//���� ���ϱ� - if�� �̿��� �˰��� ����
		// if~else if�� ���ؼ� �������ϱ�
		// ���� ���� A,B,C,D,F 
		
//		char grade = 'A';
		int score = 100;
//		
//		if(score>=90)
//			grade='A';
//			else if(score>=80) 
//				grade='B';
//			else if(score>=70) 
//				grade='C';
//			else if(score>=60) 
//				grade='D';
//			else
//				grade='F';
//	
		
		// ���׿����� �̿��Ͽ� ���� ���ϱ�
		String grade;
		
		grade=score>=90?"A":
				score>=80?"B":
					score>=70?"C":
						score>=60?"D":"F";
				
		//�������
		System.out.print("�� ������ "+grade+"�Դϴ�");
		
	}
}
