package day0203;
class TestA{
	String name="�̿��";  //<- �ν��Ͻ� ����, new������ ���� ��� �Ұ���
	static String MESSAGE="***Happy Day!!!***"; //<-���
}
//////////////////////////////////

public class ObTestReview_01 {

	int a; // ���亯�� (�ڵ����� �ʱ�ȭ�Ǵ� ����)
	static int b; //Ŭ�������� Ȥ�� �������� (���� ������Ʈ�� �������� ���), static�� new������ ���� ����, ��� ����


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޼��� �ȿ� �ִ� ������ ��������. �ʱ�ȭ �׻� ���࿩��. �ʱ�ȭ �ڵ����� �Ƚ�����
		//���������� �޼��� �ȿ����� �����ִ�.

		//static������ �ٷ� ��� ����
		b=20;
		System.out.println("b="+b);

		// �ν��Ͻ� ������ �ν��Ͻ��� �־�� ���� ����
		ObTestReview_01 ob1 = new ObTestReview_01();
		ObTestReview_01 ob2 = new ObTestReview_01();

		ob1.a=10;
		ob2.a=30;

		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);

		//static���� Ŭ���������� ����
		System.out.println("��������b="+ObTestReview_01.b); //�������Ѱ�
		System.out.println("��������b="+b); //�����Ѱ�

		//TestA
		TestA ta = new TestA();

		ta.name="������";
		System.out.println("ta.name="+ta.name);
		System.out.println(TestA.MESSAGE);


		TestA.MESSAGE="�ȳ�";
		System.out.println(TestA.MESSAGE);



	}

}

