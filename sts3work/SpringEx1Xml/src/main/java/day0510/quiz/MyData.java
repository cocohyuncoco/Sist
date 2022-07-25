package day0510.quiz;

public class MyData {

	Score score;
	info info;
	
	public MyData(Score score, info info) {
		// TODO Auto-generated constructor stub
		this.score=score;
		this.info=info;
	}
	
	public void writeData() {
		System.out.println("이름: "+info.name);
		System.out.println("나이: "+info.age);
		System.out.println("국어점수: "+score.getKor());
		System.out.println("영어점수: "+score.getEng());
		System.out.println("수학점수: "+score.getMat());
		
	}
}
