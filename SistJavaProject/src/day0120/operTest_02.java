package day0120;

public class operTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=b=5;
		
		//������ ��쿡�� �տ� ���̳� �ڿ� ���̳� ����
		++a; // ���� a������ 1����
		b++; //b=b+1
		
		System.out.println("a="+a+", b="+b); //a=6, b=6

		// ���Ŀ��� ����Ҷ��� ��ġ ��ġ�� ������� Ʋ����
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //��ġ�� ��쿡�� ���� ���� �� ����
		System.out.println("m="+m+", a="+a);
		
		n=++b; //��ġ�� ��쿡�� ���� ���� �� ����
		System.out.println("n="+n+", b="+b);
	}

}
