package day0127;

import java.util.Scanner;

public class ArraysBinggoEx_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] pz=new int[3][3];

		int binggo=0;

		while (true) 
		{
			System.out.println("**���� ���ڰ� ������ ����!!**");

			//1~3������ �����߻�(�������߻�)
			for (int i=0;i<pz.length;i++)//�� 
			{
				for (int j=0;j<pz[i].length;j++)//�� 
				{
					pz[i][j]=(int)(Math.random()*3)+1;
				}
			}
			//�����ʱ�ȭ
			binggo=0;

			//���
			for (int i=0;i<pz.length;i++) 
			{
				for (int j=0;j<pz[i].length;j++) 
				{
					System.out.printf("%4d",pz[i][j]);		
				}
				System.out.println();
			}		

			//�������ǹ�
			//���ι��� 3��, ���ι��� 3��
			for (int i=0;i<pz.length;i++)
			{
				//���ι��� ��
				if (pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2]) 
					binggo++;
				//���ι��� ��
				if (pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i]) 
					binggo++;
			}

			//�밢�� /
			if (pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0]) 
				binggo++;
			//�밢�� \
			if (pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2]) 
				binggo++;

			//�������
			if (binggo==0) 
				System.out.println("\t��!!!!");
			else
				System.out.println("\t����"+binggo+"��");

			System.out.println("���͸� ������ ���� ������ �߻��մϴ�(����:Q)");
			String ent = sc.nextLine();

			if (ent.equalsIgnoreCase("Q")) {
				System.out.println("****������� �����մϴ�****");
				break;
			}
		}
		System.out.println("-----------���α׷� ����-----------");
	}

}
