package day0120;

import java.util.Calendar;
import java.util.Scanner;

public class CalAgeDdi_08 {

	public static void main(String[] args) {
		
		// ���׿�����(���ǿ�����)
		
		Scanner sc = new Scanner(System.in); // new = �����ڸ� ���ؼ� �����. ������ ���� new�� ����. �������� get
		Calendar cal = Calendar.getInstance(); //�޷�, ���а����� getInstance�� �����ͼ� ����
		
		//��������
		int curYear = cal.get(cal.YEAR); //����⵵
		int myYear,age; // �� ����⵵, ����
		String name,ddi; // �� �̸�, ��
		
		//�Է�
		System.out.println("�̸��Է�: ");
		name = sc.nextLine();
		System.out.println("����⵵: ");
		myYear = sc.nextInt();
		
		//���̰��
		age = (curYear-myYear)+1;
		
		//���׿����� �Ἥ �� ���� ���̰��ϱ�
		//����?"��":"����"
		// ������ ������ �϶� ���� if �� / ������ �ϳ�,�ΰ�,ª�ų�,��¹� �ȿ��� ���ٷ� ���� ���׿����� ����
		// �찡 12���ϱ� 11�� �� �����
		// ������ 12���� ������ ���ǹ� 11���� ����
		// ���ǿ� �ȸ´� �ֵ��� �� ����
		
		ddi = myYear%12==0?"������":
				myYear%12==1?"��":
				   myYear%12==2?"��":
					   myYear%12==3?"����":
						   myYear%12==4?"��":
							   myYear%12==5?"��":
								   myYear%12==6?"ȣ����":
									   myYear%12==7?"�䳢":	  
										   myYear%12==8?"��":
											   myYear%12==9?"��":
												   myYear%12==10?"��":"��";
		
		//�������
		System.out.println("[����, �� ���ϱ�]");
		System.out.println("�̸��� "+name);
		System.out.println("���̴� "+age);
		System.out.println("��� "+ddi+"��");
		
		
	}
}
