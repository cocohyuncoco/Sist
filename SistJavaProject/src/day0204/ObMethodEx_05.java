package day0204;

public class ObMethodEx_05 {

	//�޼��� �����ε�
	public static int sum(int a, int b) {
		
		System.out.println("1��° �Լ� ȣ��");
		return a+b;
	}
	
	public static double sum(int a, double b) {
		
		System.out.println("2��° �Լ� ȣ��");
		return a+b;
	}
	
	public static double sum(double b, int a) {
		
		System.out.println("3��° �Լ� ȣ��");
		return a+b;
	}	
	
	public static double sum(double a, double b) {
		
		System.out.println("4��° �Լ� ȣ��");
		return a+b;
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� Ÿ�Կ� ���� �ڵ����� �ߺ��Լ��� ȣ���
		System.out.println(sum(3, 7));
		System.out.println(sum(4, 6.5));
		System.out.println(sum(7.7, 6));
		System.out.println(sum(7.7, 2.2));
		
		
	}

}
