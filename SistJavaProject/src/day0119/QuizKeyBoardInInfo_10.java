package day0119;

import java.util.Calendar;
import java.util.Scanner;

public class QuizKeyBoardInInfo_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ �̸�: �����
		 * ����⵵: 1997
		 * �а�: ��������а�
		 * ����Ʈ���� ����������: 99
		 * ���� �����׽�Ʈ:66
		 * 
		 *  [������]
		 *  �����ڸ�: �����
		 *  ����:26��
		 *  ������ ���: 82.5
		 */
		
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		// ����⵵
		int curYear=cal.get(cal.YEAR);
		
		//��������
		String name,major;
		int myYear,scoreA,scoreB;
		int age;
		int tot;
		double avg;
		
		//�Է¿� ���� ��¹�..Ű�����Է�
		System.out.print("�������̸�:");
		name=sc.nextLine();
		System.out.print("����⵵:");
		myYear=Integer.parseInt(sc.nextLine());
		//myYear=Integer.parseInt(sc.nextLine()); //���͹��� �߻� ���ִ¹��
		System.out.print("�а�:");
		major=sc.nextLine();		
		System.out.print("����Ʈ���� ����������:");
		scoreA=sc.nextInt();
		System.out.print("���� �����׽�Ʈ:");
		scoreB=sc.nextInt();
		
		//���
		age=curYear-myYear+1;
		tot=scoreA+scoreB;
		avg=tot/2.0;
		
		//�������
		System.out.println("===============");
		System.out.println("[������]");
		System.out.println("===============");
		System.out.println("�����ڸ�:"+name);
		System.out.println("�а�:"+major);
		System.out.println("����:"+age);
		System.out.println("���������:"+avg+"��");
		
}

}
