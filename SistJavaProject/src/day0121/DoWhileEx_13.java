package day0121;

public class DoWhileEx_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;		
		System.out.println("while�� ���");
		
		//������ ���ϵ��� �ݺ�
		//������ ���� ��
		
		while (i<5) {
			System.out.println(i++); //����� ����
		}
		
		System.out.println("do~while�� ���");
		
		i=1;
		//������ �Ŀ� ���´�
		do {
			System.out.println(i++);
		} while (i<5);
		System.out.println("����");
		
		
		
		
	}

}
