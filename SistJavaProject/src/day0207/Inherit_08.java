package day0207;


class School{
	
	private String schoolAddr; //�б��ּ�
	private int countStu; //�л���
	private int countTeacher; //�����
	protected static final String SCHOOLNAME="�������б�";
	
	//����Ʈ
	public School() {
		// TODO Auto-generated constructor stub
		this("�����", 200, 20);
	}
	
	//�����
	public School(String s, int c, int t) {
		// TODO Auto-generated constructor stub
		this.schoolAddr=s;
		this.countStu=c;
		this.countTeacher=t;
	}

	//setter, getter
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountStu() {
		return countStu;
	}

	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}

	public int getCountTeacher() {
		return countTeacher;
	}

	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}
	
	//��¸޼���
	
	public void writeData() {
		System.out.println("�б��ּ�: "+schoolAddr);
		System.out.println("�л���: "+countStu+"\n�����: "+countTeacher);
	}



	
}
/////////////////////////////////////////
class student extends School{ //sub
	
	private String stuName;
	private int score;
	
	public student() {
		// TODO Auto-generated constructor stub
		this("�����", 200, 20, "�赿��", 90);
	}
	
	public student(String s, int c, int t, String sname, int score) {
		// TODO Auto-generated constructor stub
		super(s,c,t);
		this.stuName=sname;
		this.score=score;		
	}	
	
	
	//setter, getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
		public void writeData() {
			// TODO Auto-generated method stub
			System.out.println("�б���: "+SCHOOLNAME);
			super.writeData();
			System.out.println("�л��̸�: "+stuName);
			System.out.println("����: "+score);
		}
	
	
}
////////////////////////////////////////
public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st1 = new student("���ﱸ", 800, 80, "������", 100);
		st1.writeData();
		System.out.println("---------------------");
		
		student st2 = new student();
		st2.writeData();
		System.out.println("---------------------");
		
	}

}
