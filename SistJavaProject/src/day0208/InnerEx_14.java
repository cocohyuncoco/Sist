package day0208;

class server1{
	
	int a=10;
	static int b=20;
	
	static class Client1{//����Ŭ����
		//����Ŭ�������� static �����ϰ� ������ ����Ŭ���� Ÿ���� static���� �ָ�ȴ�
		int c=30;
		static int d=40; 
		
		public void while2() {
			//System.out.println("�ܺ��Ϲݺ��� a="+a); //���پȵȴ�
			System.out.println("static Ŭ���� ���ο����� �ܺ�Ŭ���� a=<�Ϲ�>���� ���پȵ�");
			System.out.println("�ܺ�static���� b="+b);
			System.out.println("�����Ϲݺ��� c="+c);
			System.out.println("����static���� d="+d);
			
			System.out.println("�ܺ�Ŭ���� <static>������ ���ٰ���");
		}
	}
}
public class InnerEx_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static����Ŭ���� �ҷ����� ����� ���� Ʋ����
		server1.Client1 c1 = new server1.Client1();
		c1.while2();
	}

}
