package day0209;
//���־��¾ֵ� ����
public class _13_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		//String aa = String.valueOf(a); //���������� ��ȯ����
		String aa =a+""; //����+���� �ϸ� ���ں�ȯ
		System.out.println(aa);
		
		char[] b= {'a','p','1','e'};
		String bb=String.valueOf(b);
		System.out.println(bb);
		
		String str="Happy my life!!";
		System.out.println(str.length());
		
		
		//substring(n) :n���� ������
		//substring(m, n) :m~(n-1)���� ����
		System.out.println(str.substring(6)); //my life!!
		System.out.println(str.substring(6, 9)); //my
		
		//���� �ٲٱ�
		String s1 = str.replace('a', '*');
		System.out.println(s1);
		
		String s2 = str.replace("Happy", "Wonderful");
		System.out.println(s2);
	
		
	}

}
