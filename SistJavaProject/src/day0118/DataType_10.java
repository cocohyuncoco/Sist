package day0118;

public class DataType_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ƽ�Ű�ڵ� A=65
		// ������ ����ȯ�� �ڵ����� �����Ǵ°�
		// string+int=string
		// double+int=double
		// long+short=long
		//char+int=int
		
		char a='A';
		System.out.println(a); //A
		System.out.println(a+32); //97
		System.out.println((char)(a+32)); //a
	
		//char�� ���������� �ƽ�Ű�ڵ� ������ �ν�
		
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3);
		System.out.println(2+'b');
		System.out.println('a'+'b'); //97+98=195
		
		//printf�� �̿��ϴµ� �ƽ�Ű ���ڷθ� JAVA��� ���
		System.out.printf("%c%c%c%c\n", 74, 65, 86, 65); // %c�� char(����)
	}

}
