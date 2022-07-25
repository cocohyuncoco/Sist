package day0207;


class School{
	
	private String schoolAddr; //학교주소
	private int countStu; //학생수
	private int countTeacher; //교사수
	protected static final String SCHOOLNAME="노원고등학교";
	
	//디폴트
	public School() {
		// TODO Auto-generated constructor stub
		this("노원구", 200, 20);
	}
	
	//명시적
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
	
	//출력메서드
	
	public void writeData() {
		System.out.println("학교주소: "+schoolAddr);
		System.out.println("학생수: "+countStu+"\n교사수: "+countTeacher);
	}



	
}
/////////////////////////////////////////
class student extends School{ //sub
	
	private String stuName;
	private int score;
	
	public student() {
		// TODO Auto-generated constructor stub
		this("노원구", 200, 20, "김동규", 90);
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
			System.out.println("학교명: "+SCHOOLNAME);
			super.writeData();
			System.out.println("학생이름: "+stuName);
			System.out.println("점수: "+score);
		}
	
	
}
////////////////////////////////////////
public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st1 = new student("기흥구", 800, 80, "임현정", 100);
		st1.writeData();
		System.out.println("---------------------");
		
		student st2 = new student();
		st2.writeData();
		System.out.println("---------------------");
		
	}

}
