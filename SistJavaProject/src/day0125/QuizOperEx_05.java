package day0125;

import java.util.Scanner;

public class QuizOperEx_05 {
	//���� �����Ѱ͵� ���� <6����>
	public static void ex_01() {
		/*
		 * for������ 10�� ���� �Ұ�
		 * 1. 21
		 * 2. -23
		 * 
		 * 
		 * 10. 88
		 * 
		 * �������:4��
		 * ��������:6��
		 * 0�� �ִٸ� 5�� ������ 6��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		int pcnt=0; //��� ����
		int ncnt=0; //���� ����
		
		for (int i=1;i<=10;i++) {
			System.out.print(i+": ");
			su=sc.nextInt();
			if (su>0) { //0���� ũ�� ���
				pcnt++;
			}else if(su<0) { //0���� ������ ����
				ncnt++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("�������: "+pcnt);
		System.out.println("��������: "+ncnt);
	}
	
	
	
	public static void ex_02() {
		
		/*
		 * while(true)�� �̿��Ұ�
		 * continue�� �̿��Ͽ� 1~100������ ¦���� ���� ���Ͻþ�
		 * 1~100������ ¦���� ��: ****
		 */
		
		int a=0;
		int sum=0;
		
		while (true) {
			a++;
			//Ȧ���� �������� ���ǹ�
			if (a%2==1) 
				continue; //Ȧ���� ù�ٷ� �̵�
			sum+=a; //¦���� ��쿡�� ���� ���Ѵ�
			if(a==100)
				break;
		}
		System.out.print("1~100������ ¦���� ��: "+sum);
	}
	
	public static void ex_03() {
		
		/*
		 * while(true)���� �Ἥ 1~100������ 3�� ����� ������ ���Ͻÿ� (�����Ӱ�)
		 * 3�ǹ�� ����:33
		 */
		
		int i=0;
		int z=0;
		
		while (true) {
			i++;
			//3�� ����̸� z�� 1���� ���ǹ�
			if (i%3==0)
				z++;
			else if(i==100)
				break;
		}
		System.out.println("3�� �������: "+z);
	}

	
	public static void ex_04() {
		
		/*
		 * while(true)���� �̿��Ұ�
		 * 1~10���� ���丮�� ���Ұ�
		 * 
		 * 
		 * 8!=****
		 * 9!=****
		 * 10!=****
		 */
		
		int pac=1;
		int i=0;
		
		while (true) {
			i++;
			pac*=i;
			System.out.println(i+"!="+pac);
			if(i==10)
			break;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex_01();
		//ex_02();
		//ex_03();
		ex_04();
	}

}
