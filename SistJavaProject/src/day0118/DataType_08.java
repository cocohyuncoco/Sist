package day0118;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� true, false
		boolean flag=false;
		
		//������ char �⺻������ ������, �ƽ�Ű�ڵ�� ��ȯ����
		char ch='��';
		
		//������ 
		byte a=-128; //1byte -128~127���� ����
		short b=32000; //2byte 
		int c=670000; // 32bit
		long num=100L; //���̻� �ʼ�. �ڿ�L(��,�ҹ��� �� ����)�� �ٿ��� ��ǻ�Ͱ� long���� �ν��ϳ�
		
		//�Ǽ���
		double d=4356.3452; //�Ҽ����� ���ڸ� �ǹ�, double�� �⺻�̶� ���̻� �Ⱥٿ���
		float e=3.1435F; //f�� �Ⱥ��̸� ��ǻ�Ͱ� double�� �ν��Ѵ�

		//int, float ���� 32bit�� ��������� �⺻������ �Ǽ����� �� ũ�� ó���Ѵ�
		
		System.out.println("flag="+flag);
		System.out.println("not flag="+!flag); //not�� �ǹ��ϴ� !
		System.out.println("ch="+ch);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("num="+num);
		System.out.println("f="+e);
	    System.out.printf("d=%10.2f\n",d); //��ü �ڸ��� 10�ڸ� �Ҽ��� 2�ڸ�
		System.out.printf("d=%.1f\n",d); //�Ҽ��� 1�ڸ�
		
	}

}
