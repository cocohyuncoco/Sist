package day0203;


class score{

	private String name;
	private int java;
	private int spring;

	public static final String TITLE ="--중간고사 시험결과--";


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	//추가메서드 /메서드로 웬만한거 다 만들어놓고 메인에서 최소한으로 호출하는게 좋은 코딩
	public int getTot() {

		int s = this.java+this.spring;
		return s;

		//retrun java+string
	}

	public double getAvg() {
		return getTot()/2.0;
	}
}
////////////////////////////////////
public class ObScore_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		score s = new score();

		s.setName("박지윤");
		s.setJava(90);
		s.setSpring(87);

		int tot = s.getTot(); //이렇게들 많이씀
		double avg = s.getAvg();

		System.out.println("**score클래스**");
		System.out.println(score.TITLE);  // 타이틀을 불러올땐 무조건 클래스.변수

		System.out.println("이름: "+s.getName());
		System.out.println("자바점수: "+s.getJava());
		System.out.println("스프링점수: "+s.getSpring());

		System.out.println("합계: "+tot);
		System.out.println("평균: "+avg);

		//메인 코드는 아주아주 간단해질수록 좋다






	}

}

