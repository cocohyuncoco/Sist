package day0128;

public class StuInfoTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo stu1 = new StudentInfo();
		StudentInfo stu2 = new StudentInfo();

		stu1.name="������";
		stu1.age=18;

		stu2.name="������";
		stu2.age=19;

		StudentInfo.schoolName="�ֿ����б�";

		System.out.println("**Ŭ���� ����� ���**");
		System.out.println("�б���:"+StudentInfo.schoolName);
		System.out.println("**�л�1 ����**");
		System.out.println("�̸�:"+stu1.name+" ����:"+stu1.age);

		System.out.println("**�л�2 ����**");
		System.out.println("�̸�:"+stu2.name+" ����:"+stu2.age);


	}

}
