package day0208;

//�͸�Ŭ������ �߻�Ŭ������ ���� ���־���
abstract class AbstractEx{
	abstract public void play();
	abstract public void stop();
}
//////////////////////////
class Abst{//�͸�Ŭ����

	AbstractEx ab = new AbstractEx() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("������ ����ϴ�");
		}
		
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("������ �����մϴ�");
		}
	};	
}

///////////////////////////
public class AnonyEx_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abst abst = new Abst();
		abst.ab.stop();
		abst.ab.play();
		
	}

}
