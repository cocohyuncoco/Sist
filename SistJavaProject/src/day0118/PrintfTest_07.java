package day0118;

public class PrintfTest_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����:%d, �Ǽ�:%f, ����:%c, ���ڿ�:%s
		
		int num1=10, num2=20;
		int num3=num1+num2;
		
		System.out.println(num1+"+"+num2+"="+num3);
		
		//printf�� �̿�: num1�� ���� 10, num2�� ���� 20, num3�� ���� 30 �Դϴ�.
		System.out.printf("num1�� ����:%d, num2�� ����:%d, num3�� ����:%d �Դϴ�", 10, 20, 30);
		
		/*
		 Q. printf�� �̿��Ͽ� ����Ұ�, �������� name, age
		 �ȳ��ϼ��� �� �̸��� �������Դϴ�.
		 ���̴� 26�� �Դϴ�
		  */
		
		String name="������";
		int age=26;
		
		System.out.printf("\n�ȳ��ϼ��� �� �̸��� %s �Դϴ�. \n���̴� %d �Դϴ�", name, age);
	}

}
