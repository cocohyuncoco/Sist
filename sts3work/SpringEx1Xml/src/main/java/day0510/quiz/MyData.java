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
		System.out.println("�̸�: "+info.name);
		System.out.println("����: "+info.age);
		System.out.println("��������: "+score.getKor());
		System.out.println("��������: "+score.getEng());
		System.out.println("��������: "+score.getMat());
		
	}
}
