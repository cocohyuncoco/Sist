package day0121;

import java.util.Scanner;

public class SwitchsScoreEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("����� ������?");
		score = sc.nextInt();
		System.out.println("����� ������ "+score+"�Դϴ�");
		//switch
		switch (score/10) {
		case 10:case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
			break;
		}
		
		System.out.println("����� ������ "+score+"�Դϴ�. ������ "+grade+"�Դϴ�.");
		
		//���׿����ڷ� �򰡸޼���
		
		String msg;
		msg = score>=90?"�հ��Դϴ�":
				score>=80?"�� �� ����ϼ���":"���� ��ȸ��...�����";
				
		System.out.println(msg);		
	}

}
