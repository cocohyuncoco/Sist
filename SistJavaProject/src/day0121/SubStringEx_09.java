package day0121;

public class SubStringEx_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "���� ���� �ֿ뱳�����Ϳ��� �ڹٸ� �������Դϴ�";
		int i = str.length();
		
		//���ڿ����� ��������
		char ch = str.charAt(4);
		String word1 = str.substring(3);
		String word2 = str.substring(6, 12);
		
		System.out.println(ch); //��...��ĭ�� index�� ����
		System.out.println(word1); //3��(��) ���� ������ ����
		System.out.println(word2); //endindex�� n-1���� ����
		System.out.println(i); // ���ڿ�����. ������� ����
		
		
	}

}
