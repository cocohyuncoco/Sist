package day0128;

public class StudentTestEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ������ �Ϸ��� ������ ��ü����
		/*
		 * Ŭ������ ��������(��������º�������)�� = new Ŭ������([��]); <-������ȣ��
		 * -�����Ҷ���
		 * ����������.������; <- private�� ���پȵ�
		 * ����������.�޼ҵ��; <-
		 * 
		 */

		Student07 stu1 = new Student07();

		//setter �޼��带 �̿��� �� ����,����
		stu1.setName("������");
		stu1.setAge(28);


		//getter�޼��带 �̿��� �� ���
		String name = stu1.getName();
		int age = stu1.getAge();

		//���
		System.out.println(name+","+age);

		//-----------------------
		//2��° ����� �����ڸ� ���� ����
		Student07 stu2 = new Student07("�̴ټ�",23);

		//get�޼��带 ���� ���
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());


	}

}
