package book;

/*
 * ���������� ����ȯ
 * �⺻�������� ���� ���������� ����ȯ�� �����ϴ�, ��
 * 
 * 1. �ڼ�Ÿ�� -> ����Ÿ�� (Up-casting) ��ĳ���� : ����ȯ ��������
 * 2. �ڼ�Ÿ�� <- ����Ÿ�� (Down-casting) �ٿ�ĳ���� : ����ȯ �����Ұ�
 * ���� �ٲٴ� �� ��ȯ�� �����ϴ�
 * 
 * ��� ���������� ��� Ŭ������ ������ ObjectŬ������ Ÿ������ ����ȯ�� �����ϴ�
 * 
 * �⺻�� ������ ����ȯ���� ���� �ڷ������� ū �ڷ����� ����ȯ�� �������� �ϵ���
 * ������ ������ ����ȯ������ �ڼ�Ÿ���� ���������� ����Ÿ������ �⺯ȯ�ϴ� ��쿡�� ����ȯ�� �����Ҽ��ִ�
 * 
 * ���¹���?
 * ������������ ����ȯ ���� ĳ��Ʈ�����ڸ� ��� �ϸ�
 * ��ȣ()�ȿ� ��ȯ�ϰ��� �ϴ� Ÿ���� �̸�(Ŭ������)�� �����ָ� �ȴ�
 */
import day0128.Card;

class Car{//�θ�Ŭ���� ��
	String color;
	int door;
	
	public void drive() { //�����ϴ±��
	System.out.println("drive, brrrr~");
	}
	
	public void stop() { //���ߴ±��
		System.out.println("stop!!!!!!");
		}
}

 class FireEngine extends Car{ //�ڽ�Ŭ���� //�ҹ���
	 public void water() { //���Ѹ��±��
		 System.out.println("watar!!!!!!");
			}
 }
/////////////////////////////
public class Chap359_7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Car car=null;
		Car car;
		
		FireEngine fe = new FireEngine();
		fe.water();
		car = fe; // car=(Car)fe; ���� ����ȯ�� ������ ���´�
		//car.water(); <-�����Ͽ���. CarŸ���� ���������δ� water�� �ҷ��ü�����.water();�� �ڽ�Ŭ������ �ֱ⶧����
				
		
		//FireEngine fe2 = null;
		FireEngine fe2;		
		fe2=(FireEngine)car; //�ڼ�Ÿ�� <- ����Ÿ�� : �ٿ�ĳ������ �̷��� �� ����� ����
		fe2.water();
		
		
		
		
	}

}
