package day0203;

public class StudentInfo {

	private String stuName;
	private String hp;
	private int score;

	//디폴트 생성자
	public StudentInfo() {
		this("홍길동","010-222-3333",99);//3번호출
	}

	public StudentInfo(String name, String hp) {
		this(name,hp,99); //3번호출
	}

	//명시적 생성자#3
	public StudentInfo(String name, String hp, int score) {

		this.stuName = name;
		this.hp = hp;
		this.score = score;

	}

	//전체출력 메서드

	public void whileData() {

		System.out.println("이름: "+stuName);
		System.out.println("이름: "+stuName);
		System.out.println("이름: "+stuName);

	}





}
