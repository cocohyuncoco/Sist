package day0119;

public class CastArgeTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name=args[0];
//		String age=args[1];
		
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : "+age);

		//���ڸ� �Ķ��Ÿ�� ������ ���ڿ��� �������� 
		int num1 =Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);

		int sum =num1+num2;
		int sub =num1-num2;
		int mul =num1*num2;
		double div =(double)num1/num2;
		
		System.out.println("�μ��� �� "+sum);
		System.out.println("�μ��� �� "+sub);
		System.out.println("�μ��� �� "+mul);
		System.out.println("�μ��� ������ "+div);
		
	}

}
