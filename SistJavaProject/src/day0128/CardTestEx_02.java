package day0128;

public class CardTestEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static ���� �׽�Ʈ
		//Ŭ���������� ��ü ���� ���� �׳� �ؿ� ������� �׳� ����������.
		Card.width=10;
		Card.height=20;

		System.out.println(Card.width);
		System.out.println(Card.height);

		//�ν��Ͻ� ���� kind, number�� ������ �ؿ�ó�� ��ü������ �ؾ��Ѵ�.
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

