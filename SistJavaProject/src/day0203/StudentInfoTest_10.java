package day0203;

public class StudentInfoTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo []stu = new StudentInfo[3];
		
		stu[0] = new StudentInfo();
		stu[1] = new StudentInfo("�̼���","010-3333-9999");
		stu[2] = new StudentInfo("������","010-3333-9999",88);
		
		//�迭�� �̿��Ͽ� �ν��Ͻ� ��ü����, �޼��� ȣ�� �ѹ���
		
		for(int i=0;i<stu.length;i++)
		{
			//��ü����
			StudentInfo s = stu[i];
			s.whileData();
			System.out.println("---------------------");
		}
		
	}

}
