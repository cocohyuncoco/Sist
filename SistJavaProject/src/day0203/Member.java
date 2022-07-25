package day0203;

public class Member {
	
	private String name;
	private String gender;
	private String addr;

	static String ban;
	static int cnt = 0;

	//수정메서드(인자3개짜리)
	public void setData(String name, String gender, String addr) {
		
		this.name = name;
		this.gender = gender;
		this.addr = addr;
	}

	//출력 메서드
	public void getData() {
		cnt++;
		System.out.println("[학생"+cnt+"정보]");
		System.out.println("이름: "+this.name);
		System.out.println("소속학급: "+Member.ban);
		System.out.println("성별: "+this.gender);
		System.out.println("주소: "+this.addr);
		System.out.println("-------------------------");

	}
	

	
	

}

