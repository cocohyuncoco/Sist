package day0208;


class OuterEx{
	
	int a=10;
	static int b=20; //��������
	
	class InnerEx{ //����Ŭ����
		
		int c=30;
		
		//static d = 40; //���ο��� static �������
		public void write() {
			System.out.println("�ܺκ��� a="+a);
			System.out.println("�ܺ� �������� b="+b);
			System.out.println("�ܺκ��� c="+c);
		}
		
		
	}
}

/////////////////////////////////////////
public class InnerEx_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterEx.InnerEx oie = new OuterEx().new InnerEx();
		oie.write();
		
		
	}

}
