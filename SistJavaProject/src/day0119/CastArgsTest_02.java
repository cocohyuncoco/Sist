package day0119;

public class CastArgsTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Q�̸� ������
		 * JAVA����: 88
		 * JSP����: 99
		 * �հ�: 187
		 */
		
		//1. ����...�Ű����� args�� �̿��� ���� _ name,java,jsp
		String name="������";
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);

		//2. ���..tot
		int tot = java+jsp;
		
		//3. ���
		System.out.println("�̸�: "+name);
		System.out.println("JAVA����: "+java);
		System.out.println("JSP����: "+jsp);
		System.out.println("�հ�: "+tot);
		
		
	}

}
