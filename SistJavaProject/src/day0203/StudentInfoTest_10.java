package day0203;

public class StudentInfoTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo []stu = new StudentInfo[3];
		
		stu[0] = new StudentInfo();
		stu[1] = new StudentInfo("이순신","010-3333-9999");
		stu[2] = new StudentInfo("조민진","010-3333-9999",88);
		
		//배열을 이용하여 인스턴스 객체생성, 메서드 호출 한번에
		
		for(int i=0;i<stu.length;i++)
		{
			//객체생성
			StudentInfo s = stu[i];
			s.whileData();
			System.out.println("---------------------");
		}
		
	}

}
