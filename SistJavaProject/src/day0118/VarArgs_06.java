package day0118;

public class VarArgs_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �־ /**/
		/*
		 �� �̸��� ������
		 �ڹ������� 88
		 ����Ŭ������ 88
		 �� ������ �հ�� 176�� �Դϴ�
		 */
		
		//1. ��������
		String name = args[0];
		int java = Integer.parseInt(args[1]);
		int oracle=Integer.parseInt(args[2]);
		
		//2. ���
		int result=java+oracle;
		
		//3. ���
		System.out.println("�� �̸��� "+name+" �ڹ� ������ "+java+" ����Ŭ������ "+oracle+" �� ������ �հ�� "+result+"�Դϴ�");
		System.out.println("���̸��� "+name);
		System.out.println("�ڹ������� "+java);
		System.out.println("����Ŭ������ "+oracle);
		System.out.println("�ΰ����� �հ�� "+result+"�Դϴ�");
	}

}
