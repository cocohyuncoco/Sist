package day0118;

public class ReferVarTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Ŭ���� �̿� ""�� ǥ��
		
		char a='A';
		char b='��';
		
		String str = "Hello";
		String str2 =new String("Happy Day");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		System.out.println(str2);
		
		// ����ܰ迡�� ���ڿ��� �о�ͼ� ������ ����
		String name=args[0];
		String ctiy=args[1];
		String age=args[2];
	
	
		//���
		System.out.println("�̸��� "+name+" ��������� "+ctiy+"�Դϴ�. ���̴�"+age+"�Դϴ�");
	
	
	
	
	
	}

}
