package day0118;

public class DataType_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=-127; // -128~127
		
		
		 byte b=(byte)128; //�� ���� �ڷ��������� ��ȯ(����), �� �ս�
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//��������ȯ(cast������) �ٸ��� ���
		
		int x=7;
		int y=4;
		
		System.out.println(x/y); //������������ ����� ������ ������
		System.out.println((double)x/y); //double�� ��ȯ.. ����� double
		System.out.println(x/(double)y); //������ double������� ����� doubleŸ��
		
		double d=100.0;
		int i=100;
		int result=(int)d+i;
		double result2=(double)i+d;
		
		System.out.println("result="+result);
		System.out.println("result2="+result2);		
				
	} 

}
