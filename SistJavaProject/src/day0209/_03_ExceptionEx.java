package day0209;

/*
 * RunTimeException: �������Ҷ��� ������ ������ ���� �� �����߻�
 * NullpointException: ���������ʰ� �޼��� ȣ��
 * Numberformat: �Էµ����� ���Ŀ���
 * ArryaIndexOutOfBounce: ���ڿ��� �ε�������..������ �ʰ�������
 * 
 * 
 */
public class _03_ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���α׷� ����");
		try {
			int num = 3/0; //���ܰ� �߻��Ҽ� �ִ� �ڵ�
		}catch (ArithmeticException e) {//�ذ����ټ��ִ� 
			// TODO: handle exception
			//e.printStackTrace(); //�ڼ��� �������� ���
			System.out.println(e.getMessage()); //����ó�� �ڵ�, �޼���
		}
		
		System.out.println("����");
	}

}
