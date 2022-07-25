package day0510.quiz;

public class info {
	
	Score score;
	
	String name;
	int age;
	
	public info(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;		
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
