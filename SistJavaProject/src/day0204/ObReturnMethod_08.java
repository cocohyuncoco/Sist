package day0204;

public class ObReturnMethod_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�μ��� ��: "+add(10, 20));
		System.out.println("���� ����: "+square(4.5));
		divide(6, 2);
		divide(3, 0);
		divide(4, 2);
		
	}
	
	public static int add(int num1, int num2) {
		
		int result = num1+num2;
		return result;	
	}

	public static double square(double num) {
		return num*num; //������ �ٷ� �ص� �ȴ�. ��õ���� ������
	}
	
	public static void divide(int num1, int num2) {
		
		if (num2==0) { // �ڹٿ����� 0���� ������ ���ڰ� ���ü����� ����������.
			System.out.println("0���δ� ������ �����ϴ�");
			return; //�޼����� ����
		}
		
		System.out.println("������ ���: "+num1/num2);
		
		
		
	}
	
	
	
	
	

}
