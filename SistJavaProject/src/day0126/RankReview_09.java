package day0126;

import java.util.Iterator;

public class RankReview_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *�� �л����� ������ ���� ����,���,����� ���Ͽ� ���
		 *��ȣ �̸� �ڹ� ����Ŭ ���� ��� ���
		 */
		
		String []name= {"������","������","������","������","������"};
		int[] java= {99,78,89,67,100};
		int[] oracle = {77,66,88,99,56};
		
		//tot,avg,rank�� 5�� ������ ������ ����� for������
		int[] tot = new int[5];
		double[] avg = new double[5];
		int[] rank = new int[5];
		
		
		//������� ���ϱ�
		for (int i=0;i<name.length;i++) {
			//����
			tot[i]=java[i]+oracle[i];
			avg[i]=tot[i]/2.0;
			
		}
		
		//��� ���ϱ�
		for (int i=0;i<name.length;i++) {
			rank[i]=1;
			for (int j=0;j<name.length;j++) {
				//�ݺ��ϸ鼭 ������ ū ������ ������ �� ��� 1����
				if (tot[i]<tot[j]) 
					rank[i]++;
			}
		}
		
		//����ϱ�
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\t����\t���\t���");
		
		for (int i=0;i<name.length;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
			
		}
	}

}
