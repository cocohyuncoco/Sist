package day0118;

public class QuizDateType_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���� �Ķ��Ÿ������ 3������ ������ �о ������ ����� ����Ͻÿ�
		 (�Ҽ��� ���� 2�ڸ�)
		 ������ java, jsp, spring, tot
		 java=88, jsp=77, spring=68
		 ����=233
		 ���=77.66
		 */
		
		//1.����
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		
		//2.���
		int tot=java+jsp+spring;
		
		//3.���
		System.out.println(tot);
		
		double avg=tot/3.0;
		System.out.printf("java=%d,jsp=%d,spring=%d\n", java, jsp, spring);
		System.out.printf("����: "+tot);
		System.out.printf("\n���: %.2f\n", avg);
	}

}
