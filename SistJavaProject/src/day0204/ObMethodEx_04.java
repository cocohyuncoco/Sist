package day0204;
/*
 * �޼��� ����
 * �Ѹ� �����θ� ��Ȱ�� ���� (�ڵ� ���ϼ��ִ�)
 * 
 * �ۼ���� 
 * 1. ���������� public
 * 2. ��������� static(�������ְ� �Ⱦ������ְ�)
 * 3. ���� �� retrue
 * 4. ���� ���� ���ٴ� void
 * 5. �̸�
 * 6. �޼����(���ڰ�1, 2, 3....)
 * 
 *  ��
 *  public static ������(void) �޼���� (���ڰ�1, 2, 3...)
 *  
 *  1. �ݺ����� �ڵ带 �ٿ� ���������� ��
 *  2. �ϳ��� �޼��忡�� �ϳ��� ��ɸ� �����ϵ��� �ۼ�
 * 
 */
public class ObMethodEx_04 {

	//boolean ��
	public static boolean aaa() {
		return false;
	}
	//int ��
	public static int bbb() {
		int a=45;
		return a;
	}
	//int ���� 2��
	public static int ccc(int x, int y) {
		int z=x+y;
		return z;
	}
///////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = aaa();
		System.out.println("a="+a);
	
		int b = bbb();
		System.out.println("b="+b);
	
		int c = ccc(20,30);
		System.out.println("c="+c); 
	}

}
