package day0209;

public class _07_ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ȳ��ϼ���");
		System.out.println("5���� ������ô�");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ȳ���������");
	}

}
