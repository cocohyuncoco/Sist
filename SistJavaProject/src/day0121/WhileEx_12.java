package day0121;

public class WhileEx_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. while��(��Ȯ�� ������ �� ���)
		// Java1 ~ Java5���� ��� �� ������ ǥ���Ұ�
		int i=1;
		
		while (i<=5) 
		{
			System.out.println("Java"+i);
			i++;
		}
		System.out.println("����");
		
		// 2.while��(��Ȯ�� ������ �𸦶�)
		// Hello1~Hello5 ������ ��� �� ������ ǥ��
		// �̰� ���� ����
		int a=1;
		while (true) {
			System.out.println("hello"+a);
			a++;
			//break���� �ݵ�� �ٰ�;
			if(a>5)
			break;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
