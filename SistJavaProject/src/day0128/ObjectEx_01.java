package day0128;

public class ObjectEx_01 {


	//�ν��Ͻ� ����
	//��ü���� �� ���� �ٸ����� �������ִ�
	String name; //null�� �ʱ�ȭ

	//������ü�� ���� ���� �������� ��� static�ַ� ����
	//��ü�������� ���� �����ϴ�...Ŭ������.����
	//final ���� ���� �ٲܼ�����
	static final String MESSAGE="Happy Day!!";
	//����� �� �빮�ڷ� ����
	//static �� �ַ� ��� �����Ҷ� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("static ��������� new�� �������� ȣ�Ⱑ���ϴ�");
		System.out.println(MESSAGE);//���� Ŭ���� ������ Ŭ������ ��������

		//MESSAGE="Nice!"; //���� -final

		//�ν��Ͻ� ������ ��ü�������� ��� ���� �Ұ���
		ObjectEx_01 kd = new ObjectEx_01();

		kd.name = "ȫ�浿";
		System.out.println(kd.name);

		ObjectEx_01 ar = new ObjectEx_01();
		ar.name="���ƶ�";

		System.out.println(ar.name);
		
		// MESSAGE ="��"; <- final ������ ���θ޼��忡�� ���� ���ٲ���. ����
 		System.out.println("�ٰ��� ����ϴ� �޼���: "+MESSAGE);




	}

}
