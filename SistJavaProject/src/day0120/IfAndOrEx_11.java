package day0120;

import java.util.Scanner;

public class IfAndOrEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q. ��� ������ 60�� �̻��̰ų� ���� ������ 40�� �϶� �հݤ�
		Scanner sc = new Scanner(System.in);
		
		String name;
		int oracle,java,eng;
		
		
		System.out.println("�̸��� �Է��ϼ���");
		name=sc.nextLine();
		System.out.println("3������ ������ ������� �Է��ϼ���");
		oracle=sc.nextInt();
		java=sc.nextInt();
		eng=sc.nextInt();
		
		//���
		double avg=(oracle+java+eng)/3.0;
		
		System.out.println("***������ �Դϴ�***");
		System.out.println("����Ŭ, �ڹ�, �ڹٿ��� ����= "+oracle+","+java+","+eng);
		System.out.println("��� ������ "+avg+"��");
		System.out.println("**�հ������� ����� 60�� �̻��̰�\n�� ������ ��� 40�� �̻��̸� �հ�***");
		System.out.println("=======================================");

		//if���ǹ�
		if(avg>=60&&oracle>=40&&java>=40&&eng>=40) {
			System.out.print(name+" ���� �հ� �Դϴ�");
		}else {
			System.out.print("���հ�");}
			
		
	}

}
