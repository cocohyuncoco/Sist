package day0126;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysScanChange_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �Է��� �л��� �ο����� ��������� ǥ�� �� �л��� �̸��� ������ �Է��� ���
		 * �հ�� ��յ� ���غ���
		 */
		
		int inwon;
		String[] name;
		int[] score;
		int[] rank;
		int tot=0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο����� �Է��Ͻÿ�");
		inwon = Integer.parseInt(sc.nextLine()); //�ڿ� �̸� ���ڿ��� ������
		
		//�ο����� �̸�,������ �迭 �Ҵ�
		name=new String[inwon];
		score=new int[inwon];
		rank=new int[inwon];
		
		//�ο��� ��ŭ �����͸� �Է�
		for (int i=0;i<inwon;i++) {
			System.out.println(i+"��° �л���");
			name[i] = sc.nextLine();
			System.out.println(i+"��° �л�����");
			score[i] = Integer.parseInt(sc.nextLine());
			//����
			tot+=score[i];	
		}
		
		//������ϱ� ����(����for��)
		for (int i=0;i<inwon;i++) {
			rank[i]=1;
			for (int j=0;j<inwon;j++) {
				//�񱳵Ǵ� ����� ������ �� ������ i������� 1����
				if (score[i]<score[j]) {
					 rank[i]++;		
				}
			}
		}
		
		
		//���
		avg=(double)tot/inwon;
		
		//���
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println("-----------------------------");
		
		for (int i=0;i<inwon;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
			
		}
		System.out.println("-----------------------------");
		System.out.println("����\t\t"+tot);
		System.out.println("���\t\t"+avg);
		
		
		
		
		
		
	}

}
