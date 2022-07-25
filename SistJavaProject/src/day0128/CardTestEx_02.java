package day0128;

public class CardTestEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static 접근 테스트
		//클래스변수라 객체 생성 없이 그냥 밑에 방법으로 그냥 가져와진다.
		Card.width=10;
		Card.height=20;

		System.out.println(Card.width);
		System.out.println(Card.height);

		//인스턴스 변수 kind, number를 쓸려면 밑에처럼 객체생성을 해야한다.
		Card c1 = new Card();
		System.out.println(c1.kind); //null
		System.out.println(c1.number); //0

		c1.kind="Heart";
		c1.number=7;

		System.out.println(c1.kind); //null
		System.out.println(c1.number); //0

		Card c2 = new Card();
		c2.kind="Spade";
		c2.number=4;

		System.out.println(c1.kind+","+c1.number+","+Card.width+","+Card.height);
		System.out.println(c2.kind+","+c2.number+","+Card.width+","+Card.height);

		Card.width=50;
		Card.height=80;

		System.out.println(c1.kind+","+c1.number+","+Card.width+","+Card.height);
		System.out.println(c2.kind+","+c2.number+","+Card.width+","+Card.height);


	}

}

