package day0203_01;

public class TestP {

	private TestP() { //private�� �̷� ������ �ֱ����� �׽�Ʈ �غ���
		System.out.println("����Ʈ������");
	}

	public static TestP getInstance() { 
		return new TestP();
	}

	public void writMessage() { 
		System.out.println("�ȳ��ϼ���..");
		System.out.println("�Ϲ� �޼��� �Դϴ�");




	}



}
